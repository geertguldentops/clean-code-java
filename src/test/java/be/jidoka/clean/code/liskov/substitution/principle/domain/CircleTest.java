package be.jidoka.clean.code.liskov.substitution.principle.domain;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CircleTest {

    @Test
    public void shouldReturnTwoTimesRadiusTimesPiOnCalculateCircumference() {
        final Circle circle = new Circle(3.2);

        assertThat(circle.calculateCircumference()).isEqualTo(20.106192982974676);
    }

    @Test
    public void shouldReturnPiTimesRadiusSquaredOnCalculateArea() {
        final Circle circle = new Circle(5.8);

        assertThat(circle.calculateArea()).isEqualTo(105.68317686676065);
    }

}