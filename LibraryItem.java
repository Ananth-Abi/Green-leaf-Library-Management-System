public abstract class LibraryItem {
    String itemId;
    String title;
    String author;
    boolean available;

    public LibraryItem(String itemId, String title, String author, boolean available) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTile(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract String getDetails();

    @Override
    public String toString() {
        return "itemId: " + this.itemId + ", title: " + this.title + ", author: " + this.author + ", available: " + this.available;
    }
}
