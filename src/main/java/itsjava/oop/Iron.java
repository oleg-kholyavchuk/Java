package itsjava.oop;

public class Iron {

    private String manufacturer;
    private int price;
    private double power;

    public Iron(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Iron(int price) {
        this.price = price;
    }

    public Iron(double power) {
        this.power = power;
    }

    public void manufacturerIron() {

        System.out.println("Производитель " + manufacturer);
    }

    public void priceIron() {
        System.out.println("Цена " + price + " рублей");
    }

    public void powerIron() {
        System.out.println("Мощность " + power + " КВт");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public double getPower() {
        return power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPower(double power) {
        this.power = power;
    }
}

