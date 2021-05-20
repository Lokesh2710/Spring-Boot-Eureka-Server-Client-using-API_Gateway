package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User 
{
	private Integer userId;
	private String name;
	private String phone;
	
	private Object[] contacts ;//= new ArrayList<>();

	public User(Integer userId, String name, String phone, Object[] contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}

	public User(Integer userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public User() {
	
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Object[] getContacts() {
		return contacts;
	}

	public void setContacts(Object[] contacts2) {
		this.contacts = contacts2;
	}
	
}
