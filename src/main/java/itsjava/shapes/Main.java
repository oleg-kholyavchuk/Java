package itsjava.shapes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите размеры сторон треугольника и синус угла");
        Scanner temp1 = new Scanner(System.in);
        Scanner temp2 = new Scanner(System.in);
        Scanner temp3 = new Scanner(System.in);
        Scanner temp4 = new Scanner(System.in);

        double sideA = temp1.nextDouble();
        double sideB = temp2.nextDouble();
        double sideC = temp3.nextDouble();
        double sinAngle = temp4.nextDouble();
        Triangle triangle = new Triangle(sideA, sideB, sideC, sinAngle);
        System.out.println(triangle);

        System.out.println("Введите резмер сторон квадрата");
        Scanner temp5 = new Scanner(System.in);
        double sideSquare = temp5.nextDouble();
        Square square = new Square(sideSquare);
        System.out.println(square);

        System.out.println("Введите размеры сторон прамоугольника");
        Scanner temp6 = new Scanner(System.in);
        Scanner temp7 = new Scanner(System.in);
        double sideARectangle = temp6.nextDouble();
        double sideBRectangle = temp7.nextDouble();
        Rectangle rectangle = new Rectangle(sideARectangle, sideBRectangle);
        System.out.println(rectangle);
    }
}
