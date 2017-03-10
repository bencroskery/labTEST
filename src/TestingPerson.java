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
		String result3 = test4.getFirstName();
		if(!(result3.equals("Tommy"))){
			fail("Getter for the first name didn't work");
		}
	}
	
	@Test
	public void testGetFullName(){
		Person test5 = new Person("Cam", "Birdi");
		String result4 = test5.getFullName();
		if(!(result4.equals(test5.toString()))){
			fail("toString fails horribly");
		};
	}
	
	@Test
	public void testSetLastName(){
		Person test7 = new Person ("Rico", "Hola");
		test7.setLastName("Smith");
		if(!(test7.getLastName().equals("Smith"))){
			fail("Setter for Last Name");
		}
	}
	
	@Test 
	public void testSetAddress() {
		Person test6 = new Person ("Davey", "Boy");
		try {
			Address add1 = new Address("42 Fifth Avenue", "New York", "T4E 5F8");
			test6.setAddress(add1);
			if(!(test6.getAddress().equals(add1))){
				fail("setter didn't work");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testgetAddress(){
		Person test8 = new Person ("Ron", "Cherry");
		try {
			Address add2 = new Address("75 Smyth Road", "Ottawa", "R4E 3R4");
			test8.setAddress(add2);
			Address add3 = test8.getAddress();
			if(!(add3.equals(add2))){
				fail("Getter for the address didn't work");
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Test
	public void testAddCourse(){
		Person test9 = new Person("Donny", "Boy");
		Course course1 = new Course("3020", "SYSC");
		test9.addCourse(course1);
		
			
		}
	}
	
	@Test
	public void testRemove(){
		
	}
	
}
