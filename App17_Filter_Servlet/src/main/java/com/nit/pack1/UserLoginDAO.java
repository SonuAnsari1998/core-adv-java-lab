package com.nit.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.jasper.compiler.Node.UseBean;

public class UserLoginDAO {
	UserBean ub = null;

	public UserBean checkLogin(String u_name, String u_pwd) {
		try {
			Connection con = DBConnect.getConection();
			PreparedStatement pstmt = con
					.prepareStatement("select * from registration where username=? and password=?");
			pstmt.setString(1, u_name);
			pstmt.setString(2, u_pwd);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				ub = new UserBean();
				ub.setU_name(rs.getString(1));
				ub.setU_pwd(rs.getString(2));
				ub.setU_fname(rs.getString(3));
				ub.setU_lname(rs.getString(4));
				ub.setU_mail(rs.getString(5));
				ub.setU_phn(rs.getString(6));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ub;
	}
}
