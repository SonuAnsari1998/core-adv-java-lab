package com.pack1;

import java.sql.*;
import java.util.*;
public class Conn2 {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String usr = "c##sonu";
	String pwd = "sonu";
	Scanner sc=new Scanner(System.in);
	String update1="insert into Employee values('502', 'Raj', 'Kumar', 76000, 'Ranchi')";
	String delete ="delete from Employee where EID='101'";
	String updateSal="update Employee set esal=15000 where eid='202'";

	public Connection connect() {
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,usr,pwd);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public void showData() {
		try {
			Connection conn=connect();
			Statement stm=conn.createStatement();
			ResultSet rst=stm.executeQuery("Select * from Employee");
			while(rst.next()) {
				System.out.println(rst.getInt(1));
			}	
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
//	public void insetData() {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection conn=DriverManager.getConnection(url,usr,pwd);
//			Statement stm=conn.createStatement();
//			int count=stm.executeUpdate(update1);
//			if(count==0) {
//				IO.println("Data not Inserted");
//			}else {
//				IO.println(count+" row is insrted");
//			}
//			
//		}
//		catch(SQLIntegrityConstraintViolationException e) 
//		{
//			IO.println("Duplicate Employee id not allowed");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public void deleteEmpDAta() {
//		try {
//			Connection conn=connect();
//			Statement stm=conn.createStatement();
//			int count=stm.executeUpdate(delete);
//			if(count==0) {
//				System.out.println("No rows deleted ");
//			}else {
//				System.out.println("Rows deleted do you want to see your table (Y/N)");
//				char ch=sc.nextLine().charAt(0);
//				
//				
//			}
//			
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
		public void updateData() {
			try {
				Connection conn= connect();
				Statement stm=conn.createStatement();
				int count=stm.executeUpdate(updateSal);	
				if(count==0) {
					System.out.println("Salary not updated");
				}else {
					System.out.println("salary updated sucessfullyy.............");
				}
				System.out.println("Do you want to see table (Y/N)");
				char ch=sc.next().charAt(0);
				switch(ch) {
				case 'Y'->{
					
				}
				default -> System.out.println("Invalid choice");
				};
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	


//----------------------------------
	public static void main(String[] args) {
		Conn2 c=new Conn2();
		c.updateData();
	}
}
