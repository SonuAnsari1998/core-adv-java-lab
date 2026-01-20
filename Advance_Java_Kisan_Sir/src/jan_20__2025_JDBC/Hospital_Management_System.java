package jan_20__2025_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

public class Hospital_Management_System {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userName = "c##sonu";
	String password = "sonu";

//connection
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

//AddPatient
	public void patientOperation() {
		try {
			Connection conn = connect();
			PreparedStatement prep1 = conn.prepareStatement("insert into PATIENT values (?,?,?,?)");
			PreparedStatement prep2 = conn.prepareStatement("select * from patient");
			PreparedStatement prep3 = conn.prepareStatement("select * from patient where PID=?");
			PreparedStatement prep4 = conn.prepareStatement("update patient set PCONTACT=? where pid=?");
			while (true) {
				IO.println("--------Patient Data-----------");
				IO.println("1. Add Patient Details...");
				IO.println("2. Views All Patients...");
				IO.println("3. Reterive Patients Data...");
				IO.println("4. Update Patients Data...");
				IO.println("5. Delete Patients Data...");
				IO.println("6. Exit...");
				int choice = Integer.parseInt(IO.readln("Enter Your Choice.....!"));
				switch (choice) {
				case 1 -> {
					String id = IO.readln("Enter Patient Id");
					String name = IO.readln("Enter Patient Name");
					int age = Integer.parseInt(IO.readln("Enter Patient Age."));
					long contact = Long.parseLong(IO.readln("Enter Patient Contact No."));
					prep1.setString(1, id);
					prep1.setString(2, name);
					prep1.setInt(3, age);
					prep1.setLong(4, contact);
					int rowCount = prep1.executeUpdate();
					if (rowCount > 0) {
						IO.println("Patient Data Added Sucessfully........");
					} else {
					}

				}
				case 2 -> {
					ResultSet rest = prep2.executeQuery();
					IO.println("-------------Patient Details---------------");
					IO.println("PID\tPNAME\tAGE\tPCONTACT");
					while (rest.next()) {
						IO.println(rest.getInt(1) + "\t" + rest.getString(2) + "\t" + rest.getInt(3) + "\t"
								+ rest.getLong(4));
					}
					IO.println("-----------------------------------------\n");
				}
				case 3 -> {
					int pId = Integer.parseInt(IO.readln("Enter Patient ID"));
					prep3.setInt(1, pId);
					ResultSet rest = prep3.executeQuery();
					IO.println("-------------Patient Details---------------");
					IO.println("PID\tPNAME\tAGE\tPCONTACT");
					while (rest.next()) {
						IO.println(rest.getInt(1) + "\t" + rest.getString(2) + "\t" + rest.getInt(3) + "\t"
								+ rest.getLong(4));
					}
					IO.println("-----------------------------------------\n");
				}
				case 4 -> {
					int pId = Integer.parseInt(IO.readln("Enter Patient ID"));
					long uMobile = Long.parseLong(IO.readln("Enter Updated mobile number "));
					prep4.setLong(1, uMobile);
					prep4.setInt(2, pId);
					int rowCount = prep4.executeUpdate();
					if (rowCount > 0) {
						IO.println(pId + " Updated Sucessfully..........");
					} else {
						IO.println(pId + " Not Updated...");
					}
				}
				case 5 -> {

				}
				case 6 -> {
					IO.println("Thank you for visiting.......");
					System.exit(0);
				}
				default -> System.err.println("Please Enter Valid choice..");
				}
				;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Hospital_Management_System hospital = new Hospital_Management_System();
		hospital.patientOperation();

	}
}
