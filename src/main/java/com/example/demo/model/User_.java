package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_")
public class User_ {

	@Id
	private long userid;
	private long companyid;
	private boolean autoassword;
	private String password1;
	private String password2;
	private boolean autoscreenname;
	private String screenname;
	private String emailaddress;
	private long facebookid;
	private String openid ;
	private String firstname;
	private String middlename ;
	private String lastname;
	private long prefixid;
	private String suffixid;
	private boolean male;
	private int birthdaymonth;
	private String birthdayday;
	private String birthdayyear;
	private String jobtitle;
	private long groupids;
	private String roleids;
	private String organizationids;
	private String usergroupids;
	private boolean sendemail;
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(long companyid) {
		this.companyid = companyid;
	}
	public boolean isAutoassword() {
		return autoassword;
	}
	public void setAutoassword(boolean autoassword) {
		this.autoassword = autoassword;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public boolean isAutoscreenname() {
		return autoscreenname;
	}
	public void setAutoscreenname(boolean autoscreenname) {
		this.autoscreenname = autoscreenname;
	}
	public String getScreenname() {
		return screenname;
	}
	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public long getFacebookid() {
		return facebookid;
	}
	public void setFacebookid(long facebookid) {
		this.facebookid = facebookid;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getPrefixid() {
		return prefixid;
	}
	public void setPrefixid(long prefixid) {
		this.prefixid = prefixid;
	}
	public String getSuffixid() {
		return suffixid;
	}
	public void setSuffixid(String suffixid) {
		this.suffixid = suffixid;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	public int getBirthdaymonth() {
		return birthdaymonth;
	}
	public void setBirthdaymonth(int birthdaymonth) {
		this.birthdaymonth = birthdaymonth;
	}
	public String getBirthdayday() {
		return birthdayday;
	}
	public void setBirthdayday(String birthdayday) {
		this.birthdayday = birthdayday;
	}
	public String getBirthdayyear() {
		return birthdayyear;
	}
	public void setBirthdayyear(String birthdayyear) {
		this.birthdayyear = birthdayyear;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public long getGroupids() {
		return groupids;
	}
	public void setGroupids(long groupids) {
		this.groupids = groupids;
	}
	public String getRoleids() {
		return roleids;
	}
	public void setRoleids(String roleids) {
		this.roleids = roleids;
	}
	public String getOrganizationids() {
		return organizationids;
	}
	public void setOrganizationids(String organizationids) {
		this.organizationids = organizationids;
	}
	public String getUsergroupids() {
		return usergroupids;
	}
	public void setUsergroupids(String usergroupids) {
		this.usergroupids = usergroupids;
	}
	public boolean isSendemail() {
		return sendemail;
	}
	public void setSendemail(boolean sendemail) {
		this.sendemail = sendemail;
	}
	
	
}
