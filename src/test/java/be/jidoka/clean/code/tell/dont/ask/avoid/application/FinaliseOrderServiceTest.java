package be.jidoka.clean.code.tell.dont.ask.avoid.application;

import be.jidoka.clean.code.tell.dont.ask.avoid.domain.Order;
import be.jidoka.clean.code.tell.dont.ask.avoid.domain.OrderLine;
import be.jidoka.clean.code.tell.dont.ask.avoid.domain.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FinaliseOrderServiceTest {

    private OrderRepository orderRepository = mock(OrderRepository.class);

    private final FinaliseOrderService finaliseOrderService = new FinaliseOrderService(orderRepository);

    @Test
    public void shouldCalculateFinalPriceAndSaveOrder_OnFinalise_WithValidOrder() {
        final Order order = new Order();
        order.addLine(new OrderLine("Clean code", new BigDecimal("50.00"), 1));
        order.addLine(new OrderLine("Java Concurrency in practice", new BigDecimal("99.99"), 2));

        assertThat(order.calculateTotal()).isEqualTo("249.98");

        final BigDecimal discount = new BigDecimal("0.1");
        finaliseOrderService.finalise(order, discount);

        // With isEqualTo 5.0 != 5.00; By using isEqualByComparingTo we automatically ignore trailing 0 (which are mathematically insignificant anyway).
        assertThat(order.calculateTotal()).isEqualByComparingTo("244.98");

        verify(orderRepository).save(order);
    }

}
