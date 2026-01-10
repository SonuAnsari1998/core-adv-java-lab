package com.pack1;

import java.sql.*;


class Conn1 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "c##sonu";
		String password = "sonu";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Oracle 21c Connected Successfully!");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from Employee");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ", " + rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
