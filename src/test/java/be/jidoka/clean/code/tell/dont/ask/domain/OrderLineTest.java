package be.jidoka.clean.code.tell.dont.ask.domain;

import org.junit.Test;

import java.math.BigDecimal;

import static org.fest.assertions.api.Assertions.assertThat;

public class OrderLineTest {

    @Test
    public void shouldReturnPriceMultipliedByAmount_OnCalculateSubtotal_WithValidOrderLine() {
        OrderLine orderLine = new OrderLine("Clean code distilled", BigDecimal.TEN, 5);

        assertThat(orderLine.calculateSubtotal()).isEqualTo("50");
    }

}