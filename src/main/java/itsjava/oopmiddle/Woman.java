package itsjava.oopmiddle;

public class Woman extends Person {

    public Woman(int age, String name) {
        super(age, name, false);
    }

    @Override
    public void printAge() {
        System.out.println("Всем девушкам всегда 18");
    }
}
