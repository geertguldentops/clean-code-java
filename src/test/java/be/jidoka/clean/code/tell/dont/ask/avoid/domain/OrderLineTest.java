package be.jidoka.clean.code.tell.dont.ask.avoid.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class OrderLineTest {

    @Test
    void shouldReturnPriceMultipliedByAmount_onCalculateSubtotal_withValidOrderLine() {
        var orderLine = new OrderLine("Clean code distilled", BigDecimal.TEN, 5);

        assertThat(orderLine.calculateSubtotal()).isEqualTo("50");
    }

}