// LibraryItem.java
public class LibraryItem {
    private String title;
    private int itemId;
    private boolean checkedOut;

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
        System.out.println(title + " has been checked out.");
    }

    public void returnItem() {
        checkedOut = false;
        System.out.println(title + " has been returned.");
    }
}

