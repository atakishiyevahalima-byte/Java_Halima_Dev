package AbstractMethods;

import java.util.Scanner;

public class MyPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TelePhone phone = new TelePhone();
        phone.brand = "Xiaomi";
        phone.model = "15 Ultra";
        phone.storage = 256;
        System.out.println("Write some text: ");
        phone.text = scanner.nextLine();
        System.out.println("Write price: ");
        phone.price = scanner.nextDouble();
        System.out.println("Write percent of discount: ");
        phone.percent = scanner.nextDouble();

        phone.phoneInfo();
        phone.writeText();
        phone.discount();

        scanner.close();
    }
}

abstract class Devices{
    String brand;
    String model;
    String text;
    int storage;
    double price;
    double percent;

    abstract void phoneInfo();
    abstract void writeText();
    void discount(){
        price -= (price * percent / 100);
        System.out.println("Новая цена! " + price);
    }
}

class TelePhone extends Devices{
    @Override
    void phoneInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);
    }
    @Override
    void writeText(){
        System.out.println("Text is: " + text);
    }
}