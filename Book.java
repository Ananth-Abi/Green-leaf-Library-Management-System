public class Book extends LibraryItem {
    String isbn;
    int publishedYear;

    public Book(String itemId, String title, String author, boolean available, String isbn, int publishYear) {
        super(itemId, title, author, available);
        this.isbn = isbn;
        this.publishedYear = publishedYear;
    }

    @Override
    public String getDetails() {
        return "itemId: " + this.itemId + ", title: " + this.title + ", author: " + this.author + ", available: " + this.available + ", isbn: " + this.isbn + ", year: " + this.publishedYear;
    }
}
