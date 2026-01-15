package hotel_Reservation_System;
//Hotel Reservation System Project using Core java + JDBC
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

//---------Connection to Database----------
public class hotel_Reservation_System {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";

	public Connection connection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

//--------Reserve Room---------------
	public void reserveRoom(String guestName, int roomNo, String contactNumber) {
		try {
			Connection conn = connection();

			String sql = "INSERT INTO HOTEL_RESERVATION_SYSTEM (GUEST_NAME, ROOM_NO, CONTACT_NO) VALUES (?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, guestName);
			ps.setInt(2, roomNo);
			ps.setString(3, contactNumber);

			int affectedRows = ps.executeUpdate();

			if (affectedRows > 0) {
				System.out.println("Reservation successful!");
			} else {
				System.out.println("Reservation failed.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//-------------View Reservations---------
	public void viewReservations() {
		try {
			String sql = "SELECT * FROM HOTEL_RESERVATION_SYSTEM";
			Connection conn = connection();
			PreparedStatement stm = conn.prepareStatement(sql);
			ResultSet rest = stm.executeQuery();
			IO.println("RESERVATION_ID \tGUEST_NAME \tROOM_NO \tCONTACT_NO\tDATE AND TIME");
			while (rest.next()) {
				IO.println(rest.getInt(1) + "  \t  \t" + rest.getString(2) + "\t" + rest.getString(3) + "\t\t"
						+ rest.getString(4) + "\t" + rest.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//--------------Get Room Number-----------
	public void getRoomNumber() {
		try {
			Connection conn = connection();

			int reservationId = Integer.parseInt(IO.readln("Enter reservation ID: "));
			String guestName = IO.readln("Enter guest name: ");

			String sql = "SELECT * FROM HOTEL_RESERVATION_SYSTEM WHERE RESERVATION_ID = ? AND GUEST_NAME = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, reservationId);
			ps.setString(2, guestName);

			ResultSet rs = ps.executeQuery();

			IO.println("RES_ID\tGUEST_NAME\tROOM_NO\tCONTACT_NO\tDATE_TIME");

			while (rs.next()) {
				IO.println(rs.getInt("RESERVATION_ID") + "\t" + rs.getString("GUEST_NAME") + "\t" + rs.getInt("ROOM_NO")
						+ "\t" + rs.getString("CONTACT_NO") + "\t" + rs.getTimestamp("RESERVATION_DATE"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//---------Update Reservation-----------
	public void updateReservation() {
		try {
			Connection conn = connection();
			if (conn == null) {
				System.out.println("Database connection failed!");
				return;
			}

			int reservationId = Integer.parseInt(IO.readln("Enter reservation ID to update: "));
			String newGuestName = IO.readln("Enter new guest name: ");
			int newRoomNumber = Integer.parseInt(IO.readln("Enter new room number: "));
			String newContactNumber = IO.readln("Enter new contact number: ");

			String sql = "UPDATE HOTEL_RESERVATION_SYSTEM " + "SET GUEST_NAME = ?, ROOM_NO = ?, CONTACT_NO = ? "
					+ "WHERE RESERVATION_ID = ?";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, newGuestName);
			ps.setInt(2, newRoomNumber);
			ps.setString(3, newContactNumber);
			ps.setInt(4, reservationId);

			int rowsUpdated = ps.executeUpdate();

			if (rowsUpdated > 0) {
				System.out.println("Reservation updated successfully!");
			} else {
				System.out.println("No reservation found with given ID.");
			}

			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//-------Delete Reservation----------
	public void deleteReservation() {
		try {
			Connection conn = connection();
			if (conn == null) {
				System.out.println("Database connection failed!");
				return;
			}

			int reservationId = Integer.parseInt(IO.readln("Enter reservation ID to delete: "));

			String sql = "DELETE FROM HOTEL_RESERVATION_SYSTEM WHERE RESERVATION_ID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, reservationId);

			int rowsDeleted = ps.executeUpdate();

			if (rowsDeleted > 0) {
				IO.println("Reservation ID " + reservationId + " deleted successfully!");
			} else {
				IO.println("Reservation ID " + reservationId + " not found.");
			}

			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exit() throws InterruptedException {
		System.out.print("Exiting System");
		int i = 5;
		while (i != 0) {
			System.out.print(".");
			Thread.sleep(1000);
			i--;
		}
		System.out.println();
		System.out.println("ThankYou For Using Hotel Reservation System!!!");
	}

//--------main Method----------
	public static void main(String[] args) {
		hotel_Reservation_System hotel = new hotel_Reservation_System();
		while (true) {
			IO.println();
			IO.println("HOTEL MANAGEMENT SYSTEM");
			IO.println("1. Reserve a room");
			IO.println("2. View Reservations");
			IO.println("3. Get Room Number");
			IO.println("4. Update Reservations");
			IO.println("5. Delete Reservations");
			IO.println("0. Exit");
			int choice = Integer.parseInt(IO.readln("Choose an option: "));
			switch (choice) {
			case 1 -> {
				String guestName = IO.readln("Enter guest name: ");
				int roomNo = Integer.parseInt(IO.readln("Enter room number: "));
				String contactNumber = IO.readln("Enter contact number: ");
				hotel.reserveRoom(guestName, roomNo, contactNumber);
			}
			case 2 -> {
				hotel.viewReservations();
			}
			case 3 -> {
				hotel.getRoomNumber();
			}
			case 4 -> {
				hotel.updateReservation();
			}
			case 5 -> {
				hotel.deleteReservation();
			}
			case 0 -> {
				try {
					hotel.exit();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			default -> System.err.println("Invalid choice. Try again...");
			}
			;
		}

	}
}
//-----End-----
