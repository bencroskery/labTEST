public class Student extends Person {
	private static int nextFreeNumber = 0;
	private int number;

	public Student(String first, String last) {
		super(first, last);
		number = nextFreeNumber;
	}

	public int getNumber() {
		return number;
	}

	public boolean equals(Object o) {
		if (super.equals(o) && o instanceof Student) {
			Student student = (Student)o;
			
			if (number == student.number) {
				return true;
			}
		}
		
		return false;
	}
	// You decide if you need toString()
}
