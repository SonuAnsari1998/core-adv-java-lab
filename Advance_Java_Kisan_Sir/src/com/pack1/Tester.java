package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Tester {

	void main() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String userName = "c##sonu";
			String password = "sonu";

			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement ps = con.prepareStatement("select *from Employee");

			ResultSet rs = ps.executeQuery();
			ResultSetMetaData meta = rs.getMetaData();
			while (rs.next()) {
				for (int i = 1; i <= meta.getColumnCount(); i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
