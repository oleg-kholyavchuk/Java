package itsjava.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите возраст и имя");
        Lion simba = new Lion("Sinba");
        Lion nala = new Lion("Nala");
        Lion mufasa = new Lion("Mufasa");
        Lion scar = new Lion("Scar");
        Cat bagira = new Panther();


        Scanner temp2 = new Scanner(System.in);
        Scanner temp1 = new Scanner(System.in);
        int age = temp1.nextInt();
        String name = temp2.nextLine();
        Human nemeHuman = new Human(name);
        Human ageHuman = new Human(age);

        System.out.println("Введите произвоителя, цену и мощность");
        Scanner temp5 = new Scanner(System.in);
        Scanner temp6 = new Scanner(System.in);
        Scanner temp7 = new Scanner(System.in);
        String manufacturer = temp5.nextLine();
        int price = temp6.nextInt();
        double power = temp7.nextDouble();
        Iron manufacturerIronMain = new Iron(manufacturer);
        Iron priceIronMain = new Iron(price);
        Iron powerIronMain = new Iron(power);



        bagira.sayMeow();
        simba.sayMufasa();
        simba.saySimba();
        nala.sayR();
        mufasa.sayMufasa();
        scar.sayScar();
        System.out.println();
        nemeHuman.humanName();
        ageHuman.humanAge();
        System.out.println();
        manufacturerIronMain.manufacturerIron();
        priceIronMain.priceIron();
        powerIronMain.powerIron();

        simba.setName("Симба");
        String simbaName = simba.getName();
        System.out.println(simbaName);

        simba.setName("Король Симба");
        System.out.println("simba.getName() = " + simba.getName());

        System.out.println("Введите возраст и имя");
        Scanner temp3 = new Scanner(System.in);
        Scanner temp4 = new Scanner(System.in);
        int age2 = temp3.nextInt();
        String name2 = temp4.nextLine();

        nemeHuman.setName(name2);
        String humanNametemp = nemeHuman.getName();
        System.out.println(humanNametemp);
        System.out.println("nemeHuman.getNameHuman() = " + nemeHuman.getName());
        ageHuman.setAge(age2);
        int ageHumanTemp = ageHuman.getAge();
        System.out.println(ageHumanTemp);
        System.out.println("ageHuman.getAgeHuman() = " + ageHuman.getAge());
        System.out.println();

        manufacturerIronMain.setManufacturer("Samsung");
        String manufacturerIronMainTemp = manufacturerIronMain.getManufacturer();
        System.out.println(manufacturerIronMainTemp);
        priceIronMain.setPrice(4000);
        int priceIronTemp = priceIronMain.getPrice();
        System.out.println(priceIronTemp);
        powerIronMain.setPower(2);
        double powerIronTemp = powerIronMain.getPower();
        System.out.println(powerIronTemp);
        manufacturerIronMain.getManufacturer();
        priceIronMain.getPrice();
        powerIronMain.getPower();
        System.out.println();

        System.out.println("Введите название, количество и дозу");
        Scanner temp8 = new Scanner(System.in);
        Scanner temp9 = new Scanner(System.in);
        Scanner temp10 = new Scanner(System.in);
        String title = temp8.nextLine();
        int quantity = temp9.nextInt();
        double dose = temp10.nextDouble();
        Pills titlePillsMain = new Pills(title);
        Pills quantityPillsMain = new Pills(quantity);
        Pills dosePillsMain = new Pills(dose);

        titlePillsMain.titlePills();
        quantityPillsMain.quantityPills();
        dosePillsMain.dosePliss();
        titlePillsMain.setTitle("Carbaglu");
        String titlePilsTemp = titlePillsMain.getTitle();
        System.out.println(titlePilsTemp);
        quantityPillsMain.setQuantity(5);
        int quantityPillsMainTemp = quantityPillsMain.getQuantity();
        System.out.println(quantityPillsMainTemp);
        dosePillsMain.setQuantity(200);
        double dosePillsMainTemp = dosePillsMain.getDose();
        System.out.println(dosePillsMainTemp);
    }
}
