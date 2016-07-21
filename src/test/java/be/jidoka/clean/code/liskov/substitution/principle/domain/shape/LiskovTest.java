package be.jidoka.clean.code.liskov.substitution.principle.domain.shape;

import be.jidoka.clean.code.liskov.substitution.principle.domain.shape.Rectangle;
import be.jidoka.clean.code.liskov.substitution.principle.domain.shape.Square;
import org.junit.Ignore;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class LiskovTest {

    @Ignore
    @Test
    public void squareBreaksLiskovsSubstitutionPrinciple() {
        Rectangle rectangle = new Square(12.5);

        assertThat(rectangle.getHeight()).isEqualTo(12.5);
        assertThat(rectangle.getWidth()).isEqualTo(12.5);

        rectangle.setWidth(6);

        assertThat(rectangle.getHeight()).isEqualTo(12.5);
        assertThat(rectangle.getWidth()).isEqualTo(6.0);
    }

}
