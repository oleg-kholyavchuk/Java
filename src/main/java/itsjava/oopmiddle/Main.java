package itsjava.oopmiddle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Здравствуйте введите имя, возраст, свой пол(если мужчина - true)");

        Scanner temp = new Scanner(System.in);

        String name = temp.nextLine();
        int age = temp.nextInt();
        boolean isMale = temp.nextBoolean();

        Person personManMain = new Man(age, name);
        Person personWomanMain = new Woman(age, name);

        if (isMale == false) {
            //System.out.println(personWomanMain);
            personWomanMain.printName();
            personWomanMain.printAge();
        } else {
            //System.out.println(personManMain);
            personManMain.printName();
            personManMain.printAge();
        }

        Person[] arr = new Person[2];
        arr[0] = new Man(age, name);
        arr[1] = new Woman(age, name);

        for (int i = 0; i < 1; i++) {
            System.out.print(arr[i].getAge() + arr[i].getAge());
        }
    }
}

