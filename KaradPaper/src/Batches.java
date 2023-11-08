
public class Batches {
    private int id;
    private String name;
    private String courses;
    
    public Batches() {
		// TODO Auto-generated constructor stub
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
	public final String getCourses() {
		return courses;
	}
	public final void setCourses(String courses) {
		this.courses = courses;
	}
	
	public Batches(int id, String name, String courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}
	
	
	@Override
	public String toString() {
		return "Batches [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}
    
   
	
}
