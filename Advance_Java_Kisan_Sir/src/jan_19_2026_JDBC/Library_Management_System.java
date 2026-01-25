package jan_19_2026_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Library_Management_System {
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String user="c##sonu";
	String pwd="sonu";
//connection 
	public Connection connect() {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,pwd);
			IO.println("Coneected.....");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
//Add Book to the Library
	public void addBook() {
		try {
			Connection conn= connect();
			Statement stm = conn.createStatement();
			int bookId=Integer.parseInt(IO.readln("Enter Book id"));
			String bookName=IO.readln("Enter Book Name");
			String author=IO.readln("Enter authod Name");
			String gender=IO.readln("Enter Gender");
			double bookCost=Double.parseDouble(IO.readln("Enter Book Cost"));
			int rowCount=stm.executeUpdate("INSERT INTO LIBRARY VALUES("+bookId+", '"+bookName+"', '"+author+"', '"+gender+"', "+bookCost+")");
			if(rowCount>0) {
				IO.println("Book Added Sucessfully");
			}else {
				IO.println("Book not added...");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
//Reteriving Spercific Book
	public void retrivingBook() {
		try {
			Connection conn=connect();
			Statement stm= conn.createStatement();
			int bookId=Integer.parseInt(IO.readln("Enter Book id"));
			ResultSet rest=stm.executeQuery("Select * from LIBRARY where BOOKID="+bookId);
			while(rest.next()) {
				IO.println(rest.getInt(1)+"\t"+rest.getString(2)+"\t"+rest.getString(3)+"\t"+rest.getString(4)+"\t"+rest.getDouble(5));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
//Deleting Specific Book
	public void deleteBook() {
		try {
			Connection conn=connect();
			Statement stm= conn.createStatement();
			int bookId=Integer.parseInt(IO.readln("Enter Book id"));
			int rest=stm.executeUpdate("delete from  LIBRARY where bookid="+bookId);
			if(rest>0) {
				IO.println("Book id "+bookId+" Deleted Successfully.....");
			}else {
				IO.println("Book id "+bookId+" Not Deleted .....");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
//View All the Books
	public void viewBooks() {
		try {
			Connection conn=connect();
			Statement stm= conn.createStatement();
			ResultSet rest=stm.executeQuery("Select * from LIBRARY");
			while(rest.next()) {
				IO.println(rest.getInt(1)+"\t"+rest.getString(2)+"\t"+rest.getString(3)+"\t"+rest.getString(4)+"\t"+rest.getDouble(5));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Library_Management_System library = new Library_Management_System();

		IO.println("Welcome to Library Management System\n");
		while(true) {
			IO.println("Choose your options");
			IO.println("1) Add Book to the Library");
			IO.println("2) Reteriving Spercific Book");
			IO.println("3) Deleting Specific Book");
			IO.println("4) View All the Books");
			IO.println("5) Exits......");
			int choice = Integer.parseInt(IO.readln());
			switch (choice) {
			case 1 -> {
				IO.println("Add Book to the Library");
				library.addBook();
			}
			case 2 -> {
				IO.println("Reteriving Spercific Book");
				library.retrivingBook();
			}
			case 3 -> {
				IO.println("Deleting Specific Book");
				library.deleteBook();
			}
			case 4 -> {
				IO.println("View All the Books");
				library.viewBooks();

			}
			case 5 -> {
				IO.println("Thank you see you soon.........");
				System.exit(0);
			}
			default -> System.err.println("Choose a Vallid Option..........");
			}
			;
		}

	}
}
