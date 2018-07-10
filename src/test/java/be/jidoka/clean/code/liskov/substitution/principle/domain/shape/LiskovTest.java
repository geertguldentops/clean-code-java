package be.jidoka.clean.code.liskov.substitution.principle.domain.shape;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

class LiskovTest {

    @Disabled
    @Test
    void squareBreaksLiskovsSubstitutionPrinciple() {
        Rectangle rectangle = new Square(12.5);

        assertThat(rectangle.getHeight()).isEqualTo(12.5, offset(0.1));
        assertThat(rectangle.getWidth()).isEqualTo(12.5, offset(0.1));

        rectangle.setWidth(6);

        assertThat(rectangle.getHeight()).isEqualTo(12.5, offset(0.1));
        assertThat(rectangle.getWidth()).isEqualTo(6.0, offset(0.1));
    }

}
