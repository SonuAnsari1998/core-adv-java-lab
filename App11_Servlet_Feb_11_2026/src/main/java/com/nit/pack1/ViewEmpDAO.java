package com.nit.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewEmpDAO {
	ArrayList<EmpBean> al = new ArrayList<EmpBean>();

	public ArrayList<EmpBean> reterive_empData() {
		try {
			Connection con=DBConnect.getConection();
			PreparedStatement pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpBean eb = new EmpBean();
				eb.setEmp_id(rs.getString(1));
				eb.setEmp_fname(rs.getString(2));
				eb.setEmp_lname(rs.getString(3));
				eb.setEmp_sal(rs.getInt(4));
				eb.setEmp_address(rs.getString(5));
				al.add(eb);
			}
		} catch (Exception e) {
			System.out.println("Problem Occurred at ==> ViewEmpDEO");
			e.printStackTrace();
		}
		return al;
	}
}
