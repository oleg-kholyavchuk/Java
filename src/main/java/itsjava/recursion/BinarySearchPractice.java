package itsjava.recursion;

import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {
        //1. Отсортерованный массив
        //Найти: позицио в этом массиве

        int[] array = new int[]{-6, -3, -2, 0, 1, 5, 6, 7, 8};

        int pos0 = binarySearch(0, 0, array.length, array);

        System.out.println("Позиция 0 в массиве " + Arrays.toString(array) + " равна " + pos0);

        int pos6 = binarySearch(-6, 0, array.length, array);

        System.out.println("Позиция -6 в массиве " + Arrays.toString(array) + " равна " + pos6);

        int pos8 = binarySearch(8, 0, array.length, array);

        System.out.println("Позиция 8 в массиве " + Arrays.toString(array) + " равна " + pos8);
    }

    private static int binarySearch(int num, int beginIndex, int endIndex, int[] array) {
        int midIndex = beginIndex + (endIndex - beginIndex) / 2;

        // базовый случай
        if (num == array[midIndex]) return midIndex;

        if (num > array[midIndex]) return binarySearch(num, midIndex + 1, endIndex, array);

        return binarySearch(num, beginIndex, midIndex - 1, array);
    }

}
