package com.nit.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerRegisterDAO {
	public static int custRegister(CustomerBean cust) {
		int rowCount = 0;

		try {
			Connection con = DBConnect.getConection();
			PreparedStatement pstmt = con.prepareStatement("insert into customer values (?,?,?,?,?,?,?)");
			pstmt.setString(1, cust.getUserName());
			pstmt.setString(2, cust.getPassword());
			pstmt.setString(3, cust.getFirstName());
			pstmt.setString(4, cust.getLastName());
			pstmt.setString(5, cust.getAddress());
			pstmt.setString(6, cust.getMailId());
			pstmt.setString(7, cust.getPhone());

			rowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;

	}
}
