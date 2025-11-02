public class EBook extends LibraryItem{
    String downloadLink;
    double fileSizeMB;

    public EBook(String itemId, String title, String author, boolean available, String downloadLink, double fileSizeMB) {
        super(itemId, title, author, available);
        this.downloadLink = downloadLink;
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getDetails() {
        return "itemId: " + this.itemId + ", title: " + this.title + ", author: " + this.author + ", available: " + this.available + ", link: " + this.downloadLink + ", fileSize: " + this.fileSizeMB;
    }
}
