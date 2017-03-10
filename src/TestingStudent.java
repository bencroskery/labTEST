import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestingStudent {

	@Test
	public void testStudent() {
		Student s = new Student ("Dillon", "is Dillon");
		assertEquals  ("Dillon", s.getFirstName());
		assertEquals  ("is Dillon", s.getLastName());
		assertEquals  ("Dillon is Dillon", s.getFullName());
		assertEquals  (0, s.getNumber());
	}
	@Test
	public void testEquals(){
		Student s = new Student ("Ben", "is Ben");
		Student s2 = new Student ("Ben", "is Ben");
		assertEquals (true, s.equals(s2));
	}
	
	

}
