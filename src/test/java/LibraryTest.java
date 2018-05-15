import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book stock;

    @Before
    public void before(){
        library = new Library();
        stock = new Book();
    }

    @Test
    public void hasBooks() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(stock);
        assertEquals(1, library.bookCount());
    }


    @Test
    public void getCapacity(){
        assertEquals(1000, library.getCapacity());
    }

//    @Test
//    public void checkIfStockFull(){
//
//        assertEquals(true, library.checkIfStockFull());
//    }

    @Test
    public void addBookIfCapacity(){
        library.addBookIfCapacity(stock);
        assertEquals(1, library.bookCount());
    }


}
