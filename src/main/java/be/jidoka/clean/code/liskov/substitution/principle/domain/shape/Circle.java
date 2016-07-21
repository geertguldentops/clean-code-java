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
    public double calculateCircumference() {
        return 2 * r * Math.PI;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("r=").append(r);
        sb.append('}');
        return sb.toString();
    }

}
