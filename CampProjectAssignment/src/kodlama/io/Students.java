package kodlama.io;

public class Students {
	int id;
	String studentFirstName;
	String studentLastName;
	int studentNumber;
	String registeredCourse;
	
	public Students(int id,String studentFirstName,String studentLastName,
			int studentNumber, String registeredCourse) {
		this();
		this.id=id;
		this.studentFirstName=studentFirstName;
		this.studentLastName=studentLastName;
		this.studentNumber=studentNumber;
		this.registeredCourse=registeredCourse;
	}
	public Students() {
		System.out.println("Öğrenci Bilgileri yükleniyor.");
	}
	
	
}
