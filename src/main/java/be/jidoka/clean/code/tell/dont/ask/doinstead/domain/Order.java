package be.jidoka.clean.code.tell.dont.ask.doinstead.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.ZERO;
import static java.util.Comparator.comparing;

public class Order {

    private final List<OrderLine> orderLines = new ArrayList<>();

    public void addLine(OrderLine orderLine) {
        this.orderLines.add(orderLine);
    }

    // This getter has become redundant!
//    public List<OrderLine> getOrderLines() {
//        return orderLines;
//    }

    public BigDecimal calculateTotal() {
        return orderLines.stream()
                .map(OrderLine::calculateSubtotal)
                .reduce(ZERO, BigDecimal::add);
    }

    public void applyDiscount(BigDecimal discount) {
        orderLines.sort(comparing(OrderLine::getPrice));
        final OrderLine orderLineWithLowestPrice = orderLines.get(0);

        // Tell the orderLine to apply the discount.
        orderLineWithLowestPrice.applyDiscount(discount);
    }

}
