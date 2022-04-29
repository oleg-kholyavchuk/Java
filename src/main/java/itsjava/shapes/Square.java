package itsjava.shapes;

public class Square extends Main {

    private double sideA;
    private double perimeter;
    private double square;

    public Square(double sideA) {
        this.sideA = sideA;
        this.perimeter = sideA * 4;
        this.square = sideA * sideA;
    }

    public String toString() {
        return "Квадрат {Периметор = " + perimeter + " " + "Площадь " + square + '}';

    }

}
