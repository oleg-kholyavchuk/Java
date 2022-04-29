package itsjava.oop;

public class Lion extends Cat {
    // Поля. Делать final
    private String name;

    // Конструктор по умолчанию
    public Lion() {
    }

    public Lion(String paramName) {
        this.name = paramName;
    }

    public void sayR() {
        System.out.println(name + " RRRRRrrrr");
    }

    public void sayScar() {
        System.out.println(name + " Я... убил... Муфасу!");
    }

    public void sayMufasa() {
        System.out.println(name + " Никогда не забывай о том, кто ты");
    }

    public void saySimba() {
        System.out.println(name + " Aкуна матата");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
