package itsjava.oop;

public class Pills {

    private String title;
    private int quantity;
    private double dose;

    public Pills(String title) {
        this.title = title;
    }

    public Pills(int quantity) {
        this.quantity = quantity;
    }

    public Pills(double dose) {
        this.dose = dose;
    }

    public void titlePills() {

        System.out.println("Название " + title);
    }

    public void quantityPills() {
        System.out.println("Количество таблеток " + quantity + " штук");
    }

    public void dosePliss() {
        System.out.println("Доза " + dose + " мгр");
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDose() {
        return dose;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }
}
