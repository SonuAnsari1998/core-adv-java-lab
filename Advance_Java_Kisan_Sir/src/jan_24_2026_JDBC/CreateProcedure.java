package jan_24_2026_JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CreateProcedure {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";

	Connection connect() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pwd);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void insetData() {
		Connection conn = connect();
		try {
			conn = DriverManager.getConnection(url, user, pwd);

			CallableStatement cstmt = conn.prepareCall("{call InsertData(?,?,?,?,?)}");

			String id = IO.readln("Enter your id");
			String name = IO.readln("Etner your name");
			String des = IO.readln("Enter your designation ");
			double bsal = Double.parseDouble(IO.readln("Enter Basic Salary"));

			double totalSal = bsal + (0.35 * bsal) + (0.15 * bsal);

			cstmt.setString(1, id);
			cstmt.setString(2, name);
			cstmt.setString(3, des);
			cstmt.setDouble(4, bsal);
			cstmt.setDouble(5, totalSal);

			cstmt.execute();
			System.out.println("Data Inserted Sucessfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// RetriveData
	public void retriveData() {
		Connection conn = connect();
		try {
			CallableStatement cstmt = conn.prepareCall("{call RetriveData(?,?,?,?,?)}");
			System.out.println("Enter Employee Id");
			String id= IO.readln();
			cstmt.setString(1, id);
			
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.registerOutParameter(4, Types.NUMERIC);
			cstmt.registerOutParameter(5, Types.NUMERIC);
			
			cstmt.execute();
			System.out.println("Employee Details");
			System.out.println("Employee id"+id);
			System.out.println("Employee name"+cstmt.getString(2));
			System.out.println("Employee name"+cstmt.getString(3));
			System.out.println("Employee name"+cstmt.getDouble(4));
			System.out.println("Employee name"+cstmt.getDouble(5));
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//total Salary
	public void totalSal() {
		Connection conn = connect();
		try {
			CallableStatement cstmt = conn.prepareCall("{call ?:=ReteriveTsal(?)}");
			String empid=IO.readln("Enter emp id");
			cstmt.setString(2, empid);
			cstmt.registerOutParameter(1, Types.NUMERIC);
			cstmt.execute();
			System.out.println("Employee Details");
			System.out.println("Employee id "+ empid);
			System.out.println("Employee Total Salary "+cstmt.getInt(1));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CreateProcedure c = new CreateProcedure();
		c.totalSal();
	}
}
