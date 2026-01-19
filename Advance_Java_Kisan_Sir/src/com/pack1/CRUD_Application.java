 package com.pack1;

import java.sql.*;

public class CRUD_Application {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userName = "c##sonu";
	String password = "sonu";

//----------Conection-------------
	public Connection connection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

//-------------Display Data--s--------
	public void getData(String getDetails) {
		try {
			Connection conn = connection();
			PreparedStatement ps = conn.prepareStatement(getDetails);

			ResultSet rs = ps.executeQuery();
			ResultSetMetaData meta = rs.getMetaData();
			IO.println("EID\t\tFirst Name\tLast Name\tSalary\t\tLocation\n");
			while (rs.next()) {
				for (int i = 1; i <= meta.getColumnCount(); i++) {
					System.out.print(rs.getString(i) + "\t\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertData(String id, String fname, String lname, double salary, String location) {

		String insertQuery = "INSERT INTO Employee VALUES ('"+id+"', '"+fname+"', '"+lname+"', "+salary+", '"+location+"')";

		try {
			Connection conn = connection();
			Statement stm=conn.createStatement();
			int rowInserted = stm.executeUpdate(insertQuery);

			if (rowInserted == 0) {
				System.err.println("Data not inserted........");
			} else {
				System.out.println(id + " data inserted successfully");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//-------------Update Salary--------------
	public void updateSalary(String updateSalary) {
		try {
			Connection conn = connection();
			Statement statement = conn.createStatement();
			int rowCount = statement.executeUpdate(updateSalary);
			if (rowCount == 0) {
				System.err.println("Salary not updated............");
			} else {
				System.out.println("Salary Updated Succefully.........");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//--------------Delete Data----------------
	public void deleteData(int id, String delete) {
		try {
			Connection conn = connection();
			Statement stm = conn.createStatement();
			int rowDelete = stm.executeUpdate(delete);
			if (rowDelete == 0) {
				System.err.println(id + " id is not deleted...........");
			} else {
				System.out.println(id + " id is Deleted successfully.........");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		CRUD_Application crud = new CRUD_Application();

		System.out.println("\n----------Welcome to CRUD Application ---------------\n");
		while (true) {
			System.out.println("\n------------------Select Your Choice----------------------");
			System.out.println("1) View Employee Table");
			System.out.println("2) Insert Data in Employee Table");
			System.out.println("3) Delete Data in Employee Table");
			System.out.println("4) Update Data in Employee Table");

			int choice = Integer.parseInt(IO.readln("Enter Your Choice"));
			switch (choice) {
			case 1 -> {
				String viewQuery = "select * from Employee";
				System.out.println("\n---------------Employee Table---------------------------");
				crud.getData(viewQuery);
			}
			case 2 -> {
				String id = IO.readln("Enter Employee ID");
				String fname = IO.readln("Enter Employee First Name");
				String lname = IO.readln("Enter Employee Last Name");
				double salary = Double.parseDouble(IO.readln("Enter Employee Salary"));
				String location = IO.readln("Enter Location");
				crud.insertData(id, fname, lname, salary, location);
			}
			case 3 -> {
				int id = Integer.parseInt(IO.readln("Enter Employee id: "));
				String delete = "delete from Employee where EID=" + id;
				crud.deleteData(id, delete);

			}
			case 4 -> {
				int id = Integer.parseInt(IO.readln("Enter Employee Id"));
				
				double salary = Double.parseDouble(IO.readln("Enter New Salary"));
				String updateQuery = "update Employee set esal=" + salary + "where eid=" + id;
				crud.updateSalary(updateQuery);
			}
			default -> System.err.println("Invalid Choice Please Enter valid choice");
			}
			;
		}
	}
}
