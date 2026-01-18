package com.pack1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class Connection_Practice {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";

	public Connection connect() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void insertData() {
		try {
			int id = Integer.parseInt(IO.readln("Enter Employee ID:"));
			String fname = IO.readln("Enter Employee first name");
			String lname = IO.readln("Enter Employee last name: ");
			double sal = Double.parseDouble(IO.readln("Enter Salary"));
			String add = IO.readln("Enter address");
			Connection conn = connect();
			Statement stm = conn.createStatement();
			int row = stm.executeUpdate("insert into Employee values (" + id + ",'" + fname + "','" + lname + "'," + sal
					+ ", '" + add + "')");
			if (row > 0) {
				IO.print("Data Inserted Sucessfully.......");
			} else {
				System.err.println("Data not inserted....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showData() {
		try {
			Connection conn = connect();
			Statement stm = conn.createStatement();
			ResultSet rest = stm.executeQuery("Select * from employee");
			while(rest.next()) {
				IO.println(rest.getInt(1)+"\t"+rest.getString(2)+"\t"+rest.getString(3)+"\t"+rest.getDouble(4)+"\t\t"+rest.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connection_Practice c1 = new Connection_Practice();
		IO.println("1) Insert Data");
		int choice = Integer.parseInt(IO.readln("Enter your choice"));
		switch (choice) {
		case 1 -> {
			c1.insertData();
		}
		case 2 -> {
			c1.showData();
		}
		default -> System.err.println("Invalid choice.....");
		}
		;

	}
}
