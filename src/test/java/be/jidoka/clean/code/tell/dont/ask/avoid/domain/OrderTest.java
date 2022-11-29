package be.jidoka.clean.code.tell.dont.ask.avoid.domain;

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

}