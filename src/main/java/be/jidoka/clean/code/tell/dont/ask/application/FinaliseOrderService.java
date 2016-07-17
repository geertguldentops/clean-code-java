package be.jidoka.clean.code.tell.dont.ask.application;

import be.jidoka.clean.code.tell.dont.ask.domain.Order;
import be.jidoka.clean.code.tell.dont.ask.domain.OrderRepository;

import java.math.BigDecimal;

// Denotes a transaction boundary
// @ApplicationService
public class FinaliseOrderService {

    private final OrderRepository orderRepository;

    public FinaliseOrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void finalise(Order order, BigDecimal discount) {
        // Tell the order to apply the discount, notice how our dependency on OrderLine has disappeared!
        order.applyDiscount(discount);

        orderRepository.save(order);
    }

}
