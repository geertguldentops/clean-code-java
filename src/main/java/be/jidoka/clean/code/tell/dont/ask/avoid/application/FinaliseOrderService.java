package be.jidoka.clean.code.tell.dont.ask.avoid.application;

import be.jidoka.clean.code.tell.dont.ask.avoid.domain.Order;
import be.jidoka.clean.code.tell.dont.ask.avoid.domain.OrderLine;
import be.jidoka.clean.code.tell.dont.ask.avoid.domain.OrderRepository;

import java.math.BigDecimal;

import static java.util.Comparator.comparing;

// Denotes a transaction boundary
// @ApplicationService
public class FinaliseOrderService {

    private final OrderRepository orderRepository;

    public FinaliseOrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void finalise(Order order, BigDecimal discount) {
        var orderLineWithLowestPrice = getOrderLineWithLowestPrice(order);
        applyDiscount(orderLineWithLowestPrice, discount);

        orderRepository.save(order);
    }

    private OrderLine getOrderLineWithLowestPrice(Order order) {
        // Ask an Order for its OrderLines.
        var orderLines = order.getOrderLines();
        orderLines.sort(comparing(OrderLine::getPrice));

        return orderLines.get(0);
    }

    private void applyDiscount(OrderLine orderLineWithLowestPrice, BigDecimal discount) {
        // Ask an OrderLine for its price.
        var lowestPrice = orderLineWithLowestPrice.getPrice();
        var appliedDiscount = lowestPrice.multiply(discount);
        var discountedPrice = lowestPrice.subtract(appliedDiscount);

        orderLineWithLowestPrice.setPrice(discountedPrice);
    }

}
