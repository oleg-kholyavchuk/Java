package itsjava;

public class First_Task {
    public static void main(String[] args) {


        System.out.println("Я люблю домашние задания"); // Выводим сообщения как мы любим ДЗ

        int num1 = 10; // присваиваем значение переменной num1
        int num2 = 7; // присваиваем второе значение переменной num2
        double num4; // четвертая переменная
        double num5 = 10; // присваиваем значение переменной num5
        double num6 = 7; // присваиваем значение переменной num6
        int summa = num1 + num2; // производим операцию сложения. В результате операции присваиваем значение переменной num3
        System.out.println(summa); // выводим результат
        int difference = num1 - num2; // производим операцию вычитания. В результате операции присваиваем значение переменной num3
        System.out.println(difference); // выводим результат
        int multiplication = num1 * num2; // производим операцию умножения. В результате операции присваиваем значение переменной num3
        System.out.println(multiplication); // выводим результат
        double division = num5 / num6; // производим операцию деления. В результате операции присваиваем значение переменной num3
        System.out.println(division); // выводим результат
        double remains = num5 % num6; // производим операцию деление с остатком. В результате операции присваиваем значение переменной num4
        System.out.println(remains); // выводим результат

        System.out.println(++num1); // производим операцию инкремента. В результате операции присваиваем значение переменной num1
        System.out.println(++num2); // производим операцию инкремента. В результате операции присваиваем значение переменной num2

        num1 = 10; // присваиваем первоначальные значения переменным
        num2 = 7;

        System.out.println(--num1); // производим операцию декремента. В результате операции присваиваем значение переменной num2. И выводим значение
        System.out.println(--num2); // производим операцию декремента. В результате операции присваиваем значение переменной num2. И выводим значение

        System.out.println(5 > 7); // производим операции сравнения. И выводим значение true, false
        System.out.println(5 < 7);
        System.out.println(5 == 7);
        System.out.println(5 <= 7);
        System.out.println(5 >= 7);
        System.out.println(5 != 7);

    }
}

