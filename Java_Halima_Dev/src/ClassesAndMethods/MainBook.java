package ClassesAndMethods;

import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Price: ");
        book.price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Book name: ");
        book.title = sc.nextLine();
        System.out.println("Name of author: ");
        book.author_name = sc.nextLine();

        System.out.println("Show all information");
        book.price();
        book.book();
        book.author();
    }
}
