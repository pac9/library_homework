import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(){
        this.stock = new ArrayList<>();
        this.capacity = capacity;
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


}
