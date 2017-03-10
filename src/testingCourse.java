import static org.junit.Assert.*;

import org.junit.Test;

public class testingCourse {

	@Test
	public void testCourse() {
		Course test = new Course("Sysc 3010", "Bill is Shit");
		if (!(test.getId().equals("Sysc 3010")) && !(test.getName().equals("Bill is Shit"))) {
			fail("Construtor or getters did not work");
		}
	}
	
	@Test
	public void testToString1() {
		Course test = new Course("Sysc 3010", "Bill is Shit");
		Professor prof = new Professor("I", "Stink");
		test.setProfessor(prof);
		String testString = test.toString();
		if (!(testString.equals("Course: Sysc 3010, Name: Bill isShit, Prof: I Stink"))) {
			fail("Construtor or getters did not work");
		}
	}
	
	@Test
	public void testToString2() {
		Course test = new Course("Sysc 3010", "Bill is Shit");
		Professor prof = new Professor("I", "Stink");
		test.setProfessor(prof);
		String testString = test.toString();
		if (!(testString.equals("Course: Sysc 3010, Name: Bill isShit, Prof: I Stink"))) {
			fail("Construtor or getters did not work");
		}
	}
}
