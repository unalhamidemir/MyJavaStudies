package kodlamaio2;

public class Course {
	int id;
	String courseDuration;
	
	public Course() {
		
	}
	
	
	
	
	public Course(int id, String courseDuration) {
		super();
		this.id = id;
		this.courseDuration = courseDuration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

}
