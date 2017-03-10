import static org.junit.Assert.*;

import org.junit.Test;

public class TestingPerson {

	@Test
	public void testToString(){
		Person test = new Person ("Billy", "Bob");
		String result = test.toString();
		if(!(result.equals("First Name: Billy, Last Name: Bob"))){
			fail("Getters or Constructor didn't work");
		}
	}
	
	@Test
	public void testEquals(){
		Person test1 = new Person ("Billy", "Bob");
		Person test2 = new Person ("Adam", "Berger");
		if(!(test1.equals(test2))){
			fail("Equals didn't work");
		}	
	}
	
	@Test
	public void testGetLastName(){
		Person test3 = new Person ("Dylan", "Suh");
		String result2 = test3.getLastName();
		if(!(result2.equals("Suh"))){
			fail ("Getter for the last name didn't work");
		}
	}
	
	@Test
	public void testGetFirstName(){
		Person test4 = new Person ("Tommy", "Wang");
		String result3 = test4.getFirstName()
		if(!(result3.equals("Tommy"))){
			fail("Getter for the first name didn't work");
		}
	}
	
	@Test
	public void testGetFullName(){
		Person test5 = new Person("Cam", "Birdi");
		if(!(test5.getFullName()= "First Name: Cam, Last Name: Birdi")));
	}
}
