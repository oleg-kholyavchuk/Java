package itsjava.strings;

public class StringsPractice {
    public static void main(String[] args) {
        System.out.println("Строка -- это лучший в мире класс!");

        String str = "I am best string! "; // лежит в Куче
        String str2 = "I am best string!++++ ";
        // Непревельное сравнение строк (проверка ссылок)
        System.out.println(str == str2);
        // Верное сравнение строк
        System.out.println("str.equals(str2) = " + str.equals(str2));

        System.out.println("str.charAt(2) = " + str.charAt(2));
        System.out.println("str.length() = " + str.length());
        System.out.println("str2.indexOf(a) = " + str2.indexOf('s'));

    }

}
