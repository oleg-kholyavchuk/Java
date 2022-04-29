package itsjava;

public class Four_Task {
    public static void main(String[] args) {

        int[] array = new int[]{-10, 0, 1, 5, -7, 10, 1, 6, 1, 5};
        int min = array[0];
        int summ = 0;

        // Вывести элементы с нечетными индексами
        for (int i = 1; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
        System.out.println();

        // Вывести первые четыре элемента
        for (int i = 0; i < array.length; i++) {
           if (i < 4)
            System.out.println(array[i]);
        }
        System.out.println();

        // Вывести последнии четыре элемента
        for (int i = 6; i < array.length; i++) {

            System.out.println(array[i]);
        }
        System.out.println();

        //Вывести минимальный элемент массива
        for (int i = 1; i != array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

        System.out.println();

        // Вывести элементы делящиеся на 5
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) % 5 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println();

        // Найти сумму элементов с четными индексами
        for (int i = 2; i < array.length; i += 2) {
            summ = summ + array[i];
        }
        System.out.println(summ);

        System.out.println();

        // Найти первый элемент делящийся на пять
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) % 5 == 0)
            { System.out.println(array[i]);
                 break;
            }
        }
    }
}








