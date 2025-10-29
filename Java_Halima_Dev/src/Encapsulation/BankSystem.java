package Encapsulation;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("Enter your name");
        user.setName(sc.nextLine());
        System.out.println(user.getName());
        System.out.println("Enter your surname");
        user.setSurname(sc.nextLine());
        System.out.println(user.getSurname());
        System.out.println("Enter your phone number");
        user.setPhoneNumber(sc.nextLine());
        System.out.println(user.getPhoneNumber());
        System.out.println("Enter your email");
        user.setEmail(sc.nextLine());
        System.out.println(user.getEmail());
        System.out.println("Enter your card number");
        user.setCardNumber(sc.nextLine());
        System.out.println(user.getCardNumber());
        System.out.println("Enter your birth date");
        user.setBirthDate(sc.nextInt());
        System.out.println(user.getBirthDate());
        System.out.println("Enter your password");
        user.setPassword(sc.nextInt());
        System.out.println(user.getPassword());

        System.out.println("Name is " + user.getName());
        System.out.println("Surname is " + user.getSurname());
        System.out.println("Phone number is " + user.getPhoneNumber());
        System.out.println("Email is " + user.getEmail());
        System.out.println("Card number is " + user.getCardNumber());
        System.out.println("Birth date is " + user.getBirthDate());
        System.out.println("Password is " + user.getPassword());
        sc.close();
    }
}
