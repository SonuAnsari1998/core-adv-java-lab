package jan_29_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

public class ConnectionPooling {
	String driver, dbUrl, dbUsername, dbPwd;
	Vector<Connection> v = new Vector<>();

	public ConnectionPooling(String driver, String dbUrl, String dbUsername, String dbPwd) {
		super();
		this.driver = driver;
		this.dbUrl = dbUrl;
		this.dbUsername = dbUsername;
		this.dbPwd = dbPwd;
	}

	public void con_Initialization() {
		System.out.println("ConnectionPool is Empty");
		System.out.println("There are " + v + " Connection Object");
		while (v.size() < 5) {
			try {
				Class.forName(driver);
				Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPwd);
				v.add(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (Object o : v)
			System.out.println(o);
		System.out.println("There are " + v.size() + " Connection Object");
	}

	public Connection con_Acquisition() {
		Connection con = v.get(0);
		v.remove(0);
		return con;
	}

	public void con_Return(Connection con) {
		System.out.println("Adding the Connection object to the ConnectionPool");
		v.add(con);
		System.out.println("There are " + v.size() + " Conneciton object");
		for (Object o : v) {
			System.out.println(o);
		}
	}
}
