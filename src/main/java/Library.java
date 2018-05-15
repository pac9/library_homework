import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    private HashMap<String, Integer> booksGenre = new HashMap<>();


    public Library(){
        this.stock = new ArrayList<>();
        this.capacity = capacity;

        booksGenre.put("Romance", 100);
        booksGenre.put("Crime", 180);
        booksGenre.put("Science Fiction", 90);
        booksGenre.put("Biography", 50);

        Integer romanceTotal = booksGenre.get("Romance");
        String output = "The Romance books in stock are " + romanceTotal.toString();

        System.out.println(output);

    }

//    public int getBooks(){
//        this.catelogue =  new ArrayList(0);
//
//        return this.catelogue.size();
//    }

    public int bookCount(){
        return this.stock.size();
    }

    public void addBook(Book stock) {
        this.stock.add(stock);
    }

    public int getCapacity(){
        return this.capacity = 1000;
    }

//    public boolean checkIfStockFull() {
//
//        if (bookCount() < getCapacity()) {
//            return true;
//        }
//        return false;
//    }
    public void addBookIfCapacity(Book stock) {

        if (bookCount() < getCapacity()) {
            this.addBook(stock);
        }
    }

    public Book removeBook(){
        return this.stock.remove(0);
    }



}
