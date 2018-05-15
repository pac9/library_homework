import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowed;

    public Borrower(){
        this.borrowed = new ArrayList<>();
    }

    public void borrow(Book stock){
        this.borrowed.add(stock);
    }

    public void borrowBooksFromLibrary(Library library) {
        Book stock = library.removeBook();
        borrow(stock);
    }

    public int booksBorrowed(){
        return this.borrowed.size();
    }




}
