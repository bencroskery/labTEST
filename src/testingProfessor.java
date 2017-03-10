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
	public void testSetOffice() {
		Professor prof = new Professor("I","Stink");
		prof.
		if (!(profString.toString().equals("First Name: I, Last Name: Stink"))) {
			fail("Professor contructor has failed or to string");
		}
	}

}
