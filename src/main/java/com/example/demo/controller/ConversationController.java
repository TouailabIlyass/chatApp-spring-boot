package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Conversation;
import com.example.demo.repository.ConversationRespository;

@RestController
public class ConversationController {
	
	@Autowired ConversationRespository repo;
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path="/createconvers",method=RequestMethod.POST)
	public void createConversation(@RequestBody Conversation conversation)
	{
		repo.save(conversation);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path="/getconvers/{id}",method=RequestMethod.GET)
	public Optional<Conversation> getConversation(@PathVariable("id") String id)
	{
		return null;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path="/getconvers",method=RequestMethod.GET)
	public Conversation getConversationId(@RequestParam long ids,@RequestParam long idr)
	{
		return repo.findByUser1idAndUser2id(ids, idr);
	}
	
	

}
