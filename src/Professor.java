
public class Professor extends Person {
	private String office;

	public Professor(String first, String last) {
		super(first, last);
		office = null;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getOffice() {
		return office;
	}


	public boolean equals(Object o) {
		if (super.equals(o) && o instanceof Professor) {
			Professor professor = (Professor)o;
			
			if (office == null ? office == professor.office : office.equals(professor.office)) {
				return true;
			}
		}
		
		return false;
	}
	// You decide if you need toString()
}
