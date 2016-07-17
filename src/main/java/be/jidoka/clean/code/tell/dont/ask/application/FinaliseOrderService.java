package be.jidoka.clean.code.tell.dont.ask.application;

import be.jidoka.clean.code.tell.dont.ask.domain.Order;
import be.jidoka.clean.code.tell.dont.ask.domain.OrderLine;
import be.jidoka.clean.code.tell.dont.ask.domain.OrderRepository;

import java.math.BigDecimal;
import java.util.List;

// Denotes a transaction boundary
// @ApplicationService
public class FinaliseOrderService {

    private final OrderRepository orderRepository;

    public FinaliseOrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void finalise(Order order, BigDecimal discount) {
        final OrderLine orderLineWithLowestPrice = getOrderLineWithLowestPrice(order);
        applyDiscount(orderLineWithLowestPrice, discount);

        orderRepository.save(order);
    }

    private void applyDiscount(OrderLine orderLineWithLowestPrice, BigDecimal discount) {
        final BigDecimal lowestPrice = orderLineWithLowestPrice.getPrice();
        final BigDecimal appliedDiscount = lowestPrice.multiply(discount);
        final BigDecimal discountedPrice = lowestPrice.subtract(appliedDiscount);

        orderLineWithLowestPrice.setPrice(discountedPrice);
    }

    private OrderLine getOrderLineWithLowestPrice(Order order) {
        final List<OrderLine> orderLines = order.getOrderLines();
        orderLines.sort((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()));

        return orderLines.get(0);
    }

}
