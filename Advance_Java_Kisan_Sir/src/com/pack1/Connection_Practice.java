package com.pack1;

import java.sql.DriverManager;
import java.sql.Connection;

public class Connection_Practice {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";

	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connected succefully.........");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Connection_Practice().connect();
	}
}
