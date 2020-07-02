package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;

@RestController
@CrossOrigin(origins = "*")
public class MessageController {

	private static long size=0;
	
	@Autowired MessageRepository repo;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path="/sendmsg",method=RequestMethod.POST)
	public void addMessage(@RequestBody Message message)
	{
		repo.save(message);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path="/getmsgs/{idconversation}",method=RequestMethod.GET)
	public List<Message> getConversation(@PathVariable("idconversation") long idconversation)
	{
		return repo.findByConversation(idconversation,"%"+idconversation+"%");
	}
	
	
	@RequestMapping(path="/getmsgs",method=RequestMethod.POST)
	public List<Message> getMessageNotSent(@RequestBody long id)
	{   
		try {
		return repo.findNewMessage(id,"%"+id+"%");
	}catch(Exception e)
	{		
	}
		return null;
	}
	
	/*@RequestMapping(path="/getmsgs",method=RequestMethod.POST)
	public boolean isNewMsg()
	{   long table_count = repo.count();
		if(table_count!=size)
		{
			return true;
		}
		return false;
	}
	*/
	
	
	@RequestMapping(path="/setmsgsent",method=RequestMethod.POST)
	public boolean setMessageToSent(@RequestBody List<Long> list)
	{
		try {
		repo.updateSent(list);
		return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	@RequestMapping(path="/setallmsgsent",method=RequestMethod.POST)
	public boolean setAllMessageToSent(@RequestBody long id)
	{
		try {
			repo.updateAllSent(id,"%"+id+"%");
		return true;
		}catch(Exception e){}
		return false;
	}
	
	
	
	

}
