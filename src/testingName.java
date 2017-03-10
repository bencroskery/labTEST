import static org.junit.Assert.*;

import org.junit.Test;

public class testingName {

	@Test
	public void testName() {
		Name test = new Name("Billy", "Boi");

		assertEquals("Billy", test.getFirst());
		assertEquals("Boi", test.getLast());
	}

	@Test
	public void testToString1() {
		Name test = new Name("Billy", "Boi");

		assertEquals("Billy Boi", test.toString());
	}

	@Test
	public void testToString2() {
		Name test = new Name("Billy is", "ya boi");

		assertEquals("Billy is ya boi", test.toString());
	}

	@Test
	public void testEquals() {
		Name test = new Name("Billy", "Boi");
		Name same = new Name("Billy", "Boi");
		Name diff1 = new Name("Johny", "Boi");
		Name diff2 = new Name("Billy", "Man");
		Name diff3 = new Name("Johny", "Man");
		
		assertEquals(same, test);
		assertNotEquals(diff1, test);
		assertNotEquals(diff2, test);
		assertNotEquals(diff3, test);
	}

}
