package be.jidoka.clean.code.tell.dont.ask.doinstead.domain;

import be.jidoka.clean.code.tell.dont.ask.better.domain.Order;
import be.jidoka.clean.code.tell.dont.ask.better.domain.OrderLine;
import org.junit.Test;

import java.math.BigDecimal;

import static org.fest.assertions.api.Assertions.assertThat;

public class OrderTest {

    @Test
    public void shouldReturnSumOfOrderLineSubTotals_OnCalculateTotal_WithMultipleOrderLines() {
        final Order order = new Order();
        order.addLine(new OrderLine("Clean code", new BigDecimal("44.99"), 1));
        order.addLine(new OrderLine("Java Concurrency in practice", new BigDecimal("49.99"), 2));

        assertThat(order.calculateTotal()).isEqualTo("144.97");
    }

    @Test
    public void shouldSubtractDiscountFromOrderLineWithLowestPrice_OnApplyDiscount_WithValidOrder() {
        final Order order = new Order();
        order.addLine(new OrderLine("Clean code", new BigDecimal("50.00"), 1));
        order.addLine(new OrderLine("Java Concurrency in practice", new BigDecimal("99.99"), 2));

        final BigDecimal discount = new BigDecimal("0.1");

        assertThat(order.calculateTotal()).isEqualTo("249.98");

        order.applyDiscount(discount);

        // With isEqualTo 5.0 != 5.00; By using isEqualByComparingTo we automatically ignore trailing 0 (which are mathematically insignificant anyway).
        assertThat(order.calculateTotal()).isEqualByComparingTo("244.98");
    }

}