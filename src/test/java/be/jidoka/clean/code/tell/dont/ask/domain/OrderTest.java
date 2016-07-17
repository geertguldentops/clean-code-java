package be.jidoka.clean.code.tell.dont.ask.domain;

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

}