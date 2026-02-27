package com.nit.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDAO {
	public static CustomerBean loginCustomer(String uname, String pass) {
		CustomerBean cb =new CustomerBean();

		try {
			Connection con = DBConnect.getConection();
			PreparedStatement pstmt = con.prepareStatement("select * from customer where uname=? and pword=?");
			pstmt.setString(1, uname);
			pstmt.setString(2, pass);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				cb.setUserName(rs.getString(1));
				cb.setPassword(rs.getString(2));
				cb.setFirstName(rs.getString(3));
				cb.setLastName(rs.getString(4));
				cb.setAddress(rs.getString(5));
				cb.setMailId(rs.getString(6));
				cb.setPhone(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cb;

	}
}
