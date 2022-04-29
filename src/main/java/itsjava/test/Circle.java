package itsjava.test;

public class Circle {
    private double diameter;
    private double radius;
    private static final double PI = 3.1415926535;

    public Circle(double radius) {
        this.diameter = 2 * radius;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle {diameter = " + diameter +
                ", radius = " + radius + '}';
    }
}
