import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrowed;
    Book stock;
    Library library;

    @Before
    public void before() {
        borrowed = new Borrower();
        stock = new Book();
        library = new Library();
        library.addBook(stock);
    }

    @Test
    public void shelfStartsEmpty() {
        assertEquals(0, borrowed.booksBorrowed());
    }

    @Test
    public void borrowsBook() {
        borrowed.borrow(stock);
        assertEquals(1, borrowed.booksBorrowed());
    }


    @Test
    public void borrowBooksFromLibrary() {
        borrowed.borrowBooksFromLibrary(library);
        assertEquals(1, borrowed.booksBorrowed());
        assertEquals(0, library.bookCount());
    }
}