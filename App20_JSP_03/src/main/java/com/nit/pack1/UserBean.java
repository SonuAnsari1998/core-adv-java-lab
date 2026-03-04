package com.nit.pack1;

import java.io.Serializable;

public class UserBean implements Serializable {
	private String userName;
	private String userMail;
	private String usermob;

	// default constructor
	public UserBean() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUsermob() {
		return usermob;
	}

	public void setUsermob(String usermob) {
		this.usermob = usermob;
	}

}
