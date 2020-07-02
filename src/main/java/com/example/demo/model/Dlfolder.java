package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dlfolder")
public class Dlfolder {
	
	@Id
	private long folderid;
	@Column
	private String name;
	@Column
	private long repositoryid;
	private long mvccversion;
	private String uuid_;
	private long groupid;
	private long companyid;
	private long userid;
	private String username;
	private Date createdate;
	private Date modifieddate;
	private String treepath;
	private String description;
	private Date lastpostdate;
	private long defaultfileentrytypedd;
	private int hidden_;
	private int restrictiontype;
	private int status;
	private long statusbyyserid;
	private String statusbyusername;
	private Date statusdate;
	
	public Dlfolder() {
		super();
	}

	public long getFolderid() {
		return folderid;
	}

	public void setFolderid(long folderid) {
		this.folderid = folderid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRepositoryid() {
		return repositoryid;
	}

	public void setRepositoryid(long repositoryid) {
		this.repositoryid = repositoryid;
	}

	public long getMvccversion() {
		return mvccversion;
	}

	public void setMvccversion(long mvccversion) {
		this.mvccversion = mvccversion;
	}

	public String getUuid_() {
		return uuid_;
	}

	public void setUuid_(String uuid_) {
		this.uuid_ = uuid_;
	}

	public long getGroupid() {
		return groupid;
	}

	public void setGroupid(long groupid) {
		this.groupid = groupid;
	}

	public long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(long companyid) {
		this.companyid = companyid;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	public String getTreepath() {
		return treepath;
	}

	public void setTreepath(String treepath) {
		this.treepath = treepath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getLastpostdate() {
		return lastpostdate;
	}

	public void setLastpostdate(Date lastpostdate) {
		this.lastpostdate = lastpostdate;
	}

	public long getDefaultfileentrytypedd() {
		return defaultfileentrytypedd;
	}

	public void setDefaultfileentrytypedd(long defaultfileentrytypedd) {
		this.defaultfileentrytypedd = defaultfileentrytypedd;
	}

	public int getHidden_() {
		return hidden_;
	}

	public void setHidden_(int hidden_) {
		this.hidden_ = hidden_;
	}

	public int getRestrictiontype() {
		return restrictiontype;
	}

	public void setRestrictiontype(int restrictiontype) {
		this.restrictiontype = restrictiontype;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getStatusbyyserid() {
		return statusbyyserid;
	}

	public void setStatusbyyserid(long statusbyyserid) {
		this.statusbyyserid = statusbyyserid;
	}

	public String getStatusbyusername() {
		return statusbyusername;
	}

	public void setStatusbyusername(String statusbyusername) {
		this.statusbyusername = statusbyusername;
	}

	public Date getStatusdate() {
		return statusdate;
	}

	public void setStatusdate(Date statusdate) {
		this.statusdate = statusdate;
	}
	

}
