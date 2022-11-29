package be.jidoka.clean.code.tell.dont.ask.doinstead.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {

    @Test
    void shouldReturnSumOfOrderLineSubTotals_onCalculateTotal_withMultipleOrderLines() {
        var order = new Order();
        order.addLine(new OrderLine("Clean code", new BigDecimal("44.99"), 1));
        order.addLine(new OrderLine("Java Concurrency in practice", new BigDecimal("49.99"), 2));

        assertThat(order.calculateTotal()).isEqualByComparingTo("144.97");
    }

    @Test
    void shouldSubtractDiscountFromOrderLineWithLowestPrice_onApplyDiscount_withValidOrder() {
        var order = new Order();
        order.addLine(new OrderLine("Clean code", new BigDecimal("50.00"), 1));
        order.addLine(new OrderLine("Java Concurrency in practice", new BigDecimal("99.99"), 2));

        var discount = new BigDecimal("0.1");

        assertThat(order.calculateTotal()).isEqualByComparingTo("249.98");

        order.applyDiscount(discount);

        // With isEqualTo 5.0 != 5.00; By using isEqualByComparingTo we automatically ignore trailing 0 (which are mathematically insignificant anyway).
        assertThat(order.calculateTotal()).isEqualByComparingTo("244.98");
    }

}