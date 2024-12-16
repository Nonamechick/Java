import java.util.ArrayList;
import java.util.List;



public class Library {
    private List<Book> books;
    
    public Library() {
        books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    } 
    
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The Library is empty.");
        }
        else {
            System.out.println("Books in the library:");
            System.out.println("=====================");
            for (Book book : books) {
                book.displayDetails();
            }
        }
    }
}