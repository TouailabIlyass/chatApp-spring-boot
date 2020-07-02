package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Dlfileentry;
import com.example.demo.repository.DlfileentryRepository;

@RestController
public class DlfileentryController {
	
	@Autowired DlfileentryRepository repo;
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path="/files/{id}",method=RequestMethod.GET)
	public List<Dlfileentry> getAllByFolderId(@PathVariable("id") long id)
	{
		return repo.findByFolderid(id);
	}

}
