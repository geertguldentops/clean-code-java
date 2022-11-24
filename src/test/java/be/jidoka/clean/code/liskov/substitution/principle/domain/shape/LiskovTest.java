package be.jidoka.clean.code.liskov.substitution.principle.domain.shape;

import be.jidoka.clean.code.liskov.substitution.principle.application.shape.ShapeTestFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

class LiskovTest {

    @Test
    void resizeRectangle() {
        var rectangles = ShapeTestFactory.generateRectangles();

        for (var rectangle : rectangles) {
            rectangle.setWidth(5.0);
            rectangle.setHeight(4.0);

            assertThat(rectangle.calculateArea()).isEqualTo(20.00, offset(0.1));
        }
    }

}
