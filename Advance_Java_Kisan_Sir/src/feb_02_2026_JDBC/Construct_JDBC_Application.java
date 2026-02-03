package feb_02_2026_JDBC;
/*Assignment01:
============
step-1 : Create the following DB Tables
StuData(stuId,stuRollNo,stuName,stuBranch)
StuAddress(stuId,stuHno,city,pincode)
StuContact(stuId,mid,phno)

step-2 : Construct Procedure to insert student details into DB Tables.
step-3 : Construct_JDBC_Application to execute Procedure.*/

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Construct_JDBC_Application {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";

//connection 
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
//step-2 : Construct Procedure to insert student details into DB Tables.
	public void insertData() {
		Connection conn = connect();
		try {
			CallableStatement call = conn.prepareCall("call insertData (?,?,?,?,?,?,?,?,?)");
			
			String id=IO.readln("Enter Student ID");
			String roll=IO.readln("Enter Roll No.");
			String name=IO.readln("Enter Student Name");
			String branch=IO.readln("Enter Branch");
			String hno=IO.readln("Enter House No.");
			String loc=IO.readln("Enter Location");
			String mail=IO.readln("Enter Student Mail id:");
			Long phone=Long.parseLong(IO.readln("Enter Mobile"));
			
			call.setString(1, id);
			call.setString(2, roll);
			call.setString(3, name);
			call.setString(4, branch);
			call.setString(5, hno);
			call.setString(6, loc);
			call.setInt(7, 834001);
			call.setString(8, mail);
			call.setLong(9, phone);
			boolean execute = call.execute();
			if(!execute) {
				System.out.println("Data Inserted Sucessfully....");
			}else {
				System.err.println("Something went Wrong....");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Construct_JDBC_Application student = new Construct_JDBC_Application();
		student.insertData();
	}
}
