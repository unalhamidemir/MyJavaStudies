package kodlamaio2;

public class Instructor extends Category{
	String bracnh;
	String certificate;
	
	public Instructor() {
		
	}
	
	
	
	
	public Instructor(String bracnh, String certificate) {
		super();
		this.bracnh = bracnh;
		this.certificate = certificate;
	}
	
	
	public String getBracnh() {
		return bracnh;
	}
	public void setBracnh(String bracnh) {
		this.bracnh = bracnh;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

}
