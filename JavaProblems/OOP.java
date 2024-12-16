

public class OOP {
   
    public static void main(String[] args) {
        
       Library library = new Library();
       
       Book book1 = new Book("1984", "George Orwell", 9.99);
       Book book2 = new Book("Atomic habits", "James Clear", 19.99);
       Book book3 = new Book("Harry Potter", "Someone", 5.99);
       
       library.addBook(book1);
       library.addBook(book2);
       library.addBook(book3);
       
       library.displayAllBooks();


    }
}