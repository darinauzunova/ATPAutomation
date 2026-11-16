package Block7.ex2;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "J. K. Rowling", 22.33);
        GoldenEditionBook goldenEditionBook = new GoldenEditionBook("Harry Potter", "J. K. Rowling", 22.33);

        System.out.println(book);
        System.out.println("\n" + goldenEditionBook);
    }
}
