package itsjava;

public class Cycles_Practice {
    public static void main(String[] args) {


        // Выводим сообщение " Я люблю Java " десять раз
        System.out.println("Выводим сообщение \" Я люблю Java \" десять раз ");
        for (int count = 0; count < 10; count++) {
            System.out.println("Я люблю Java");
        }

        // Выводим третий и пятый элемент цикла
        System.out.println("Выводим третий и пятый элемент цикла и длину массива");
        int[] numbers = new int[]{-10, 58, -4, 0, 44, 1, 6};

        System.out.println(numbers[3]);
        System.out.println(numbers[5]);
        System.out.println("Длинна массива = " + numbers.length);

        // Вывести три раза "Я люблю писать программы на Java"
        System.out.println("Вывести три раза \"Я люблю писать программы на Java\" ");
        for (int i = 0; i < 3; ++i) {
            System.out.println("Я люблю писать программы на Java ");
        }
        // Вывести массив { 3, 5, 0, 4, -1}
        System.out.println("Вывести массив { 3, 5, 0, 4, -1}");
        int[] arr = new int[]{3, 5, 0, 4, -1};
        for (int i = 0; i < arr.length; ++i) {
            System.out.print( arr[i]);
        }
    }
}

//         while ( count < 3) {
//             System.out.println("Java");
//             ++count;
//         }

//        int[] numbersArray = new int[]{0, 5, 6, 5};
//        int countofTwo = 0;
//        for (int i = 0; i < numbersArray.length; i++) {
//            if (numbersArray[i] == 5) {
//                countofTwo++;
//                if ( countofTwo > 2){
//                    break;
//                }
//                System.out.println(i);
//
//            }
//                    }
//
//
//        // Задача. Вывести индексы массива равные пяти
//
//
//    }
//
//
//}
