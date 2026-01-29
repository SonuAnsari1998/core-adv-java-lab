package jan_29_2026_JDBC;

import java.sql.Connection;

public class Main {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:";
	String dbUname = "c##sonu";
	String dbPwd = "sonu";

	void math1() {
		ConnectionPooling cp = new ConnectionPooling(driver, dbUrl, dbUname, dbPwd);
		cp.con_Initialization();
		System.out.println("-------User-1---------");
		Connection con1 = cp.con_Acquisition();
		System.out.println("User 1 :" + con1);
		System.out.println("==> " + cp.v.size());

		System.out.println("-------User-2---------");
		Connection con2 = cp.con_Acquisition();
		System.out.println("User 2 :" + con2);
		System.out.println("==> " + cp.v.size());

		System.out.println("-------User-3---------");
		Connection con3 = cp.con_Acquisition();
		System.out.println("User 3 :" + con3);
		System.out.println("==> " + cp.v.size());

		System.out.println("-------User-4---------");
		Connection con4 = cp.con_Acquisition();
		System.out.println("User 4 :" + con4);
		System.out.println("==> " + cp.v.size());

		System.out.println("=============================");
		cp.con_Return(con1);// user-1
		cp.con_Return(con2);// user-2
		cp.con_Return(con3);// user-3
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.math1();
	}
}
