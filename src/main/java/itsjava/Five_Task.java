package itsjava;

import java.util.Scanner;

public class Five_Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        printMinValue(14, 8);
        System.out.println("getMinValue (6, 20) = " + getMinValue(6, 20));
        printComparisons(num1, num2);
    }

    // Выводим минимальное число
    public static void printMinValue(int num1, int num2) {
        if (num1 < num2) {
            System.out.println("Минимум " + num1);
        } else {
            System.out.println("Минимум " + num2);
        }
    }

    // Сравниваем на минимум
    public static int getMinValue(int num1, int num2) {
        if (num1 < num2) return num1;
        return num2;
    }

    // Сравниваем числа на равенство
    public static void printComparisons(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны ");
        }
    }
}