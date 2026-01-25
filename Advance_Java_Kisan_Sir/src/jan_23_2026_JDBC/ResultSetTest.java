package jan_23_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetTest {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userName = "c##sonu";
	String password = "sonu";

	public Connection connect() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void viewData() {
		Connection conn=connect();
		try {
			Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CLOSE_CURSORS_AT_COMMIT);
			ResultSet rs= stm.executeQuery("select eid, efname, esal from employee");
			while(rs.next()) {
				String id=rs.getString(1);
				if(id.equals("102")) {
					rs.updateInt(3, 15000);
					rs.updateRow();
				}
			}
			IO.println("Salary Updated Sucessfully....");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ResultSetTest r1 = new ResultSetTest();
		r1.connect();
		r1.viewData();
	}
}
