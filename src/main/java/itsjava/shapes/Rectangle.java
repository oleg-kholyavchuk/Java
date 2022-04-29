package itsjava.shapes;

public class Rectangle extends Main {

    private double sideA;
    private double sideB;
    private double perimeter;
    private double square;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.perimeter = (sideA + sideB) * 2;
        this.square = sideA * sideB;
    }

    public String toString() {
        return "Прямоугольник {Периметор = " + perimeter + " " + "Площадь " + square + '}';

    }
}
