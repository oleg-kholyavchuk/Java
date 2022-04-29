
package itsjava.methods;

import java.util.Scanner;


public class Six_Task {
    public static void main(String[] args) {

        // ТОЛЬКО ПЕРВОЕ И ВТОРОЕ

        // Находим наибольшее и наименьшее число. Отказался от if, esle так как решил что этот способ интересней
        System.out.println("Введите три числа");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        // Задача "Призывник"
        System.out.println("Введите возраст");
        int age = in.nextInt();
        // Меняем переменные местами
        System.out.println("Введите две переменные");
        int num4 = in.nextInt();
        int num5 = in.nextInt();
        // Находим х квадратного уравнения
        System.out.println("Находим х квадратного уравнения ах^2 + bx + c = 0");
        System.out.println("Введите значения а, b, c");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        // работа с массивами
        int[] array = new int[]{-10, 0, 1, 5, -7, 10, 1, 6, 1, 5};

        iLOVEJava();
        resultsOfOperations(8, 12, 2.5, 4.9);

        findingTheMinimumAndMaximum(num1, num2, num3);
        System.out.println();
        taskConscript(age);
        changingVar(num4, num5);
        findXEquations(a, b, c);
        outputJavaTenTimes();
        outputTheThirdAndFifthElements();
        outputTheTextThreeTimes();
        outputArray();
        elementsWithOddIndexes(array);
        System.out.println();
        PrintTheFirstFourElements(array);
        System.out.println();
        outputTheLastFourElements(array);
        System.out.println();
        outputTheMinimumElementOfTheArray(array);
        System.out.println();
        outputElementsDivisible5(array);
        System.out.println();
        sumOfElementsWithEvenIndexes(array);
        System.out.println();
        firstElementDivisibleFive(array);
    }

    public static void iLOVEJava() {
        System.out.println("Я люблю домашние задания");
    }
    public static void resultsOfOperations(int num1, int num2, double num3, double num4) {
        int num5 = num1 + num2; // производим операцию сложения. В результате операции присваиваем значение переменной num3
        System.out.println(num5); // выводим результат
        int num6 = num1 - num2; // производим операцию вычитания. В результате операции присваиваем значение переменной num3
        System.out.println(num6); // выводим результат
        int num7 = num1 * num2; // производим операцию умножения. В результате операции присваиваем значение переменной num3
        System.out.println(num7); // выводим результат
        double num8 = num3 / num4; // производим операцию деления. В результате операции присваиваем значение переменной num3
        System.out.println(num8); // выводим результат
        double num9 = num3 % num4; // производим операцию деление с остатком. В результате операции присваиваем значение переменной num4
        System.out.println(num9); // выводим результат
        System.out.println(++num1); // производим операцию инкремента. В результате операции присваиваем значение переменной num1
        System.out.println(++num2); // производим операцию инкремента. В результате операции присваиваем значение переменной num2
        System.out.println(--num1); // производим операцию декремента. В результате операции присваиваем значение переменной num2. И выводим значение
        System.out.println(--num2); // производим операцию декремента. В результате операции присваиваем значение переменной num2. И выводим значение
        System.out.println(5 > 7); // производим операции сравнения. И выводим значение true, false
        System.out.println(5 < 7);
        System.out.println(5 == 7);
        System.out.println(5 <= 7);
        System.out.println(5 >= 7);
        System.out.println(5 != 7);
    }
    public static void findingTheMinimumAndMaximum(int num1, int num2, int num3) {
        System.out.println("Большее число из двух " + Math.max(num1, num2));
        System.out.println("Меньшее число из двух " + Math.min(num1, num2));
        System.out.println("Наименьшее из трех " + Math.min(Math.min(num1, num2), num3));
    }
    public static void taskConscript(int age) {
        if (age > 100 || age <= 0) {
            System.out.println("Возраст не коректен");
        } else if (age < 18) {
            System.out.println("Еще слишком мал!");
        } else if (age <= 27) {
            System.out.println("Служи!!!");
        } else {
            System.out.println("Уже слишком поздно!");
        }
    }
    public static void changingVar(int num4, int num5) {
        num4 = num4 ^ num5 ^ (num5 = num4);
        System.out.println("Первая переменная " + num4 + " Вторая переменная " + num5);
    }
    public static void findXEquations(double a, double b, double c) {
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
    public static void outputJavaTenTimes() {
        System.out.println("Выводим сообщение \" Я люблю Java \" десять раз ");
        for (int count = 0; count < 10; count++) {
            System.out.println("Я люблю Java");
        }
    }
    public static void outputTheThirdAndFifthElements() {
        System.out.println("Выводим третий и пятый элемент цикла и длину массива");
        int[] numbers = new int[]{-10, 58, -4, 0, 44, 1, 6};
        System.out.println(numbers[3]);
        System.out.println(numbers[5]);
        System.out.println("Длинна массива = " + numbers.length);
    }
    public static void outputTheTextThreeTimes() {
        System.out.println("Вывести три раза \"Я люблю писать программы на Java\" ");
        for (int i = 0; i < 3; ++i) {
            System.out.println("Я люблю писать программы на Java ");
        }
    }
    public static void outputArray() {
        System.out.println("Вывести массив { 3, 5, 0, 4, -1}");
        int[] arr = new int[]{3, 5, 0, 4, -1};
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void elementsWithOddIndexes(int[] numbers) {
        for (int i = 1; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }
    }
    public static void PrintTheFirstFourElements(int[] numbers) {
        for (int i = 0; i < numbers.length - 6; i++) {

            System.out.println(numbers[i]);
        }
    }
    public static void outputTheLastFourElements(int[] numbers) {
        for (int i = 6; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }
    }
    public static void outputTheMinimumElementOfTheArray(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i != numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
    public static void outputElementsDivisible5(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) % 5 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
    public static void sumOfElementsWithEvenIndexes(int[] numbers) {
        int summ = 0;
        for (int i = 2; i < numbers.length; i += 2) {
            summ = summ + numbers[i];
        }
        System.out.println(summ);
    }
    public static void firstElementDivisibleFive(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) % 5 == 0) {
                System.out.println(numbers[i]);
                break;
            }
        }
    }
}
