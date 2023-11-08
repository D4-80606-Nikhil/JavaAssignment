
public class FacultyTotal {
 private int total;
 private String faculty;
public final int getTotal() {
	return total;
}
public final void setTotal(int total) {
	this.total = total;
}
public final String getFaculty() {
	return faculty;
}
public final void setFaculty(String faculty) {
	this.faculty = faculty;
}
@Override
public String toString() {
	return "FacultyTotal [total=" + total + ", faculty=" + faculty + "]";
}
public FacultyTotal(int total, String faculty) {
	super();
	this.total = total;
	this.faculty = faculty;
}
 
 
}
