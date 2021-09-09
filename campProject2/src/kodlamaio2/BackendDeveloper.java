package kodlamaio2;

public class BackendDeveloper extends Course {
	
	String courseClass;
	String courseSchedules;
	
	
	public BackendDeveloper() {
		
	}
	
	
	
	
	
	
	public BackendDeveloper(String courseClass, String courseSchedules) {
		super();
		this.courseClass = courseClass;
		this.courseSchedules = courseSchedules;
	}
	public String getCourseClass() {
		return courseClass;
	}
	public void setCourseClass(String courseClass) {
		this.courseClass = courseClass;
	}
	public String getCourseSchedules() {
		return courseSchedules;
	}
	public void setCourseSchedules(String courseSchedules) {
		this.courseSchedules = courseSchedules;
	}


}
