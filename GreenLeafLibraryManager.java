import java.lang.reflect.Member;
import java.util.ArrayList;

public class GreenLeafLibraryManager implements LibraryManager{
    ArrayList<LibraryItem> items;
    ArrayList<Member> members;

    public GreenLeafLibraryManager(ArrayList<LibraryItem> items, ArrayList<Member> members) {
        this.items = items;
        this.members = members;
    }

    @Override
    public void addItem(LibraryItem item) {
        this.items.add(item);
    }

    @Override
    public void removeItem(String id) {
        this.items.remove(id);
    }

    @Override
    public void listItems() {
        // this.items.forEach(n -> System.out.println(n));
        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }

    @Override
    public void borrowBook(String mid, String id) {

    }

    @Override
    public void returnBook(String mid, String id) {

    }

}
