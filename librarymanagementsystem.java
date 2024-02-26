// LibraryManagementSystem.java
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating a book object
        Book book1 = new Book("Java Programming", 101, "John Doe");

        // Accessing methods from the superclass
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Item ID: " + book1.getItemId());

        // Accessing methods from the subclass
        System.out.println("Author: " + book1.getAuthor());

        // Checking out and returning a book
        book1.checkOut();
        book1.returnItem();
    }
}

