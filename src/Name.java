public class Name {
	private String first, last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}

	public String toString() {
		return first + " " + last;
	}

	public boolean equals(Object o) {
		if (o instanceof Name) {
			Name name = (Name)o;
			
			if (first.equals(name.first) && last.equals(name.last)) {
				return true;
			}
		}
		
		return false;
	}
}
