package com.example.demo.model;

public class User {

	private Long companyId;
	private boolean autoPassword;
	private String password1,password2;
	private boolean autoScreenName;
	private String screenName,emailAddress;
	private Long facebookId;
	private String openId ;
	private String firstName,middleName ,lastName;
	private Long prefixId,suffixId;
	private boolean male;
	private int birthdayMonth,birthdayDay,birthdayYear;
	private String jobTitle;
	private Long groupIds,roleIds,organizationIds,userGroupIds;
	private boolean sendEmail;
	
	public User() {
		super();
	}

	
	public User(Long companyId, boolean autoPassword, String password1, String password2,
			boolean autoScreenName, String screenName, String emailAddress, String firstName, String middleName,
			String lastname, Long prefixId, Long suffixId, boolean male, int birthdayMonth, int birthdayDay,
			int birthdayYear, String jobTitle, Long groupIds, Long roleIds, boolean sendEmail) {
		super();
		this.companyId = companyId;
		this.autoPassword = autoPassword;
		this.password1 = password1;
		this.password2 = password2;
		this.autoScreenName = autoScreenName;
		this.screenName = screenName;
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastname;
		this.prefixId = prefixId;
		this.suffixId = suffixId;
		this.male = male;
		this.birthdayMonth = birthdayMonth;
		this.birthdayDay = birthdayDay;
		this.birthdayYear = birthdayYear;
		this.jobTitle = jobTitle;
		this.groupIds = groupIds;
		this.roleIds = roleIds;
		this.sendEmail = sendEmail;
		/////////////
		this.openId="";
		this.facebookId=0L;
	}
	public User(Long companyId, boolean autoPassword, String password1, String password2,
			boolean autoScreenName, String screenName, String emailAddress, Long facebookId, String openId,
			String firstName, String middleName, String lastname, Long prefixId, Long suffixId, boolean male,
			int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle, Long groupIds, Long roleIds,
			Long organizationIds, Long userGroupIds, boolean sendEmail) {
		super();
		this.companyId = companyId;
		this.autoPassword = autoPassword;
		this.password1 = password1;
		this.password2 = password2;
		this.autoScreenName = autoScreenName;
		this.screenName = screenName;
		this.emailAddress = emailAddress;
		this.facebookId = facebookId;
		this.openId = openId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastname;
		this.prefixId = prefixId;
		this.suffixId = suffixId;
		this.male = male;
		this.birthdayMonth = birthdayMonth;
		this.birthdayDay = birthdayDay;
		this.birthdayYear = birthdayYear;
		this.jobTitle = jobTitle;
		this.groupIds = groupIds;
		this.roleIds = roleIds;
		this.organizationIds = organizationIds;
		this.userGroupIds = userGroupIds;
		this.sendEmail = sendEmail;
	}

	

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public boolean isAutoPassword() {
		return autoPassword;
	}

	public void setAutoPassword(boolean autoPassword) {
		this.autoPassword = autoPassword;
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

	public boolean isAutoScreenName() {
		return autoScreenName;
	}

	public void setAutoScreenName(boolean autoScreenName) {
		this.autoScreenName = autoScreenName;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Long getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(Long facebookId) {
		this.facebookId = facebookId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public Long getPrefixId() {
		return prefixId;
	}

	public void setPrefixId(Long prefixId) {
		this.prefixId = prefixId;
	}

	public Long getSuffixId() {
		return suffixId;
	}

	public void setSuffixId(Long suffixId) {
		this.suffixId = suffixId;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public int getBirthdayMonth() {
		return birthdayMonth;
	}

	public void setBirthdayMonth(int birthdayMonth) {
		this.birthdayMonth = birthdayMonth;
	}

	public int getBirthdayDay() {
		return birthdayDay;
	}

	public void setBirthdayDay(int birthdayDay) {
		this.birthdayDay = birthdayDay;
	}

	public int getBirthdayYear() {
		return birthdayYear;
	}

	public void setBirthdayYear(int birthdayYear) {
		this.birthdayYear = birthdayYear;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Long getGroupIds() {
		return groupIds;
	}

	public void setGroupIds(Long groupIds) {
		this.groupIds = groupIds;
	}

	public Long getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(Long roleIds) {
		this.roleIds = roleIds;
	}

	public Long getOrganizationIds() {
		return organizationIds;
	}

	public void setOrganizationIds(Long organizationIds) {
		this.organizationIds = organizationIds;
	}

	public Long getUserGroupIds() {
		return userGroupIds;
	}

	public void setUserGroupIds(Long userGroupIds) {
		this.userGroupIds = userGroupIds;
	}

	public boolean isSendEmail() {
		return sendEmail;
	}

	public void setSendEmail(boolean sendEmail) {
		this.sendEmail = sendEmail;
	}
	
	
	
	
}
