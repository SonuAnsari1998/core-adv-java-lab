package jan_20__2025_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

public class Hospital_Management_System {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userName = "c##sonu";
	String password = "sonu";
//connection
	public Connection connect() {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn= DriverManager.getConnection(url,userName,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
//AddPatient
	public void patientOperation() {
		try {
			Connection conn=connect();
			PreparedStatement prep = conn.prepareStatement("insert into PATIENT values (?,?,?,?)");
			while(true) {
				IO.println("--------Patient Data-----------");
				IO.println("1. Add Patient Details...");
				IO.println("2. Views All Patients...");
				IO.println("3. Reterive Patients Data...");
				IO.println("4. Update Patients Data...");
				IO.println("5. Delete Patients Data...");
				IO.println("6. Exit...");
				int choice=Integer.parseInt(IO.readln("Enter Your Choice.....!"));
				switch(choice) {
				case 1->{
					String id=IO.readln("Enter Patient Id");
					String name=IO.readln("Enter Patient Name");
					int age=Integer.parseInt(IO.readln("Enter Patient Age."));
					long contact=Long.parseLong(IO.readln("Enter Patient Contact No."));
					prep.setString(1, id);
					prep.setString(2,name);
					prep.setInt(3, age);
					prep.setLong(4, contact);
					int rowCount=prep.executeUpdate();
					if(rowCount>0) {
						IO.println("Patient Data Added Sucessfully........");
					}else {
					}
					
				}
				case 2->{
					
				}
				case 3->{
					
				}
				case 4->{
					
				}
				case 5->{
					
				}
				case 6->{
					
				}
				default -> System.err.println("Please Enter Valid choice..");
				};
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Hospital_Management_System hospital = new Hospital_Management_System();
		hospital.patientOperation();
		
	}
}
