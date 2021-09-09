package kodlama.io;

public class Main {

	public static void main(String[] args) {
		CourseLessons courseLessons1 = new CourseLessons(1,"Yazýlým geliþtirici kampý (Java+React)","Engin Demirog","ücretsiz","6 ay");
		CourseLessons courseLessons2 = new CourseLessons(2,"Yazýlým geliþtirici kampý(C#)","Engin Demirog","ücretsiz","4 ay");
		CourseLessons courseLessons3 = new CourseLessons(3,"Yazýlým geliþtirici kampý(Front End)","Engin Demirog","ücretsiz","3 ay");
		CourseLessons [] listofcourseLessons = {courseLessons1,courseLessons2,courseLessons3};
		
		Students students1=new Students(1,"Ünal Hami","Demir",6161,"Yazýlým geliþtirici kampý (Java+React)");
		Students students2=new Students(2,"Yaþar","Demir",6134,"Yazýlým geliþtirici kampý(C#)");
		Students students3=new Students(3,"Ümit Okan","Demir",3461,"Yazýlým geliþtirici kampý(Front End)");
		Students [] listOfStudents = {students1,students2,students3};
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourseLessons(courseLessons1);
		System.out.println(courseManager.courseName);
		
		
		CourseManager courseManager2=new CourseManager();
		courseManager2.removeCourseLessons(courseLessons2);
		System.out.println(courseManager2.courseName);
		
		
		
		for(CourseLessons courseLessons : listofcourseLessons) {
			System.out.println("Ders id :" +courseLessons.id);
			System.out.println("Öðretmen Adý :" +courseLessons.teacherName);
			System.out.println("Kurs Ücreti :"+courseLessons.courseFee);
			System.out.println("Kurs Süresi :"+courseLessons.courseDuration);
		
		
			
			for(Students students : listOfStudents) {
				System.out.println("Öðrenci id:" +students.id);
				System.out.println("Öðrenci Adý :" +students.studentFirstName);
				System.out.println("Öðrenci Soyadý :"+students.studentLastName);
				System.out.println("Öðrenci Numarasý :"+students.studentNumber);
				System.out.println("Kayýtlý Olduðu Kurs "+students.registeredCourse);
		
		}

		}
		
	
		
	
	
	}

}
