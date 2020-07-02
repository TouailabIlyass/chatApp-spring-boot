package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Dlfolder;
import com.example.demo.repository.DlfolderRepository;


@RestController
public class DlfolderController {

	
	@Autowired DlfolderRepository repo;
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path="/folders",method=RequestMethod.GET)
	//@GetMapping("/folders")
	public List<Dlfolder> getAll()
	{
		return repo.findAll();
	}
}
