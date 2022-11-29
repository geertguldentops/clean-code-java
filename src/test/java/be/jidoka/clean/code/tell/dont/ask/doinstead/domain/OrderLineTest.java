package be.jidoka.clean.code.tell.dont.ask.doinstead.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class OrderLineTest {

    @Test
    void shouldReturnPriceMultipliedByAmount_onCalculateSubtotal_withValidOrderLine() {
        var orderLine = new OrderLine("Clean code distilled", BigDecimal.TEN, 5);

        assertThat(orderLine.calculateSubtotal()).isEqualByComparingTo("50");
    }

    @Test
    void shouldReturnPriceMinusDiscount_onApplyDiscount_withValidOrderLine() {
        var orderLine = new OrderLine("Clean code distilled", BigDecimal.TEN, 5);

        assertThat(orderLine.calculateSubtotal()).isEqualByComparingTo("50");

        orderLine.applyDiscount(new BigDecimal("0.2"));

        // With isEqualTo 5.0 != 5.00; By using isEqualByComparingTo we automatically ignore trailing 0 (which are mathematically insignificant anyway).
        assertThat(orderLine.calculateSubtotal()).isEqualByComparingTo("40");
    }

}