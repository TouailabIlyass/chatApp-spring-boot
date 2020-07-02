package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Conversation;

public interface ConversationRespository extends JpaRepository<Conversation, Long>{

	//@Query("select c from Conversation c where ")
	Conversation findByUser1idAndUser2id(long id1,long id2);

}
