package com.nit.pack1;

public class AdminBean {
	private String adminName;
	private String adminPass;
	private String adminFName;
	private String adminLName;
	private String adminMailId;
	private String adminphone;
	public AdminBean(String adminName, String adminPass, String adminFName, String adminLName, String adminMailId,
			String adminphone) {
		this.adminName = adminName;
		this.adminPass = adminPass;
		this.adminFName = adminFName;
		this.adminLName = adminLName;
		this.adminMailId = adminMailId;
		this.adminphone = adminphone;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	public String getAdminFName() {
		return adminFName;
	}
	public void setAdminFName(String adminFName) {
		this.adminFName = adminFName;
	}
	public String getAdminLName() {
		return adminLName;
	}
	public void setAdminLName(String adminLName) {
		this.adminLName = adminLName;
	}
	public String getAdminMailId() {
		return adminMailId;
	}
	public void setAdminMailId(String adminMailId) {
		this.adminMailId = adminMailId;
	}
	public String getAdminphone() {
		return adminphone;
	}
	public void setAdminphone(String adminphone) {
		this.adminphone = adminphone;
	}
}
