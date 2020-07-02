package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dlfileentry")
public class Dlfileentry {
	
	@Id
	private long fileentryid;
	private long folderid;
	private long repositoryid;
	private String filename;
	private String title;
	private String description;
	public Dlfileentry() {
		super();
	}
	public long getFileentryid() {
		return fileentryid;
	}
	public void setFileentryid(long fileentryid) {
		this.fileentryid = fileentryid;
	}
	public long getFolderid() {
		return folderid;
	}
	public void setFolderid(long folderid) {
		this.folderid = folderid;
	}
	public long getRepositoryid() {
		return repositoryid;
	}
	public void setRepositoryid(long repositoryid) {
		this.repositoryid = repositoryid;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
