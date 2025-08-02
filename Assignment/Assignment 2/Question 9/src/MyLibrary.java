import java.util.ArrayList;
import java.util.Collection;

class DuplicateItemException extends Exception {
    public DuplicateItemException(String message) {
        super(message);
    }
}
class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}


public class MyLibrary {
    private ArrayList<Book> alist = new ArrayList<>() ;

    public ArrayList<Book> getAlist() {
        return alist;
    }
    public void setAlist(ArrayList<Book> alist) {
        this.alist = alist;
    }

    public void addBook(Book b) throws DuplicateItemException {
        for(Book book : alist) {
            if(book.getTitle().equals(b.getTitle()) && book.getISBN().equals(b.getISBN())) {
                throw new DuplicateItemException("Book already exists");
            }
        }
        alist.add(b);
    }

    public Book searchBook(String title) throws ItemNotFoundException {
        for(Book book: alist) {
            if(book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new ItemNotFoundException("Book doesn;t exists");
    }


    public static void main(String[] args) {
        MyLibrary ml = new MyLibrary();

        try {
            ml.addBook(new Book("To kill a Mockingbird", "8123", "Harper Lee", "05-11-1960"));
            ml.addBook(new Book("The Great Gatsby", "1212", "F. Scott Fitzgerald", "26-04-1925"));
            ml.addBook(new Book("One Hundred Years of Solitude", "9280", "Gabriel Marquez", "13-11-1967"));
            ml.addBook(new Book("The Great Gatsby", "1212", "F. Scott Fitzgerald", "26-04-1925"));
        } catch (DuplicateItemException e) {
            System.out.println("Exception found " + e);
        }

        try {
            Book book1 = ml.searchBook("One Hundred Years of Solitude");
            System.out.println("Book name: " + book1.getTitle() + " Author: " + book1.getAuthor());
            Book book2 = ml.searchBook("Brave New World");
            System.out.println("Book name: " + book2.getTitle() + ", Author: " + book2.getAuthor());
        }catch (ItemNotFoundException e) {
            System.out.println("Exception found: " +e);
        }
    }
}
