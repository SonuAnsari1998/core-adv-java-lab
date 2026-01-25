package jan_24_2026_JDBC;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Second {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";

	public void show() {
		try {
			RowSetFactory rsf = RowSetProvider.newFactory();
			JdbcRowSet jrs = rsf.createJdbcRowSet();
			jrs.setUrl(url);
			jrs.setUsername(user);
			jrs.setPassword(pwd);
			jrs.setCommand("Select * from employee");
			jrs.execute();
			while (jrs.next()) {
				IO.println(jrs.getString(1) + "\t" + jrs.getString(2) + "\t" + jrs.getString(3) + "\t" + jrs.getInt(4)
						+ "\t" + jrs.getString(5));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Update() {
		try {
			RowSetFactory rsf = RowSetProvider.newFactory();
			CachedRowSet jrs = rsf.createCachedRowSet();
			jrs.setUrl(url);
			jrs.setUsername(user);
			jrs.setPassword(pwd);
			jrs.setCommand("Select * from employee");
			jrs.execute();
			while (jrs.next()) {
				String id = jrs.getString(1);
				if (id.equals("102")) {
					jrs.updateInt(3, 45000);
					jrs.updateRow();
				}
			}
//			jrs.acceptChanges();
//			jrs.beforeFirst();
			IO.println("Updated Sucessfully..........");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		try {
			RowSetFactory rsf = RowSetProvider.newFactory();
			CachedRowSet jrs = rsf.createCachedRowSet();
			jrs.setUrl(url);
			jrs.setUsername(user);
			jrs.setPassword(pwd);
			jrs.setCommand("Select * from employee");
			jrs.execute();
			while (jrs.next()) {
				String id = jrs.getString(1);
				if (id.equals("101")) {
					jrs.deleteRow();
					System.out.println("Deleted sucess");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Second s = new Second();

		s.show();

		s.Update();

		s.delete();

	}
}
