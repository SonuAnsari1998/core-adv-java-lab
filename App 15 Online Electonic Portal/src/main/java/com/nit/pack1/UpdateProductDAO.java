package com.nit.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProductDAO {
	public int updateProduct(ProductBean pb) {
		int rowCoutn = 0;
		try {
			Connection con = DBConnect.getConection();
			PreparedStatement pstmt = con.prepareStatement("update product set pprice=? , pqty=? where pcode=?");
			pstmt.setString(1, pb.getP_price());
			pstmt.setString(2, pb.getP_qty());
			pstmt.setString(3, pb.getP_code());

			rowCoutn = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCoutn;
	}
}
