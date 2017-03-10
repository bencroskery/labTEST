import static org.junit.Assert.*;

import org.junit.Test;

public class testingProfessor {

	@Test
	public void testProfessor() {
		Professor prof = new Professor("I","Stink");
		String profString = prof.toString();
		if (!(profString.toString().equals("First Name: I, Last Name: Stink"))) {
			fail("Professor contructor has failed or to string");
		}
	}
	
	@Test
	public void testSetOffice1() {
		Professor prof = new Professor("I","Stink");
		prof.setOffice("Court");
		if (!(prof.getOffice().equals("Court"))) {
			fail("Failed setting office got: " + prof.getOffice());
		}
	}
	
	@Test
	public void testSetOffice2() {
		Professor prof = new Professor("I","Stink");
		prof.setOffice("Court");
		if ((prof.getOffice().equals("hahhahahahah"))) {
			fail("Failed setting office got: " + prof.getOffice());
		}
	}
	
	@Test
	public void testEquals1() {
		Professor prof = new Professor("I","Stink");
		Professor prof1 = new Professor("I","Stink");
		prof.setOffice("Court");
		prof1.setOffice("Court");
		if (!(prof.equals(prof1))) {
			fail("Failed Equals, Got: " + prof.equals(prof1));
		}
	}
	
	@Test
	public void testEquals2() {
		Professor prof = new Professor("I","Stink");
		Professor prof1 = new Professor("I","Not");
		prof.setOffice("Court");
		prof1.setOffice("Thing");
		if (prof.equals(prof1)) {
			fail("Failed Equals, Got: " + prof.equals(prof1));
		}
	}

}
