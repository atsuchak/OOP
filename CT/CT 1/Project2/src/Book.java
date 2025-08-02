public class Book extends Library{
    String title;

    Book() {
        //default
    }
    Book(int id, String name, String title) {
        super(id, name);
        this.title = title;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Book Title: "+title);
    }
}
