
public class ResultModules {
  private int id;
  private int days;
@Override
public String toString() {
	return "ResultModules [id=" + id + ", days=" + days + "]";
}
public ResultModules(int id, int days) {
	super();
	this.id = id;
	this.days = days;
}
public final int getId() {
	return id;
}
public final void setId(int id) {
	this.id = id;
}
public final int getDays() {
	return days;
}
public final void setDays(int days) {
	this.days = days;
}
  
  
}


