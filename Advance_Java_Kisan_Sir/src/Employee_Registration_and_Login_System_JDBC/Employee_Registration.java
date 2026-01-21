package Employee_Registration_and_Login_System_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Employee_Registration {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";

	public Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

// 
	public void operationRegistration() {
		try {
			Connection conn = connect();
			PreparedStatement prep1 = conn
					.prepareStatement("insert into EmployeeRegistration values(?, ?, ?, ?, ?, ?, ?)");
			PreparedStatement prep2 = conn.prepareStatement(
					"select FNAME , LNAME, MID, ADDR, PHN from EmployeeRegistration where ENAME = ? OR PWORD = ?");

			IO.println("------------Employee Registration------------");
			while (true) {
				IO.println("1. Employee Registration");
				IO.println("2. Employee Login");
				IO.print("");
				int choice = Integer.parseInt(IO.readln("Enter your choice"));
				switch (choice) {
				case 1 -> {
					String ename = IO.readln("Enter User Name");
					String password = IO.readln("Enter Password");
					String firstName = IO.readln("Enter First Name");
					String lastName = IO.readln("Enter Last Name");
					String emilId = IO.readln("Enter Email Id");
					String address = IO.readln("Enter Adress");
					long phoneNo = Long.parseLong(IO.readln("Enter Mobile No."));

					prep1.setString(1, ename);
					prep1.setString(2, password);
					prep1.setString(3, firstName);
					prep1.setString(4, lastName);
					prep1.setString(5, emilId);
					prep1.setString(6, address);
					prep1.setLong(7, phoneNo);

					int rowCount = prep1.executeUpdate();
					if (rowCount > 0) {
						IO.println("Your registration has been completed successfully.");
					} else {
						System.err.println("Account creation failed. Please try again.");
					}
				}
				case 2 -> {
					String ename = IO.readln("Enter User Name");
					String password = IO.readln("Enter Password");
					prep2.setString(1, ename);
					prep2.setString(2, password);
					ResultSet rs = prep2.executeQuery();
					IO.println("\nRegistration Details...");
					IO.println("First Name\tLast Name\tAddress\t\t\tEmail ID\tPhone No.");
					while(rs.next()) {
						IO.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getLong(5));
					}
					IO.println();
				}
				
				
				
				default -> System.err.println("Invlalid choice");
				}
				;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Employee_Registration employee = new Employee_Registration();
		employee.operationRegistration();
	}

}
