public class Book {
    private String title;
    private String ISBN;
    private String Author;
    private String dateOfPublish;

    Book(String title, String ISBN, String Author, String dateOfPublish) {
        this.title = title;
        this.ISBN = ISBN;
        this.Author = Author;
        this.dateOfPublish =dateOfPublish;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public String getAuthor() {
        return Author;
    }
    public void setDateOfPublish(String dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }
    public String getDateOfPublish() {
        return dateOfPublish;
    }
}
