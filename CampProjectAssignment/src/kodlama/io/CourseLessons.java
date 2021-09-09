package kodlama.io;

public class CourseLessons {
	int id;
	String courseName;
	String teacherName;
	String courseFee;
	String courseDuration;

	public CourseLessons(int id,String courseName,String teacherName,
			String courseFee,String courseDuration) {
		this();
		this.id=id;
		this.courseName=courseName;
		this.teacherName=teacherName;
		this.courseFee=courseFee;
		this.courseDuration=courseDuration;
	}
	public CourseLessons() {
		System.out.println("Kurs Bilgileri yükleniyor.");
	}
}