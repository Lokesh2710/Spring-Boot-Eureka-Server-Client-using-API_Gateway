package com.user.controller;

import java.awt.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	 
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId")Integer userId)
	{
		User user = this.userservice.getUser(userId);
		//http://localhost:9002/contact/user/1311

		// to run hardcode line
		//Object[] contacts = this.restTemplate.getForObject("http://localhost:9002/contact/user/"+user.getUserId(),Object[].class);

		/* To run with Eureka Server*/
		Object[] contacts = this.restTemplate.getForObject("http://contact-service//contact/user/"+user.getUserId(),Object[].class);

	    
	    user.setContacts(contacts);
	    
		return user;
		
	}
	 
	/*@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId")int userId)
	{
		return this.userservice.getUser(userId);
	}*/

}
