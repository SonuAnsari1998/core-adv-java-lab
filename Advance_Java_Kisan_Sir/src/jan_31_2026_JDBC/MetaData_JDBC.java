package jan_31_2026_JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

import javax.sql.RowSetMetaData;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class MetaData_JDBC {
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname = "c##sonu";
	String dbPwd = "sonu";

	Connection connect() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, dbUname, dbPwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

//
	void meth1() {
		Connection conn = connect();
		try {
			DatabaseMetaData dbmt = conn.getMetaData();
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("-------------------------");
			PreparedStatement prep1 = conn.prepareStatement("select * from employee where eid =?");
			prep1.setInt(1, 101);
			prep1.executeQuery();
			ParameterMetaData prmtd = prep1.getParameterMetaData();
			IO.println("getParamerCount(): " + prmtd.getParameterCount());
			IO.println("getParameterType(): " + prmtd.getParameterType(1));
			IO.println("getParameterMode(): "+prmtd.getParameterMode(1));
			IO.println("isNullable(): "+prmtd.isNullable(1));
			
			System.out.println("-----------------------------\n");
			ResultSetMetaData rsmtd= prep1.getMetaData();
			IO.println("getColumnCount(): "+rsmtd.getColumnCount());
			IO.println("getColumnName(): "+rsmtd.getColumnName(2));
			IO.println("getColumnCount(): "+rsmtd.getColumnDisplaySize(4));
			IO.println("getColumnCount(): "+rsmtd.isAutoIncrement(1));
			
			System.out.println("--------------------------------------");
			RowSetFactory rsf = RowSetProvider.newFactory();
			CachedRowSet crs = rsf.createCachedRowSet();
			crs.setUrl(dbUrl);
			crs.setUsername(dbUname);
			crs.setPassword(dbPwd);
			crs.setCommand("select eid, efname, esal from employee");
			crs.execute();
			
			RowSetMetaData rowmdt = (RowSetMetaData) crs.getMetaData();
			IO.println("getColumnCount(): "+rowmdt.getColumnCount());
			IO.println("getColumnName(): "+rowmdt.getColumnName(2));
			IO.println("getColumnDisplaySize(): "+rowmdt.getColumnDisplaySize(1));
			IO.println("isAutoIncrement(): "+rowmdt.isAutoIncrement(1));
			IO.println("getColumnType(): "+rowmdt.getColumnType(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MetaData_JDBC meta = new MetaData_JDBC();
		meta.meth1();

	}
}
