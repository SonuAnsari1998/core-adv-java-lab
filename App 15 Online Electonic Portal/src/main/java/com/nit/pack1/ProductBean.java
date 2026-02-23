package com.nit.pack1;

import java.io.Serializable;

public class ProductBean implements Serializable {
	public ProductBean() {
		
	}
	private String p_code;
	private String p_name;
	private String p_company;
	private String p_price;
	private String p_qty;
	public String getP_code() {
		return p_code;
	}
	public void setP_code(String p_code) {
		this.p_code = p_code;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_company() {
		return p_company;
	}
	public void setP_company(String p_company) {
		this.p_company = p_company;
	}
	public String getP_price() {
		return p_price;
	}
	public void setP_price(String p_price) {
		this.p_price = p_price;
	}
	public String getP_qty() {
		return p_qty;
	}
	public void setP_qty(String p_qty) {
		this.p_qty = p_qty;
	}

	

}
