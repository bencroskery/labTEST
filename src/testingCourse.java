import static org.junit.Assert.*;

import java.util.ArrayList;

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
		if (!(testString.equals("Course: Sysc 3010, Name: Bill is Shit, Prof: I Stink"))) {
			fail("got:" + testString);
		}
	}
	
	@Test
	public void testToString2() {
		Course test = new Course("Sysc 3010", "Bill is Shit");
		String testString = test.toString();
		if (!(testString.equals("Course: Sysc 3010, Name: Bill is Shit"))) {
			fail("Construtor or getters did not work");
		}
	}
	
	@Test
	public void testEquals1() {
		Course test = new Course("Sysc 3010", "Bill is Shit");
		Course test1 = new Course("Sysc 3010", "Bill is Shit");
		Professor prof = new Professor("I", "Stink");
		test.setProfessor(prof);
		test1.setProfessor(prof);
		if (!(test.equals(test1))) {
			fail("Equals Fails");
		}
	}
	
	@Test
	public void testEquals2() {
		Course test = new Course("Sysc 3010", "Bill is Shit");
		Course test1 = new Course("Sysc 3010", "Bill is Not Shit");
		Professor prof = new Professor("I", "Stink");
		test.setProfessor(prof);
		test1.setProfessor(prof);
		if ((test.equals(test1))) {
			fail("Equals Fails");
		}
	}
	
	@Test
	public void testaddStudent() {
		Course test = new Course("Sysc 3010", "Bill is Shit");
		Professor prof = new Professor("I", "Stink");
		test.setProfessor(prof);
		Student stud = new Student("Bill", "Shit");
		test.addStudent(stud);
		ArrayList<Student> studs = test.getStudents();
		if (!(studs.contains(stud))) {
			fail("Add student Fail");
		}
	}
	
	@Test
	public void testremoveStudent() {
		Course test = new Course("Sysc 3010", "Bill is Shit");
		Professor prof = new Professor("I", "Stink");
		test.setProfessor(prof);
		Student stud = new Student("Bill", "Shit");
		test.addStudent(stud);
		test.removeStudent(stud);
		ArrayList<Student> studs = test.getStudents();
		if ((studs.contains(stud))) {
			fail("Remove student Fail");
		}
	}
}
