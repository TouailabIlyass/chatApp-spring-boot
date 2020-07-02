package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Conversation {
	
	@Id
	private String conversid;
	private long user1id;
	private long user2id;
	private Date createdAt;
	private Date deletedAt;
	
	@OneToMany(mappedBy="conversation")
    private List<Message> messages;
	

	public String getConversid() {
		return conversid;
	}
	public void setConversid(String conversNom) {
		this.conversid = conversNom;
	}
	public long getUser1id() {
		return user1id;
	}
	public void setUser1id(long user1_id) {
		this.user1id = user1_id;
	}
	public long getUser2id() {
		return user2id;
	}
	public void setUser2id(long user2_id) {
		this.user2id = user2_id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	
	
	

}
