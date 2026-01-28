package jan_28_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;

public class Trnsactioin_Management_System {

	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname = "c##sonu";
	String dbPwd = "sonu";

	String sqlQuery1 = "update trainseatavailability set AVAILABLE_SEATS = AVAILABLE_SEATS - 1 "
			+ "where train_id = ? and journey_date = ? and class = ? and AVAILABLE_SEATS > 0";

	String sqlQuery2 = "insert into bookingdetails values(?,?,?,?,?)";

	String sqlQuery3 = "select PAYMENT_STATUS from customerpayment where CUSTOMER_ID = ?";

	String sqlQuery4 = "update bookingdetails set STATUS = 'Confirmed' where CUSTOMER_ID = ?";

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

	void meth1() {
		System.out.println("Implementing Transaction Management\n");

		try {
			Connection con = connect();
			System.out.println("Database Connected Successfully!!!");
			System.out.println("Before disabling AutoCommit ==> " + con.getAutoCommit());

			con.setAutoCommit(false);
			System.out.println("After disabling AutoCommit ==> " + con.getAutoCommit());

			PreparedStatement pstmt1 = con.prepareStatement(sqlQuery1);
			pstmt1.setString(1, "12345");
			pstmt1.setDate(2, java.sql.Date.valueOf("2024-10-10"));
			pstmt1.setString(3, "Sleeper");

			int rowCount1 = pstmt1.executeUpdate();

			if (rowCount1 == 0)
				throw new RuntimeException("Seats NOT available for booking!!!");
			else
				System.out.println("Seat is Locked for booking");

			Savepoint sp = con.setSavepoint();

			PreparedStatement pstmt2 = con.prepareStatement(sqlQuery2);
			pstmt2.setString(1, "B102");
			pstmt2.setString(2, "12345");
			pstmt2.setString(3, "C123");
			pstmt2.setInt(4, 1);
			pstmt2.setString(5, "Payment Pending");

			int rowCount2 = pstmt2.executeUpdate();

			if (rowCount2 == 0)
				throw new RuntimeException("Booking record NOT created");
			else
				System.out.println("Booking Record Created\nAwaiting for Payment Confirmation!!!");

			PreparedStatement pstmt3 = con.prepareStatement(sqlQuery3);
			pstmt3.setString(1, "C124");

			ResultSet rs = pstmt3.executeQuery();
			String status = "Failed";

			if (rs.next()) {
				status = rs.getString(1);
			}

			if (status.equalsIgnoreCase("Failed")) {
				con.rollback(sp);
				throw new RuntimeException("Transaction Failed - Payment Unsuccessful");
			} else {
				PreparedStatement pstmt4 = con.prepareStatement(sqlQuery4);
				pstmt4.setString(1, "C123");

				int rowCount3 = pstmt4.executeUpdate();

				if (rowCount3 == 0)
					throw new RuntimeException("Transaction Failed at Payment portal...");
				else {
					con.commit();
					System.out.println("Ticket Successfully BOOKED!!!");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Trnsactioin_Management_System obj = new Trnsactioin_Management_System();
		obj.meth1();
	}
}
