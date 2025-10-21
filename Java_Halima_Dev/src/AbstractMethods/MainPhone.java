package AbstractMethods;

import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {
        IPhone phone1 = new IPhone();
        Scanner scanner = new Scanner(System.in);
        phone1.brand = "Apple";
        phone1.model = "17 pro max";
        phone1.storage = 512;
        phone1.userPhoto = "myphoto.png";
        phone1.sentMessage = scanner.nextLine();

        phone1.phoneInfo();
        phone1.takePhoto();
        phone1.sendMessage();
        scanner.close();
    }
}

abstract class Phone{
    String brand;
    String model;
    int storage;
    String userPhoto;
    String sentMessage;
    String userSearch;

    abstract void phoneInfo();
    abstract void sendMessage();
    abstract void takePhoto();
    abstract void setUserSearch();

}

class IPhone extends Phone{
    @Override
    void phoneInfo(){
        System.out.println("Phone brand: " + brand);
        System.out.println("Phone model: " + model);
        System.out.println("Phone storage: " + storage + " gb");
    }
    @Override
    void sendMessage(){
        System.out.println("message was sent: " + sentMessage);
    }
    @Override
    void takePhoto(){
        System.out.println("User's photo: " + userPhoto);
    }
    @Override
    void setUserSearch(){

    }
}

//class SearchPhone extends Phone{
//
//}