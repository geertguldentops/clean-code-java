package be.jidoka.clean.code.tell.dont.ask.better.domain;

import org.junit.Test;

import java.math.BigDecimal;

import static org.fest.assertions.api.Assertions.assertThat;

public class OrderLineTest {

    @Test
    public void shouldReturnPriceMultipliedByAmount_OnCalculateSubtotal_WithValidOrderLine() {
        OrderLine orderLine = new OrderLine("Clean code distilled", BigDecimal.TEN, 5);

        assertThat(orderLine.calculateSubtotal()).isEqualTo("50");
    }

    @Test
    public void shouldReturnPriceMinusDiscount_OnApplyDiscount_WithValidOrderLine() {
        OrderLine orderLine = new OrderLine("Clean code distilled", BigDecimal.TEN, 5);

        assertThat(orderLine.calculateSubtotal()).isEqualTo("50");

        orderLine.applyDiscount(new BigDecimal("0.2"));

        // With isEqualTo 5.0 != 5.00; By using isEqualByComparingTo we automatically ignore trailing 0 (which are mathematically insignificant anyway).
        assertThat(orderLine.calculateSubtotal()).isEqualByComparingTo("40");
    }

}