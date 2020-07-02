package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.User_;

public interface User_Respository extends JpaRepository<User_, Long> {
	
	@Query("SELECT u FROM User_ u, Message m where u.userid=:id  and  u.userid=m.userid ORDER BY m.message_date desc")
	List<User_> getMyContact(long id);

}
