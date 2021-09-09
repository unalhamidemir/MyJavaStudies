package kodlamaio2;

public class Students extends Category {
	String schoolNumber;
	String episode;
	
	public Students() {
		
	}
	
	
	
	
	public Students(String schoolNumber, String episode) {
		super();
		this.schoolNumber = schoolNumber;
		this.episode = episode;
	}
	
	
	
	public String getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	public String getEpisode() {
		return episode;
	}
	public void setEpisode(String episode) {
		this.episode = episode;
	}

}
