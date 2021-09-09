package kodlamaio2;

public class CategoryManager extends Category{
	
	public void add(Instructor category) {
		System.out.println(category.getId() +"  :Kaydedildi..");
		System.out.println(category.getFirstName() +"  :Kaydedildi..");
		System.out.println(category.getLastName() +"  :Kaydedildi..");
		System.out.println(category.getNationalIdentity() +"  :Kaydedildi..");
		System.out.println(category.getCertificate() +"  :Kaydedildi..");
		System.out.println(category.getBracnh() +"  :Kaydedildi..");
	}
	
	public void add(Students category) {
		
		System.out.println(category.getId() +"  :Kaydedildi..");
		System.out.println(category.getFirstName()+"  :Kaydedildi..");
		System.out.println(category.getLastName()+"  :Kaydedildi..");
		System.out.println(category.getNationalIdentity() +"  :Kaydedildi..");
		System.out.println(category.getEpisode() +"  :Kaydedildi..");
		System.out.println(category.getSchoolNumber() +"  :Kaydedildi..");
		
	}
	public void remove(Instructor category) {
		System.out.println(category.getId() +"  :Silindi..");
		System.out.println(category.getFirstName() +"  :Silindi..");
		System.out.println(category.getLastName() +"  :Silindi..");
		System.out.println(category.getNationalIdentity() +"  :Silindi..");
		System.out.println(category.getCertificate() +"  :Silindi..");
		System.out.println(category.getBracnh() +"  :Silindi..");
	}
	
	public void remove(Students category) {
		System.out.println(category.getId() +"  :Silindi..");
		System.out.println(category.getFirstName()+"  :Silindi..");
		System.out.println(category.getLastName()+" :Silindi..");
		System.out.println(category.getNationalIdentity() +"  :Silindi..");
		System.out.println(category.getEpisode() +"  :Silindi..");
		System.out.println(category.getSchoolNumber() +"  :Silindi..");
	}
	public void update(Instructor category) {
		System.out.println(category.getId() +"  :Güncellendi..");
		System.out.println(category.getFirstName() +"  :Güncellendi..");
		System.out.println(category.getLastName() +"  :Güncellendi..");
		System.out.println(category.getNationalIdentity() +"  :Güncellendi..");
		System.out.println(category.getCertificate() +"  :Güncellendi..");
		System.out.println(category.getBracnh() +"  :Güncellendi..");
	}
	public void update(Students category) {
		System.out.println(category.getId() +"  :Güncellendi..");
		System.out.println(category.getFirstName()+"  :Güncellendi..");
		System.out.println(category.getLastName()+"  :Güncellendi..");
		System.out.println(category.getNationalIdentity() +"  :Güncellendi..");
		System.out.println(category.getEpisode() +"  :Güncellendi..");
		System.out.println(category.getSchoolNumber() +"  :Güncellendi..");
	}

}
