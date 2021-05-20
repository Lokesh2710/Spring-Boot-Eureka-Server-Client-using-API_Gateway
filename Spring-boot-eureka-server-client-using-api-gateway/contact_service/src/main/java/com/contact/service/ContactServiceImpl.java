package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService
{
	//Fake list of Contacts
	List<Contact> list = List.of(
			new Contact(1,"ankit@gmail.com","Ankit",1311),
			new Contact(2,"nagesh@gmail.com","Nagesh",1311),
			new Contact(3,"trishla@gmail.com","Trishla",1312),
			new Contact(4,"priya@gmail.com","Priya",1312),
			new Contact(5,"Tapaswini@gmail.com","Tapaswini",1313), 
			new Contact(6,"jenny@gmail.com","jenny",1313)
			);
	
	

	@Override
	public List<Contact> getContactsOfUser(Integer userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

} 
 