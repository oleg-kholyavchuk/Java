package itsjava.recursion;

public class RecursionPractice {
    public static void main(String[] args) {
        System.out.println("fact(5) = " + fact(5));
//        System.out.println("fact(0) = " + fact(0));
//        System.out.println("fact(1) = " + fact(1));
//        System.out.println("fact(-1) = " + fact(-1));

    }

    public static int fact(int num) {
        if (num < 0){
            System.err.println("Факториал для числа не определенн " + num + " не опредилен");
            return -1;
        }
        // базовый случай
        if ((num == 1) || (num == 0))
            return 1;
            // условие перехода

            return num * fact(num - 1);
        }





}
// 0! = 1! =1 Фактариалы
// 5! = 1 * 2 * 3 * 4 * 5
// 5! = 5 * 4!
// 4! = 4 * 3!
// 3! = 3 * 2!
// 2! = 2 * 1!
// 1! = 1