package itsjava.shapes;

public class Triangle extends Main {
    private double sideA;
    private double sideB;
    private double sideC;
    private double square;
    private double perimeter;
    public double sinAngle;

    public Triangle(double sideA, double sideB, double sideC, double sinAngle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sinAngle = sinAngle;
        this.perimeter = sideA + sideB + sideC;
        this.square = 0.5 * (sideA * sideB * Math.sin(sinAngle));
    }

    public String toString() {
        return "Треугольник {Периметор = " + perimeter + " " + "Площадь " + square + '}';

    }
}
