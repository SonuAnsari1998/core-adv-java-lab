package com.nit.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRegisterDAO {
	public int insertUserData(UserBean ub) {
		int rowCount = 0;
		try {
			Connection con =DBConnect.getConection();
			PreparedStatement pstm = con.prepareStatement("insert into registration values (?,?,?,?,?,?)");
			pstm.setString(1, ub.getU_name());
			pstm.setString(2, ub.getU_pwd());
			pstm.setString(3, ub.getU_fname());
			pstm.setString(4, ub.getU_lname());
			pstm.setString(5, ub.getU_mail());
			pstm.setString(6, ub.getU_phn());
			rowCount = pstm.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
