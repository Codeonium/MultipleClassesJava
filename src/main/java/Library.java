import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Books> stock;

    public Library(){
        this.stock = new ArrayList<Books>();
    }

    public void addBook(Books book) {
        this.stock.add(book);
    }
    public int bookCount() {
        return this.stock.size();
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void removeBook(Books book) {
        this.stock.remove(0);
    }
}
