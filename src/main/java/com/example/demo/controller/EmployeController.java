package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employe;
import com.example.demo.model.User;
import com.example.demo.repository.EmployeRepository;


@RestController
public class EmployeController {
	
	@Autowired EmployeRepository repo;
	
	
	@RequestMapping(path="/save",method = RequestMethod.POST)
    public Employe save(Employe e) 
    {
		if(e!=null)
		repo.save(e);
		return e;
    }
	
	@RequestMapping(path="/")
	public List<Employe> getAll()
	{
		return repo.findAll();
	}
	
	@RequestMapping(path="/employe/{id}",method=RequestMethod.GET)
	public Optional<Employe> getOne(@PathVariable("id") int id)
	{
		return repo.findById(id);
	}
	
	@RequestMapping(path="/employe/delete/{id}",method=RequestMethod.GET)
	public void deleteEmploye(@PathVariable("id") int id)
	{
		repo.deleteById(id);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path="/users",method=RequestMethod.GET)
	public List<User> getUsers()
	{
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User(20101L,false,"aa","aa",false,"user1000","user1000@liferay.com","user1000","","user1000",11015L,01L,true,1,1,1995,"user",34003L,20107L,false));
		users.add(new User(20101L,false,"aa","aa",false,"user1001","user1001@liferay.com","user1001","","user1001",11015L,01L,true,1,1,1995,"user",34003L,20107L,false));
		
		return users;
	}
	
	

}
