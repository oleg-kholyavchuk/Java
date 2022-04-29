package itsjava.oop;

public class Human {

    private String name;
    private int age;
    private String changename;
    private int changeage;

    public Human(String name) {
        this.name = name;
    }

    public Human(int age) {
        this.age = age;
    }

    public void humanName() {
        System.out.println("Привет " + " я " + name);
    }

    public String getName() {
        return changename;
    }

    public void setName(String name) {
        this.changename = name;
    }

    public void humanAge() {
        System.out.println("Мне " + age + " года");
    }

    public int getAge() {
        return changeage;
    }

    public void setAge(int age) {
        this.changeage = age;
    }
}
