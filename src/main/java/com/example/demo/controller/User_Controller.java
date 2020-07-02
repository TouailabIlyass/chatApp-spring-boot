package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User_;
import com.example.demo.repository.User_Respository;

@RestController
@CrossOrigin(origins = "*")
public class User_Controller {
	
	@Autowired User_Respository repo;
	
	
	@RequestMapping(path="/getusers",method=RequestMethod.GET)
	public List<User_> getAllUsers()
	{
		return repo.findAll();
	}
	
	@RequestMapping(path="/getusers",method=RequestMethod.POST)
	public List<User_> getmyContactUser(@RequestBody long id)
	{
		return repo.getMyContact(id);
	}

}
