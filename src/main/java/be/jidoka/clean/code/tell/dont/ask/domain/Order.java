package be.jidoka.clean.code.tell.dont.ask.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.ZERO;

public class Order {

    private final List<OrderLine> orderLines = new ArrayList<>();

    public void addLine(OrderLine orderLine) {
        this.orderLines.add(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public BigDecimal calculateTotal() {
        return orderLines.stream()
                .map(OrderLine::calculateSubtotal)
                .reduce(ZERO, BigDecimal::add);
    }

}
