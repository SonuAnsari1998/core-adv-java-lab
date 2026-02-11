package com.nit.pack1;

import java.io.Serializable;

public class EmpBean implements Serializable {
	private String emp_id;
	private String emp_fname;
	private String emp_lname;
	private int emp_sal;
	private String emp_address;

	public EmpBean() {

	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_fname() {
		return emp_fname;
	}

	public void setEmp_fname(String emp_fname) {
		this.emp_fname = emp_fname;
	}

	public String getEmp_lname() {
		return emp_lname;
	}

	public void setEmp_lname(String emp_lname) {
		this.emp_lname = emp_lname;
	}

	public int getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(int emp_sal) {
		this.emp_sal = emp_sal;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

}
