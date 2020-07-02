package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{
	
	@Query("select m from Message m  where ( m.sent=1  and m.conversation.conversid like :idc ) or m.userid=:id ")
	List<Message> findByConversation(long id,String idc);
	
	@Query("select m from Message m where m.userid <> :id and m.conversation.conversid like :iduser and m.seen=0 and m.sent=0")
	List<Message> findNewMessage(long id,String iduser);
	
	List<Message> findBySeen(boolean b);
	
	@Query("select Max(m.id) from Message m  where m.userid=:id ")
	long maxByUserid(long id);
	
	@Transactional
	@Modifying
	@Query("update Message m set m.sent=1 where m.id IN (:list)")
	void updateSent(List<Long> list);
	
	@Modifying
	@Query("update Message m set m.sent=1 where m.userid <> :id and  m.conversation.conversid like  :iduser ")
	void updateAllSent(long id,String iduser);
	
}
