package be.jidoka.clean.code.liskov.substitution.principle.application.shape;

import be.jidoka.clean.code.liskov.substitution.principle.domain.shape.Rectangle;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleServiceTest {

    @Test
    void shouldBeAbleToDoubleWidthOfAllRectangles() {
        var rectangles = ShapeTestFactory.generateRectangles();

        var originalWidths = rectangles.stream()
                .mapToDouble(Rectangle::getWidth)
                .boxed()
                .toList();
        var originalHeights = rectangles.stream()
                .mapToDouble(Rectangle::getHeight)
                .boxed()
                .toList();

        // Assertions are not strictly necessary here but they make explicit what we expect to change after we call doubleWidthOf().
        for (int i = 0; i < rectangles.size(); i++) {
            assertThat(rectangles.get(i).getWidth()).isEqualTo(originalWidths.get(i));
            assertThat(rectangles.get(i).getHeight()).isEqualTo(originalHeights.get(i));
        }

        doubleWidthOf(rectangles);

        for (int i = 0; i < rectangles.size(); i++) {
            assertThat(rectangles.get(i).getWidth()).isEqualTo(2 * originalWidths.get(i));
            // Height should not have changed.
            assertThat(rectangles.get(i).getHeight()).isEqualTo(originalHeights.get(i));
        }
    }

    private void doubleWidthOf(Collection<Rectangle> rectangles) {
        for (var rectangle : rectangles) {
            rectangle.setWidth(rectangle.getWidth() * 2);
        }
    }

}
