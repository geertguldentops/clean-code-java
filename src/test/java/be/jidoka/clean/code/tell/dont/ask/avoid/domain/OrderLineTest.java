package be.jidoka.clean.code.tell.dont.ask.avoid.domain;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderLineTest {

    @Test
    public void shouldReturnPriceMultipliedByAmount_OnCalculateSubtotal_WithValidOrderLine() {
        OrderLine orderLine = new OrderLine("Clean code distilled", BigDecimal.TEN, 5);

        assertThat(orderLine.calculateSubtotal()).isEqualTo("50");
    }

}