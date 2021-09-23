package be.jidoka.clean.code.liskov.substitution.principle.domain.shape;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

class CircleTest {

    @Test
    void shouldReturnTwoTimesRadiusTimesPi_onCalculateCircumference() {
        var circle = new Circle(3.2);

        assertThat(circle.calculatePerimeter()).isEqualTo(20.11, offset(0.01));
    }

    @Test
    void shouldReturnPiTimesRadiusSquared_onCalculateArea() {
        var circle = new Circle(5.8);

        assertThat(circle.calculateArea()).isEqualTo(105.68, offset(0.01));
    }

}