package jan_19_2025_Collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";

	ArrayList<Product> productList = new ArrayList<Product>();
	Product produt;

//Connection
	public Connection connect() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

//Adding Product
	public void addProduct(Product p) {
		Connection conn = connect();
		try {
			Statement stm = conn.createStatement();
			int rowCount = stm.executeUpdate(" insert into ShoppingCart values(" + p.getProductId() + ", '"
					+ p.getProductName() + "', " + p.getProductPrice() + ", " + p.productQuantuty + ")");
			if (rowCount > 0) {
				IO.print("Product Added Sucessfully.......");
			} else {
				IO.println("Product not added.....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeProduct(int id) {
		Connection conn = connect();
		try {
			Statement stm = conn.createStatement();
			int rowCont = stm.executeUpdate("delete from ShoppingCart where PRODUCTID=" + id);
			if (rowCont > 0) {
				IO.println(id + " Product Deleted Sucessfully..........");
			} else {
				IO.println(id + " Not Found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateQuantity(int id, int productQuantuty) {
		Connection conn = connect();
		try {
			Statement stm = conn.createStatement();
			int rowCount = stm
					.executeUpdate("update ShoppingCart set QTY=" + productQuantuty + " where PRODUCTID=" + id);
			if (rowCount > 0) {
				IO.println("Product Quentity Updated Sucessfully........");
			} else {
				IO.println(id + " Not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showData() {
		Connection conn = connect();
		try {
			Statement stm = conn.createStatement();
			ResultSet rest = stm.executeQuery("select * from ShoppingCart");
			IO.println("-------------------Product Details------------------------------\n");
			IO.println("Product Id \tProduct Name \tPrice\t\tQuentity");
			while (rest.next()) {
				IO.println(rest.getInt(1) + "\t\t" + rest.getString(2) + "\t\t" + rest.getDouble(3) + "\t\t"
						+ rest.getInt(4));
			}
			IO.println("----------------------------------------------------------------");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
