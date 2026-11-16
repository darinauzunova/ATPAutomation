package Block7.ex2;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    private void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price not valid");
        }
        this.price = price;
    }

    private void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author not valid");
        }
        String[] names = author.trim().split("\\s+");

        if (names.length > 1 && Character.isDigit(names[1].charAt(0))) {
            throw new IllegalArgumentException("Author is not valid");
        }
        this.author = author;
    }

    private void setTitle(String title) {
        if (title == null || title.length() < 3) {
            throw new IllegalArgumentException("Title not valid");
        }
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
                "Title: %s%nAuthor: %s%nPrice: %.1f",
                title, author, getPrice()
        );
    }
}
