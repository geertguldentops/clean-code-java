package be.jidoka.clean.code.tell.dont.ask.doinstead.application;

import be.jidoka.clean.code.tell.dont.ask.doinstead.domain.Order;
import be.jidoka.clean.code.tell.dont.ask.doinstead.domain.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class FinaliseOrderServiceTest {

    private final OrderRepository orderRepository = mock(OrderRepository.class);

    private final FinaliseOrderService finaliseOrderService = new FinaliseOrderService(orderRepository);

    @Test
    void shouldCalculateFinalPriceAndSaveOrder_onFinalise_withValidOrder() {
        var order = mock(Order.class);
        var discount = new BigDecimal("0.1");

        finaliseOrderService.finalise(order, discount);

        verify(order).applyDiscount(discount);
        verify(orderRepository).save(order);
    }

}
