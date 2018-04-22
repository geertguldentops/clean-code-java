package be.jidoka.clean.code.liskov.substitution.principle.domain.shape;

public class Square extends Rectangle {

    public Square(double side) {
        // Square has an extra invariant compared to a rectangle, weight and height must always be equal!
        super(side, side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    private void setSide(double side) {
        // Square has an extra invariant compared to a rectangle, weight and height must always be equal!
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + getWidth() + '}';
    }

}
