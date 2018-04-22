package be.jidoka.clean.code.liskov.substitution.principle.domain.shape;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {

    @Test
    public void shouldReturn4TimesSideOnCalculateCircumference() {
        Square square = new Square(3.6);

        assertThat(square.calculateCircumference()).isEqualTo(14.4);
    }

    @Test
    public void shouldReturnSideSquaredOnCalculateArea() {
        Square square = new Square(4);

        assertThat(square.calculateCircumference()).isEqualTo(16);
    }

}
