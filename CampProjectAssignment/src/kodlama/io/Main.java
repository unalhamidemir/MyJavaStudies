package kodlama.io;

public class Main {

	public static void main(String[] args) {
		CourseLessons courseLessons1 = new CourseLessons(1,"Yaz�l�m geli�tirici kamp� (Java+React)","Engin Demirog","�cretsiz","6 ay");
		CourseLessons courseLessons2 = new CourseLessons(2,"Yaz�l�m geli�tirici kamp�(C#)","Engin Demirog","�cretsiz","4 ay");
		CourseLessons courseLessons3 = new CourseLessons(3,"Yaz�l�m geli�tirici kamp�(Front End)","Engin Demirog","�cretsiz","3 ay");
		CourseLessons [] listofcourseLessons = {courseLessons1,courseLessons2,courseLessons3};
		
		Students students1=new Students(1,"�nal Hami","Demir",6161,"Yaz�l�m geli�tirici kamp� (Java+React)");
		Students students2=new Students(2,"Ya�ar","Demir",6134,"Yaz�l�m geli�tirici kamp�(C#)");
		Students students3=new Students(3,"�mit Okan","Demir",3461,"Yaz�l�m geli�tirici kamp�(Front End)");
		Students [] listOfStudents = {students1,students2,students3};
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourseLessons(courseLessons1);
		System.out.println(courseManager.courseName);
		
		
		CourseManager courseManager2=new CourseManager();
		courseManager2.removeCourseLessons(courseLessons2);
		System.out.println(courseManager2.courseName);
		
		
		
		for(CourseLessons courseLessons : listofcourseLessons) {
			System.out.println("Ders id :" +courseLessons.id);
			System.out.println("��retmen Ad� :" +courseLessons.teacherName);
			System.out.println("Kurs �creti :"+courseLessons.courseFee);
			System.out.println("Kurs S�resi :"+courseLessons.courseDuration);
		
		
			
			for(Students students : listOfStudents) {
				System.out.println("��renci id:" +students.id);
				System.out.println("��renci Ad� :" +students.studentFirstName);
				System.out.println("��renci Soyad� :"+students.studentLastName);
				System.out.println("��renci Numaras� :"+students.studentNumber);
				System.out.println("Kay�tl� Oldu�u Kurs "+students.registeredCourse);
		
		}

		}
		
	
		
	
	
	}

}
