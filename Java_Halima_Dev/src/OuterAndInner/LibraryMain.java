package OuterAndInner;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        library.showContent();
    }
}

class Library{
    String book1 = "Sherlock Holmes";
    String book2 = "Cat detective journey";
    String book3 = "Maisie Hitchins";

    void showContent(){
        Book book = new Book();
        book.showBooks();
    }

    class Book{
        void showBooks(){
            System.out.println("Эта книга про: " + book1);
            System.out.println("Я читала книгу про: " + book2);
            System.out.println("Я читала книгу про: " + book3);

        }
    }
}