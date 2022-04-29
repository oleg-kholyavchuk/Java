package itsjava;

import java.util.Scanner;

public class Fixed_Issues {
    public static void main(String[] args) {
        int[] array = new int[]{-10, 0, 1, 5, -7, 10, 1, 6, 1, 5};

        // Вывести первые четыре элемента!!!!!!!! Исправил!!!!!!!!!
        for (int i = 0; i < array.length; i++) {
            if (i < 4)
                System.out.println(array[i]);
        }
        System.out.println();

        // Найти первый элемент делящийся на пять
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);
                break;
            }
        }

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numFibonachi = fibonacciSequence(num);
        System.out.println(numFibonachi);
        for (int i = 0; i <= num; ++i) {
            System.out.print(fibonacciSequence(i) + ", ");
        }
    }

    // Тут сделал более красивый вывод
    public static int fibonacciSequence(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacciSequence(num - 1) + fibonacciSequence(num - 2);
        }
    }
}



