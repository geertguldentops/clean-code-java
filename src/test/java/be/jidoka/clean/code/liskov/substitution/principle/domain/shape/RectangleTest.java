package be.jidoka.clean.code.liskov.substitution.principle.domain.shape;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

class RectangleTest {

    @Test
    void shouldReturnTwoTimesWidthPlusTwoTimesHeight_onCalculateCircumference() {
        var rectangle = new Rectangle(7.8, 4.3);

        assertThat(rectangle.calculatePerimeter()).isEqualTo(24.2, offset(0.1));
    }

    @Test
    void shouldReturnWidthTimesHeight_onCalculateArea() {
        var rectangle = new Rectangle(7.8, 4.3);

        assertThat(rectangle.calculateArea()).isEqualTo(33.54, offset(0.01));
    }

}
