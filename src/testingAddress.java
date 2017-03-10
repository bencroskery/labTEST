package unitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class testingAddress {

	@Test
	public void testAddress1() {
		Address testAddress = null;
		try {
			testAddress = new Address("thisSucks", "Ottawa","k1g5u6");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Exception");
		}
		String expection = "Unit: 0, Street: thisSucks, City: Ottawa, Postal Code: k1g5u6";
		
		if (!(testAddress.toString().equals(expection)) ){
			fail("Address was not created with the first Construtor");
		}
	}
	
	@Test
	public void testAddress2() {
		Address testAddress=null;
		try {
			testAddress = new Address(10, "thisSucks", "Ottawa","k1g5u6");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Exception");
		}
		String expection = "Unit: 10, Street: thisSucks, City: Ottawa, Postal Code: k1g5u6";
		
		if (!(testAddress.toString().equals(expection)) ){
			fail("Address was not created with the second Construtor");
		}
	}
	
	@Test
	public void testAddress3() {
		try {
			Address testAddress = new Address(10, "thisSucks", "Ottawa","1kg5u6");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return;
		}
		fail("Did not get exception for invaild postal code");
	}
	
	public void testEquals1() {
		Address testAddress = null;
		Address testAddress1 = null;
		try {
			testAddress = new Address(10, "thisSucks", "Ottawa","k1g5u6");
			testAddress1 = new Address(10, "thisSucks", "Ottawa","k1g5u6");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Exception");
		}
		if(!(testAddress.equals(testAddress1))) {
			fail("Equals did not work");
		}	
	}
	
	public void testEquals2() {
		Address testAddress = null;
		Address testAddress1 = null;
		try {
			testAddress = new Address(10, "thisisPoop", "Ottawa","k1g5u6");
			testAddress1 = new Address(10, "thisSucks", "Ottawa","k1g5u6");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Exception");
		}
		if(!(testAddress.equals(testAddress1))) {
			fail("Equals did not work");
		}	
	}
}
