package feb_03_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FoodOrder {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sonu";
	String pwd = "sonu";
	
//connection 
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
//order
	public void order() {
		Connection conn= connect();
		try {
			PreparedStatement prep1 = conn.prepareStatement("select * from food");
			PreparedStatement prep2 = conn.prepareStatement("select ?*price as price from food where food_id=?");
			
			
			
			ResultSet rst1 = prep1.executeQuery();
			System.out.println("Food Menu");
			System.out.println("FOOD_ID\t\tFOOD_NAME\t\tPRICE");
			while(rst1.next()) {
				IO.println(rst1.getInt(1)+"\t\t"+rst1.getString(2)+"\t\t\t"+rst1.getDouble(3));
			}
			System.out.println("\nPlease Order the food...........");
			
			int oId=Integer.parseInt(IO.readln("Etner Order id"));
			int fodId=Integer.parseInt(IO.readln("Etner food id"));
			int qty=Integer.parseInt(IO.readln("Enter food qty"));
			prep2.setInt(1, qty);
			prep2.setInt(2, fodId);
			ResultSet executeQuery = prep2.executeQuery();
			while(executeQuery.next()) {
				IO.println("Total Price: "+executeQuery.getInt(1));
			
				PreparedStatement prep3 = conn.prepareStatement("insert into order1 values("+oId+", "+fodId+", "+qty+", "+executeQuery.getInt(1)+")");
				int rowCount= prep3.executeUpdate();
				if(rowCount>0) {
					System.out.println("Order id :"+oId);
					System.out.println("Food id: "+fodId);
					System.out.println("Queantity: "+qty);
					System.out.println("Ordered sucessfully");
				}
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		FoodOrder f1= new FoodOrder();
		f1.order();
		
	}
}

