import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
        }
    }

    public Book findBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void issueBook(int id) {
        Book book = findBook(id);
        if (book != null) {
            book.issueBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(int id) {
        Book book = findBook(id);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public void removeBook(int id) {
        Book book = findBook(id);
        if (book != null) {
            books.remove(book);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}