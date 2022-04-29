package itsjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Находим наибольшее и наименьшее число. Отказался от if, esle так как решил что этот способ интересней
        Scanner in = new Scanner(System.in);

        System.out.println("Введите три числа");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println("Большее число из двух " + Math.max(num1, num2));
        System.out.println("Меньшее число из двух " + Math.min(num1, num2));
        System.out.println("Наименьшее из трех " + Math.min(Math.min(num1, num2), num3));

        // Задача "Призывник"
        System.out.println("Введите возраст");
        int age = in.nextInt();
        if (age > 100 || age <= 0) {
            System.out.println("Возраст не коректен");
        } else if (age < 18) {
            System.out.println("Еще слишком мал!");
        } else if (age <= 27) {
            System.out.println("Служи!!!");
        } else {
            System.out.println("Уже слишком поздно!");
        }


        // Меняем переменные местами
        System.out.println("Введите две переменные");
        int num4 = in.nextInt();
        int num5 = in.nextInt();
        num4 = num4 ^ num5 ^ (num5 = num4);
        System.out.println("Первая переменная " + num4 + " Вторая переменная " + num5);

        // Находим х квадратного уравнения
        System.out.println("Находим х квадратного уравнения ах^2 + bx + c = 0");
        System.out.println("Введите значения а, b, c");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();

        double d = (b * b) - 4 * a * c;
        if (d < 0) {
            System.out.println("Корней нет");
        } else if (d == 0) {
           double x1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("x равен " + x1 + " При D равной 0 имеет одно решение");
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 равен " + x1 + " x2 равен " + x2);
        }



    }
}
