package kodlamaio2;

public class Main {

	public static void main(String[] args) {
		Students students1 = new Students();
		students1.setId(1);
		students1.setFirstName("Ünal Hami");
		students1.setLastName("Demir");
		students1.setNationalIdentity("56920452265");
		students1.setEpisode("Backend Devoloper");
		students1.setSchoolNumber("06161");
		System.out.println(students1.getFirstName());
		System.out.println(students1.getLastName());
		System.out.println(students1.getEpisode());
		System.out.println("-----------------------------");
		
		
		Students students2 = new Students();
		students2.setId(2);
		students2.setFirstName("Ogün Abdullah");
		students2.setLastName("Demir");
		students2.setNationalIdentity("56920325568");
		students2.setEpisode("Front End Developer");
		students2.setSchoolNumber("6134");
		System.out.println(students2.getFirstName());
		System.out.println(students2.getLastName());
		System.out.println(students2.getEpisode());
		System.out.println("-----------------------------");
		
		Instructor ýnstructor1 = new Instructor();
		ýnstructor1.setId(3);
		ýnstructor1.setFirstName("Engin");
		ýnstructor1.setLastName("Demirog");
		ýnstructor1.setNationalIdentity("56922455233");
		ýnstructor1.setBracnh("Yazýlým Geliþtirici Öðretim Görevlisi");
		ýnstructor1.setCertificate("MCT,PMP ve ITIL");
		System.out.println(ýnstructor1.getId());
		System.out.println(ýnstructor1.getFirstName());
		System.out.println(ýnstructor1.getLastName());
		System.out.println(ýnstructor1.getBracnh());
		System.out.println(ýnstructor1.getCertificate());
		
		System.out.println("-----------------------------");
		
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.add(students1);
		categoryManager.remove(students2);
		categoryManager.update(ýnstructor1);
		System.out.println("-----------------------------");
		
		
		BackendDeveloper backendDeveloper1 = new BackendDeveloper();
		backendDeveloper1.setId(4);
		backendDeveloper1.setCourseClass("12-B");
		backendDeveloper1.setCourseSchedules("Ýntellij ÝDE, Eclipse,Visual Studio");
		backendDeveloper1.setCourseDuration("2 ay");
		System.out.println(backendDeveloper1.getId());
		System.out.println(backendDeveloper1.getCourseClass());
		System.out.println(backendDeveloper1.getCourseSchedules());
		System.out.println(backendDeveloper1.getCourseDuration());
		System.out.println("-----------------------------");
		
		
		BackendDeveloper backendDeveloper2 = new BackendDeveloper();
		backendDeveloper2.setId(5);
		backendDeveloper2.setCourseClass("10-B");
		backendDeveloper2.setCourseSchedules("SQL,C#,Java,Python");
		backendDeveloper2.setCourseDuration("6 ay");
		System.out.println(backendDeveloper2.getId());
		System.out.println(backendDeveloper2.getCourseClass());
		System.out.println(backendDeveloper2.getCourseSchedules());
		System.out.println(backendDeveloper2.getCourseDuration());
		System.out.println("-----------------------------");
		
		
		FrontEndDeveloper frontEndDeveloper1 = new FrontEndDeveloper();
		frontEndDeveloper1.setId(6);
		frontEndDeveloper1.setCourseInstructor("Engin Demirog");
		frontEndDeveloper1.setCourseTime("3 ay");
		frontEndDeveloper1.setCourseDuration("Günlük 3 Saat");
		System.out.println(frontEndDeveloper1.getId());
		System.out.println(frontEndDeveloper1.getCourseTime());
		System.out.println(frontEndDeveloper1.getCourseInstructor());
		System.out.println(frontEndDeveloper1.getCourseDuration());
		System.out.println("-----------------------------");
		
		
		CourseManager courseManager= new CourseManager();
		courseManager.add(backendDeveloper1);
		courseManager.remove(frontEndDeveloper1);
		courseManager.update(backendDeveloper2);
		
	}

}
