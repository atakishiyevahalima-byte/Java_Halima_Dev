package ClassesAndMethods;

public class Book {
    double price;
    String title;
    String author_name;

    void price(){
        System.out.println("Price: " + price);
    }

    void book(){
        System.out.println("Name of book: " + title);
    }

    void author(){
        System.out.println("Author name: " + author_name);
    }
}
