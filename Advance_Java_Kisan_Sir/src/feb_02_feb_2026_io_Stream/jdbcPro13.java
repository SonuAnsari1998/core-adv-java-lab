package feb_02_feb_2026_io_Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcPro13 {
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String usr = "c##sonu";
	String pwd = "sonu";
	String sqlQuery1 = "insert into mydata2 values(?,?)";
	String sqlQuery2 = "Select TEXT_DATA FROM MYDATA2 WHERE ID=?";

	Connection connect() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usr, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	void m1() {
		IO.println("Passing file into DataBase");
		Connection con = connect();
		try {
			PreparedStatement pstmt1 = con.prepareStatement(sqlQuery1);
			pstmt1.setString(1, "101");
			pstmt1.setClob(2, new FileReader("F:\\document.txt"));
			int rowCount = pstmt1.executeUpdate();
			if (rowCount == 0)
				throw new RuntimeException("File NOT Found");
			else
				IO.print("File inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void m2() {
		IO.println("Retriving the file from the DataBase");
		try {
			Connection con = connect();
			PreparedStatement pstmt2 = con.prepareStatement(sqlQuery2);
			pstmt2.setString(1, "101");
			ResultSet rs = pstmt2.executeQuery();
			if (rs.next()) {
				Clob b = rs.getClob(1);
				Reader data = b.getCharacterStream();
				BufferedReader br = new BufferedReader(data);
				FileWriter fw = new FileWriter("F:\\document.txt");
				String line;
				while ((line = br.readLine()) != null) {
					fw.write(line);
				}

//				Reader rd = rs.getCharacterStream(1);
//				String allAsString = rd.readAllAsString();
//				fw.write(allAsString);

				br.close();
				fw.close();
				IO.println("Clob data Retrived");
			} else
				throw new SQLException("Invalid ID");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void main() {
		 //m1();
		m2();
	}

}
