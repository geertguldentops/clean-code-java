package be.jidoka.clean.code.tell.dont.ask.doinstead.application;

import be.jidoka.clean.code.tell.dont.ask.doinstead.domain.Order;
import be.jidoka.clean.code.tell.dont.ask.doinstead.domain.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FinaliseOrderServiceTest {

    private OrderRepository orderRepository = mock(OrderRepository.class);

    private final FinaliseOrderService finaliseOrderService = new FinaliseOrderService(orderRepository);

    @Test
    public void shouldCalculateFinalPriceAndSaveOrder_OnFinalise_WithValidOrder() {
        final Order order = mock(Order.class);
        final BigDecimal discount = new BigDecimal("0.1");

        finaliseOrderService.finalise(order, discount);

        verify(order).applyDiscount(discount);
        verify(orderRepository).save(order);
    }

}
