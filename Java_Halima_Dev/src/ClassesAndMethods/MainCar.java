package ClassesAndMethods;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();

        System.out.println("Brend name: ");
        car.brendName = sc.nextLine();
        System.out.println("Model name: ");
        car.modelName = sc.nextLine();
        System.out.println("Color: ");
        car.color = sc.nextLine();
        System.out.println("Max speed: ");
        car.maxSpeed = sc.nextLine();
        System.out.println("Price: ");
        car.price = sc.nextInt();
        car.tornOnCar();

        System.out.println("Show all information");
        car.car_information();
    }
}
