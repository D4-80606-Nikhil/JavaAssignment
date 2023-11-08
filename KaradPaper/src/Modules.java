
public class Modules {
  private int id;
  private String name;
  private String date;
  private int days;
  private String faculty;
  private int batchid;
public Modules(int id, String name, String date, int days, String faculty, int batchid) {
	super();
	this.id = id;
	this.name = name;
	this.date = date;
	this.days = days;
	this.faculty = faculty;
	this.batchid = batchid;
}
public final int getId() {
	return id;
}
public final void setId(int id) {
	this.id = id;
}
public final String getName() {
	return name;
}
public final void setName(String name) {
	this.name = name;
}
public final String getDate() {
	return date;
}
public final void setDate(String date) {
	this.date = date;
}
public final int getDays() {
	return days;
}
public final void setDays(int days) {
	this.days = days;
}
public final String getFaculty() {
	return faculty;
}
public final void setFaculty(String faculty) {
	this.faculty = faculty;
}
public final int getBatchid() {
	return batchid;
}
public final void setBatchid(int batchid) {
	this.batchid = batchid;
}
@Override
public String toString() {
	return "Modules [id=" + id + ", name=" + name + ", date=" + date + ", days=" + days + ", faculty=" + faculty
			+ ", batchid=" + batchid + "]";
}
  
  
}
