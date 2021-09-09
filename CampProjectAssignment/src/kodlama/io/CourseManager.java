package kodlama.io;

public class CourseManager extends CourseLessons{
	
	public void addCourseLessons(CourseLessons courseLessons) {
		System.out.println("Kurs Ekleme Yapýldý :"+courseLessons.courseName);
		
	}
	public void removeCourseLessons(CourseLessons courseLessons) {
		System.out.println("Kurs Silindi :"+courseLessons.courseName);
	}
}
