package kodlamaio2;

public class FrontEndDeveloper extends Course{
	String courseTime;
	String courseInstructor;
	
	public FrontEndDeveloper() {
		
	}
	
	
	
	
	public FrontEndDeveloper(String courseTime, String courseInstructor) {
		super();
		this.courseTime = courseTime;
		this.courseInstructor = courseInstructor;
	}
	
	
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	public String getCourseInstructor() {
		return courseInstructor;
	}
	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	
}
