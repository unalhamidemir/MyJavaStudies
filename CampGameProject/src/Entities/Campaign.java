package Entities;

import java.time.LocalDate;

public class Campaign {
	private int id;
	private String campaignName;
	private int discount;
	private LocalDate startDate;
	private LocalDate endDate;
	
	
	public Campaign(int id, String campaignName, int discount, LocalDate startDate, LocalDate endDate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public Campaign() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public void setStartDate(int i) {
		
		
	}


	public void setEndDate(int i) {
		
		
	}
	

}
