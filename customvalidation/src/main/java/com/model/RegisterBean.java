package com.model;


public class RegisterBean {


	private String userName;
	private long contactNumber;
	private String emailId;
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {	 	  	    	    	     	      	 	
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

	@Override
	public String toString() {
		return "RegistrationBean [userName=" + userName + ", contactNumber=" + contactNumber + ", emailId=" + emailId +"]";
	}
}
