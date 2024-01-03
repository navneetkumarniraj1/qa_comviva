package assert_tests;
import org.email.validation.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions.*;

public class Assert_Email_validator {
	@Test
	public void validemailcheck() {
		EmailValidator obj=new EmailValidator();
		assertTrue(obj.isValidEmail("navneet@gmail.com"));
		assertFalse(obj.isValidEmail("navneet.com"));
		assertEquals(false,obj.isValidEmail(""),"Empty email");
		assertEquals(false,obj.isValidEmail("navneet @gmail.com"));
		
	}
	@Test
	public void corporateemailcheck() {
		EmailValidator obj=new EmailValidator();
		assertFalse(obj.isCorporateEmail("navneet@gmail.com"));
		assertTrue(obj.isCorporateEmail("navneet@company.com"));
		assertEquals(false,obj.isValidEmail(""),"Empty email");
		assertEquals(false,obj.isValidEmail("navneet @company.com"));
	}

}
