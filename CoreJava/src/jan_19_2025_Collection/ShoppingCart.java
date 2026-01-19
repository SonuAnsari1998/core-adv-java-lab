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
			int rowCount = stm.executeUpdate(" insert into ShoppingCart values(" + p.getProductId() + ", '"+ p.getProductName() + "', " + p.getProductPrice() + ", " + p.productQuantuty + ")");
			if(rowCount>0) {
				IO.print("Product Added Sucessfully.......");
			}else {
				IO.println("Product not added.....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public void addProduct(Product product) {
//		productList.add(product);
//	}
//	public void removeProduct(int id) {
//		ListIterator<Product> list=productList.listIterator();
//		while(list.hasNext()) {
//			Product p=list.next();
//			if(p.getProductId()==id) {
//				list.remove();
//				IO.println("Product id "+id+" Deleted Successfullu.........");
//			}else {
//				IO.println(id+" is not available");
//			}
//		}
//	}
//	public void updateQuantity(int id,int productQuantuty) {
//		ListIterator<Product> list=productList.listIterator();
//		boolean isFound=false;
//		
//		while(list.hasNext()) {
//			Product p=list.next();
//			if(p.getProductId()==id) {
//				p.setProductQuantuty(productQuantuty);
//				IO.println(productQuantuty +" is Updated Sucessfully.......");
//				isFound=true;
//				break;
//			}
//		}
//		if(!isFound) {
//			IO.println("Product id not found...........");
//		}
//	}
	public void showData() {
		Connection conn=connect();
		try {
			Statement stm = conn.createStatement();
			ResultSet rest=stm.executeQuery("select * from ShoppingCart");
			IO.println();
			while(rest.next()) {
				IO.println(rest.getInt(1)+"\t"+rest.getString(2)+"\t"+rest.getDouble(3)+"\t\t"+rest.getInt(4));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
