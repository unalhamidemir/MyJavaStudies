package kodlama.io;

public class CourseManager extends CourseLessons{
	
	public void addCourseLessons(CourseLessons courseLessons) {
		System.out.println("Kurs Ekleme Yap�ld� :"+courseLessons.courseName);
		
	}
	public void removeCourseLessons(CourseLessons courseLessons) {
		System.out.println("Kurs Silindi :"+courseLessons.courseName);
	}
}
