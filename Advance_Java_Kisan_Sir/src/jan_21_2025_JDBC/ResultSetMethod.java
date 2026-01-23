package jan_21_2025_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetMethod {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "c##sonu";
		String password = "sonu";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection(url, userName, password);

			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = st.executeQuery("select * from employee");
			while (rs.next()) {
				IO.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4)
						+ "\t" + rs.getString(5));
			}

			rs.absolute(2);
			IO.println("\nabsolute(in row)");

			IO.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t"
					+ rs.getString(5));

			rs.relative(2);
			IO.println("\nrelative(int row)");
			IO.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t"
					+ rs.getString(5));

			rs.next();
			IO.println("\nnext()");
			IO.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t"
					+ rs.getString(5));

			rs.first();
			IO.println("\nfirst()");
			IO.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t"
					+ rs.getString(5));

			rs.last();
			IO.println("\nlast()");
			IO.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t"
					+ rs.getString(5));

			rs.previous();
			IO.println("\nprevious()");
			IO.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t"
					+ rs.getString(5));

//            rs.afterLast();
//            IO.println("\nafterLast()");
//            while(rs.next()) {
//            	IO.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
//            }

//            rs.beforeFirst();
//            IO.println("\nbeforeFirst()");
//            while(rs.next()) {
//            	IO.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
//            }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
