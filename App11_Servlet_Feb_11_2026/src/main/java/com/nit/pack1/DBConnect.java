package com.nit.pack1;

import java.sql.Connection;
import java.sql.*;

public class DBConnect {

	static Connection con = null;
	static {
		try {
			Class.forName(DBInfo.driver);
			con = DriverManager.getConnection(DBInfo.dbUrl, DBInfo.dbUname, DBInfo.dbPwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConection() {
		return con;
	}
}
