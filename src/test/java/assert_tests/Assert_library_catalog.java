package assert_tests;
import org.library.system.Book;
import org.library.system.LibraryCatalog;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions.*;

public class Assert_library_catalog {
	@Test
			public void borrowbook() {
				LibraryCatalog librarycatalog =new LibraryCatalog();
				
				Book book1= new Book("Live like a monk","Jay Shetty");
				
				librarycatalog.addBook(book1);
				librarycatalog.borrowBook("Live like a monk");
				assertFalse(book1.isAvailable());
			}
			@Test
			public void returnbook() {
				LibraryCatalog librarycatalog =new LibraryCatalog();
				
				Book book1= new Book("Live like a monk","Jay Shetty");
				
				librarycatalog.addBook(book1);
				librarycatalog.returnBook("Live like a monk");
				assertTrue(book1.isAvailable());
			}
			
		
		
}

