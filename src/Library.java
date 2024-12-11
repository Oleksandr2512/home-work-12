import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    public List<Book> searchByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
    }

    public List<Book> searchByTitle(String title) {
        return books.stream().filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase())).collect(Collectors.toList());
    }

    public int countBooks() {
        return books.size();
    }
}

