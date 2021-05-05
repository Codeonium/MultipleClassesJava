import com.sun.tools.corba.se.idl.constExpr.Not;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String name;
    private ArrayList<Books> stock;
    private Integer capacity;
    private HashMap<String,String> bookCollection;

    public static void main(String[] args) {
        HashMap<String, String> bookCollection = new HashMap<String, String>();
            bookCollection.put("Book", "LOTR");
            bookCollection.put("Book", "The Hobbit");
    }



    public Library(int capacity){
        this.stock = new ArrayList<Books>();
        this.capacity = capacity;
    }

    public void addBook(Books book) {
        if(this.capacity >= this.bookCount()){
        this.stock.add(book);
        this.capacity --;
        }
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

    public int checkCapacity() {
        return this.capacity;
    }

    public boolean stockStatus() {
        if(this.capacity > 0){
            return false;
        } else {
            return true;
        }
    }

    public String collector() {
        return this.bookCollection.get("Book");
    }
}
