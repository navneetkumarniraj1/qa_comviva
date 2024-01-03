package assert_tests;
import org.string.operation.StringUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions.*;

public class Assert_string_validation {
	@Test
	 public void stringcheck() {
		StringUtils obj=new StringUtils();
		//basic reverse test
		assertEquals("olleh",obj.reverse("hello"));
		
		//Empty string test
		assertEquals("",obj.reverse(""),"Empty String");
		
		
		//String with number and special character	
		assertEquals("%$#@!654",obj.reverse("456!@#$%"));
		
		//String with whites
		assertEquals("dlrow olleh",obj.reverse("hello world"));
		
		
	}
	@Test
	public void pallindromecheck() {
		StringUtils obj=new StringUtils();
		
		//checking pallindrome 
		assertEquals(true,obj.isPalindrome("radar"));
		assertEquals(false,obj.isPalindrome("hello"));
				
		//empty string is considered as pallindrome
		assertEquals(true,obj.isPalindrome(""));
				
		//string with white space
		assertEquals(true,obj.isPalindrome("radar radar"));
	}
	@Test
	public void concatenatecheck() {
		StringUtils obj=new StringUtils();	
		assertEquals("Helloworld",obj.concatenate("Hello", "world"));
		
		//empty string
		assertEquals("",obj.concatenate("", ""));
		
		//concatination of string with space
		assertEquals("Hello",obj.concatenate("Hello", ""));
		
		//string with number and special character
		assertEquals("12a3@#$^&",obj.concatenate("12a3@#$", "^&"));
		
		//string with white space
		assertEquals(" Helloworld ",obj.concatenate(" Hello", "world "));
	}
	@Test
	public void countcheck() {
		StringUtils obj=new StringUtils();
		assertEquals(2,obj.countOccurrences("Hello", 'l'));
		
		//string with number and special character
		assertEquals(2,obj.countOccurrences("12388563asd@@#", '@'));
		
	}
	
}
