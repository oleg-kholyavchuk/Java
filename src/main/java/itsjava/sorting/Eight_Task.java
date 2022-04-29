package itsjava.sorting;

import java.util.Arrays;

public class Eight_Task {
    public static void main(String[] args) {
        // Сортировка выбором
        int[] array1 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = new int[]{8, 9, 7, 2, 3, 4, 3, 5, 1};
        // Сортировка выбором
        System.out.println("Исходный массив: " + Arrays.toString(array1));
        selectionSort(array1);
        System.out.println("Отсортированный массив: " + Arrays.toString(array1));
        // Cортировка слиянием
        System.out.println("Исходный массив: " + Arrays.toString(array2));
        mergeSort(array2, 0, array2.length - 1);
        System.out.println("Отсортированный массив: " + Arrays.toString(array2));
    }

    public static void selectionSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int arrMin = array[j];
            int minJ = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < arrMin) {
                    arrMin = array[i];
                    minJ = i;
                }
            }
            if (j != minJ) {
                int temp = array[j];
                array[j] = array[minJ];
                array[minJ] = temp;
            }
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(array, left, delimiter - 1);
            mergeSort(array, delimiter, right);
        }
        int[] temp = new int[right - left + 1];
        int position = left;
        for (int i = 0; i < temp.length; i++) {
            if (delimiter > right || array[position] < array[delimiter]) {
                temp[i] = array[position];
                position++;
            } else {
                temp[i] = array[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(temp, 0, array, left, temp.length);
    }
}

