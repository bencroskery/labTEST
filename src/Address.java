import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address
{
    private int unit;
    private String street;
    private String city;
    private String postalCode;

    public Address (String street, String city, String postalCode) throws Exception
    {
    	this.street = street;
    	this.city = city;
    	this.postalCode = postalCode;
    	this.unit = 0;
    	if (!this.isValidPostalCode(this.postalCode)){
    		throw new Exception();
    	}
    };
    public Address (int unit, String street, String city, String postalCode) throws Exception
    { 
    	this.street = street;
    	this.city = city;
    	this.postalCode = postalCode;
    	this.unit = unit;
    	if (!this.isValidPostalCode(this.postalCode)){
    		throw new Exception();
    	}
    };

    public String toString() { 
    	String a = "Unit: " + this.unit + ", Street: " + this.street + ", City: " + this.city  + ", Postal Code: " + this.postalCode;
    	return a;
    	}
    
    public boolean equals(Object o) { 
    	Address a = (Address) o;
    	if (!this.street.equals(a.street))
    		return false;
    	else if (!this.city.equals(a.city))
    		return false;
    	else if (!this.postalCode.equals(a.postalCode))
    		return false;
    	else if (! (this.unit == a.unit))
    		return false;
    	return true; 
    	}
     
    private boolean isValidPostalCode( String postalCode ) { 
    	String regex = "[A-z][0-9][A-z] ?[0-9][A-z][0-9]$";
    	Pattern pattern = Pattern.compile(regex);
    	Matcher matcher = pattern.matcher(postalCode);
    	return matcher.matches();
    	}
 
} 
