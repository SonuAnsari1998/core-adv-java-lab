package com.nit.pack1;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect {

	static Connection con = null;
	static {
		try {
			Class.forName(DBInfo.driver);
			con = DriverManager.getConnection(DBInfo.url, DBInfo.userName, DBInfo.password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConection() {
		return con;
	}
}
