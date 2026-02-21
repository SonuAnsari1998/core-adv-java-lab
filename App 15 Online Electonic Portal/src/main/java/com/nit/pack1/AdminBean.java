package com.nit.pack1;

import java.io.Serializable;

public class AdminBean implements Serializable {
	private String a_name, a_pwd, a_fname, a_lname, a_adder, a_mail, a_phn;

	public String getName() {
		return a_name;
	}

	public void setName(String name) {
		this.a_name = a_name;
	}

	public String getA_pwd() {
		return a_pwd;
	}

	public void setA_pwd(String a_pwd) {
		this.a_pwd = a_pwd;
	}

	public String getA_fname() {
		return a_fname;
	}

	public void setA_fname(String a_fname) {
		this.a_fname = a_fname;
	}

	public String getA_lname() {
		return a_lname;
	}

	public void setA_lname(String a_lname) {
		this.a_lname = a_lname;
	}

	public String getA_adder() {
		return a_adder;
	}

	public void setA_adder(String a_adder) {
		this.a_adder = a_adder;
	}

	public String getA_mail() {
		return a_mail;
	}

	public void setA_mail(String a_mail) {
		this.a_mail = a_mail;
	}

	public String getA_phn() {
		return a_phn;
	}

	public void setA_phn(String a_phn) {
		this.a_phn = a_phn;
	}

}
