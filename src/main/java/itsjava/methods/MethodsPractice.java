package itsjava.methods;

public class MethodsPractice {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        if (num1 > num2) {
            System.out.println("Максимум " + num1);


        } else {
            System.out.println("Mаксимум " + num2);
        }

        int num3 = 6;
        int num4 = 10;
        if (num3 > num4) {
            System.out.println("Максимум " + num3);

        } else {
            System.out.println("Mаксимум " + num4);
        }

        printMaxValue(15,7);
        printMaxValue(16,10);
        // Найти макс значение увеличенное на десять
        System.out.println(" Максимум из 3 и 12 ");
        System.out.println("(getMaxValue(3, 12) + 10) = " + (getMaxValue(3, 12) + 10));

    }


    public static void printMaxValue(int num1, int num2) {

        if (num1 > num2) {
            System.out.println("Максимум " + num1);


        } else {
            System.out.println("Mаксимум " + num2);
        }
    }

    public static int getMaxValue(int num1, int num2) {
        if ( num1 > num2) return num1;
                return  num2;



    }
}
