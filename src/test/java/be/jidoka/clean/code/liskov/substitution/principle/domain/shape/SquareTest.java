package be.jidoka.clean.code.liskov.substitution.principle.domain.shape;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

class SquareTest {

    @Test
    void shouldReturn4TimesSideOnCalculateCircumference() {
        var square = new Square(3.6);

        assertThat(square.calculateCircumference()).isEqualTo(14.4, offset(0.1));
    }

    @Test
    void shouldReturnSideSquaredOnCalculateArea() {
        var square = new Square(4);

        assertThat(square.calculateCircumference()).isEqualTo(16, offset(0.1));
    }

}
