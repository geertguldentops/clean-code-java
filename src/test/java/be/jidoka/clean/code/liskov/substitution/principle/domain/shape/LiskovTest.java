package be.jidoka.clean.code.liskov.substitution.principle.domain.shape;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
