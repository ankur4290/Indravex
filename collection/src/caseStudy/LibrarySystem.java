import java.util.HashMap;

class Book {
    int id;
    String title;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return id + " " + title;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        HashMap<Integer, Book> books = new HashMap<>();

        books.put(101, new Book(101, "Java"));
        books.put(102, new Book(102, "Spring Boot"));

        System.out.println(books.get(101));

        System.out.println(books);
    }
}