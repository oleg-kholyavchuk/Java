package itsjava.recursion;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numFibonachi = fibonacciSequence(num);
        System.out.println(numFibonachi);
        for (int i = 0; i <= num; ++i) {
            System.out.print(fibonacciSequence(i) + ", ");
        }
    }

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

