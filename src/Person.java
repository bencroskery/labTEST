import java.util.ArrayList;
import java.util.stream.Collectors;

public class Person {
	private Name name;
	private Address address;
	private ArrayList<Course> courses;

	public Person(String first, String last) {
		name = new Name(first, last);
		address = null;
		courses = new ArrayList<>();
	}

	public void setLastName(String name) {
		this.name = new Name(this.name.getFirst(), name);
	}

	public String getLastName() {
		return name.getLast();
	}

	public String getFirstName() {
		return name.getFirst();
	}

	public String getFullName() {
		return name.toString();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public Course[] getCourses() {
		return (Course[]) courses.toArray();
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public void remove(Course course) {
		courses.remove(course);
	}

	public String toString() {
		String s = name.toString();
		if (address != null) {
			s += " lives at " + address.toString() + " and";
		}
		if (!courses.isEmpty()) {
			s += " takes:";
			for (Course c : courses) {
				s += "\n\t" + c.toString();
			}
		} else {
			s += " takes no courses";
		}
		return s;
	}

	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person person = (Person)o;
			
			if (name.equals(person.name) &&
				address == null ? address == person.address : address.equals(person.address) &&
				courses.equals(person.courses)) {
				return true;
			}
		}
		
		return false;
	}

}
