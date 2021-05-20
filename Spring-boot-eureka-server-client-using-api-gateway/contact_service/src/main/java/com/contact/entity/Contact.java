package com.contact.entity;

public class Contact {
	
	private Integer cId;
	private String email;
	private String contactName;
	private Integer userId;
	
	
	
	public Contact(Integer cId, String email, String contactName, Integer userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}
	
	public Contact() {
		super();
	}

	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
}
