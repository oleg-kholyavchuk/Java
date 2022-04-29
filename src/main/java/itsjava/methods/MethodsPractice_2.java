package itsjava.methods;

import java.util.Arrays;

public class MethodsPractice_2 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 6,-7, -1, 0};
        int num = 5;
        arrayToZeroArray(array);
        System.out.println(Arrays.toString(array));

        numToZero(num);
        System.out.println(num);

    }

    public static void arrayToZeroArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = 0;

        }

    }

    public static void numToZero(int num){
        num = 0;
    }
}
