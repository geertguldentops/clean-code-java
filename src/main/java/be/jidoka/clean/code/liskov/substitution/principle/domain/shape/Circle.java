package be.jidoka.clean.code.liskov.substitution.principle.domain.shape;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * r * Math.PI;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "Circle{" + "r=" + getR() + '}';
    }

}
