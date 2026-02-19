package com.nit.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDAO {
	
	public int updateProfile(UserBean ub) {
		int rowCount =0;
		try {
			Connection con=DBConnect.getConection();
			PreparedStatement pstmt = con.prepareStatement("update registration set  FIRSTNAME=?,LASTNAME=?,MAILID=?,PHONE where USERNAME=?");
			pstmt.setString(1, ub.getU_fname());
			pstmt.setString(2, ub.getU_lname());
			pstmt.setString(3, ub.getU_mail());
			pstmt.setString(4, ub.getU_phn());
			pstmt.setString(5, ub.getU_name());
			
			rowCount = pstmt.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return rowCount;
	}
}
