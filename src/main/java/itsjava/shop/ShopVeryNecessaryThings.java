package itsjava.shop;

import java.util.Scanner;

public class ShopVeryNecessaryThings {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в магазин нужных вещей");
        String[] things = new String[]{"Самая_нужная_вещь", "Очень_нужная_вещь", "Вещь_так_себе", "Вещь_без_которой_вы_не_можите_жить"};

        printMenu();
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер меню ");
            int menuNum = console.nextInt();
            if (menuNum == 1) {
                printAllThings(things);

            } else if (menuNum == 2) {
                things = addThings(console, things);

            } else if (menuNum == 3) {
                things = removeThings(console, things);

            } else if (menuNum == 4) {
                selectionSort(things);

            } else if (menuNum == 0) {
                System.out.println("Спасибо что воспользовались нашим магазином");
                System.exit(0);
            }
        }
    }

    private static String[] removeThings(Scanner console, String[] things) {
        System.out.println("Введите какую вещь удалить");
        String inputThings = console.next();
        String[] resArray = new String[things.length - 1];

        int delIndex;
        for (delIndex = 0; delIndex < things.length; delIndex++) {
            if (things[delIndex].equals(inputThings)) {
                break;
            }
            resArray[delIndex] = things[delIndex];
        }

        for (int i = delIndex; i < resArray.length; i++) {
            resArray[i] = things[i + 1];
        }
        return resArray;
    }

    private static String[] addThings(Scanner console, String[] things) {
        System.out.println("Введите какая вещь нужна");
        String inputThings = console.next();
        String[] resArray = new String[things.length + 1];
        for (int i = 0; i < things.length; i++) {
            resArray[i] = things[i];
        }
        resArray[things.length] = inputThings;
        return resArray;
    }

    private static void printAllThings(String[] things) {
        System.out.println("Наши вещи");
        for (int i = 0; i < things.length; i++) {
            System.out.print(things[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(String[] things) {
        for (int j = 0; j < things.length; j++) {
            String arrMin = things[j];
            int minJ = j;
            for (int i = j + 1; i < things.length; i++) {
                if (things[i].charAt(0) < arrMin.charAt(0)) {
                    arrMin = things[i];
                    minJ = i;
                }
            }
            if (j != minJ) {
                String temp = things[j];
                things[j] = things[minJ];
                things[minJ] = temp;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Меню:\n" +
                "1. Вывести все вещи\n" +
                "2. Добавить вещь\n" +
                "3. Удалить вещь\n" +
                "4. Отсортировать вещи\n" +
                "5. Выход");
    }
}

