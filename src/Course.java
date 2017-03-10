import java.util.ArrayList;

public class Course
{
    private String id;
    private String name;
    private Professor professor;
    private ArrayList<Student>students;
    
    public Course( String id, String name) {
    	this.id = id;
    	this.name = name;
    	this.professor = null;
    	this.students = null;
    };
    
    public String getId() { return id; } 
    public String getName( ) { return name; }

    public String toString() { 
    	if (this.professor == null){
    	String a = "Course: " + this.id + ", Name: " + this.name;
    	return a; }
    	String a  = "Course: " + this.id + ", Name: " + this.name + ", Professor: " + this.professor.getFullName();
    	return a;
    }
    public boolean equals(Object o) { 
    	Course c = (Course) o;
    	if (!this.id.equals(c.id))
    		return false;
    	else if (!this.name.equals(c.name))
    		return false;
    	else if (!this.professor.equals(c.professor))
    		return false;
    	else if (!this.students.equals(c.students))
    		return false;
    	return true;
    	}

    public void setProfessor(Professor professor) {
    	this.professor = professor;
    };
    public Professor getProfessor() { return this.professor; }

    public void addStudent( Student student ) {students.add(student);};
    public void removeStudent( Student student ) {students.remove(student);};
    public ArrayList<Student> getStudents() { return this.students; }
    
    
}
