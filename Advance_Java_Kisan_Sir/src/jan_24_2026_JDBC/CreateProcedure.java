package jan_24_2026_JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CreateProcedure {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";

	public void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pwd);

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

	public static void main(String[] args) {
		CreateProcedure c = new CreateProcedure();
		c.connect();
	}
}
