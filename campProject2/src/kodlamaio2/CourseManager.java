package kodlamaio2;

public class CourseManager {
	
	public void add(BackendDeveloper course) {
		System.out.println(course.getId()+"  :Kaydedildi..");
		System.out.println(course.getCourseClass()+"  :Kaydedildi..");
		System.out.println(course.getCourseSchedules()+"  :Kaydedildi..");
		System.out.println(course.getCourseDuration()+"  :Kaydedildi..");
		
	}
	public void add(FrontEndDeveloper course) {
		System.out.println(course.getId()+"  :Kaydedildi..");
		System.out.println(course.getCourseTime()+"  :Kaydedildi..");
		System.out.println(course.getCourseInstructor()+"  :Kaydedildi..");
		System.out.println(course.getCourseDuration()+"  :Kaydedildi..");
		
	}
	
	public void remove(BackendDeveloper course) {
		System.out.println(course.getId()+"  :Silindi..");
		System.out.println(course.getCourseClass()+"  :Silindi..");
		System.out.println(course.getCourseSchedules()+"  :Silindi..");
		System.out.println(course.getCourseDuration()+"  :Silindi..");
		
	}
	
	public void remove(FrontEndDeveloper course) {
		System.out.println(course.getId()+"  :Silindi..");
		System.out.println(course.getCourseInstructor()+"  :Silindi..");
		System.out.println(course.getCourseTime()+"  :Silindi..");
		System.out.println(course.getCourseDuration()+"  :Silindi..");
		
	}
	public void update(BackendDeveloper course) {
		System.out.println(course.getId()+"  :GŁncellendi..");
		System.out.println(course.getCourseClass()+"  :GŁncellendi..");
		System.out.println(course.getCourseSchedules()+"  :GŁncellendi..");
		System.out.println(course.getCourseDuration()+"  :GŁncellendi..");
		
	}
	
	public void update(FrontEndDeveloper course) {
		System.out.println(course.getId()+"  :GŁncellendi..");
		System.out.println(course.getCourseInstructor()+"  :GŁncellendi..");
		System.out.println(course.getCourseTime()+"  :GŁncellendi..");
		System.out.println(course.getCourseDuration()+"  :GŁncellendi..");
		
	}

}
