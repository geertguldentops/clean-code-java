package be.jidoka.clean.code.liskov.substitution.principle.domain.shape;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class RectangleTest {

    @Test
    public void shouldReturnTwoTimesWidthPlusTwoTimesHeightOnCalculateCircumference() {
        final Rectangle rectangle = new Rectangle(7.8, 4.3);

        assertThat(rectangle.calculateCircumference()).isEqualTo(24.2);
    }

    @Test
    public void shouldReturnWidthTimesHeightOnCalculateArea() {
        final Rectangle rectangle = new Rectangle(7.8, 4.3);

        assertThat(rectangle.calculateArea()).isEqualTo(33.54);
    }

}
