package itsjava.oopmiddle;

public class Person {

    private final int age;
    private final String name;
    private final boolean isMale;

    public Person(int age, String name, boolean isMale) {

        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public void printAge() {
        System.out.println("Возраст " + age);
    }

    public void printName() {
        System.out.println("Имя " + name);
    }
}

