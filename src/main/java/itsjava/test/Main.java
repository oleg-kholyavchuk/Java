package itsjava.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    // public - это модификатор доступа. Он общедоступен. То есть поле или метод доступны во всей программе
        Scanner scan = new Scanner(System.in); //  static - это модификатор. Он создает поле или метод который принадлежит всему классу
        System.out.print("Input radius: ");   //   void - показывает что метод не возвращает результат
        double radius = scan.nextDouble();   //    main - метод. Является точкой входа в программу
                                            //     (String[] args) - список параметров метода main c ссылкой на массив args
        Circle circle = new Circle(radius);
        System.out.println(circle);
        System.out.println("Площадь: " + circle.getArea());
    }
}

