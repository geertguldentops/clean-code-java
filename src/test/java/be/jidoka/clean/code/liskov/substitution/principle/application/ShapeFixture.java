package be.jidoka.clean.code.liskov.substitution.principle.application;

import be.jidoka.clean.code.liskov.substitution.principle.domain.Rectangle;
import be.jidoka.clean.code.liskov.substitution.principle.domain.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapeFixture {

    public static List<Rectangle> generateRectangles() {
        final List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(7.8, 10.6));
        rectangles.add(new Rectangle(1.8, 5.9));
        rectangles.add(new Rectangle(2.7, 8.6));
        rectangles.add(new Square(6.7));
        rectangles.add(new Rectangle(6.2, 3.5));
        rectangles.add(new Square(8.3));

        return rectangles;
    }

}
