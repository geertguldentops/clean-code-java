package be.jidoka.clean.code.liskov.substitution.principle.application.shape;

import be.jidoka.clean.code.liskov.substitution.principle.domain.shape.Rectangle;
import be.jidoka.clean.code.liskov.substitution.principle.domain.shape.Square;

import java.util.ArrayList;
import java.util.List;

class ShapeFixture {

    static List<Rectangle> generateRectangles() {
        var rectangles = new ArrayList<Rectangle>();
        rectangles.add(new Rectangle(7.8, 10.6));
        rectangles.add(new Rectangle(1.8, 5.9));
        rectangles.add(new Rectangle(2.7, 8.6));
        rectangles.add(new Square(6.7));
        rectangles.add(new Rectangle(6.2, 3.5));
        rectangles.add(new Square(8.3));

        return rectangles;
    }

}
