package com.nit.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddEmpDAO {
	
	public int insertEmpData(EmpBean eb) {
		int rowCount=0;
		Connection con= DBConnect.getConection();
		
		try {
			 PreparedStatement pstmt = con.prepareStatement("insert into employee values (?,?,?,?,?)");
			 pstmt.setString(1, eb.getEmp_id());
			 pstmt.setString(2, eb.getEmp_fname());
			 pstmt.setString(3, eb.getEmp_lname());
			 pstmt.setInt(4, eb.getEmp_sal());
			 pstmt.setString(5, eb.getEmp_address());
			rowCount = pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
