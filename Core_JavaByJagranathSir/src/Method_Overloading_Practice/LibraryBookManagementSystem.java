package Method_Overloading_Practice;
/*Practice Question: Library Book Management System (with validations)
You are developing a system for a library to manage book records.

Task:
Create a class Book with private fields:
String title — name of the book
String author — name of the author
int pages — total number of pages in the book
double price — cost of the book

Requirements:
Implement setter methods using this keyword with validations:
title and author cannot be null or empty → print error message if invalid.
pages must be greater than 0 → print error message if invalid.
price must be non-negative → print error message if invalid.
Implement getter methods to retrieve field values.

Write a test class to:
Create details for three books using setter methods.
Print details of each book using getter methods.
Update the price of one book and display updated details.*/
import java.util.Scanner;

public class LibraryBookManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book s1=new Book();
		Book s2=new Book();
		Book s3=new Book();
		//---------obj-1------------------
		System.out.println("Enter Book Name");
		s1.setBookName(sc.nextLine());
		System.out.println("Enter Author Name");
		s1.setAuthorName(sc.nextLine());
		System.out.println("Enter Pages");
		s1.setPage(sc.nextInt());
		System.out.println("Enter Book Price");
		s1.setPrice(sc.nextDouble());
		sc.nextLine();
		//--------obj-2------------------
		System.out.println("Enter Book Name");
		s2.setBookName(sc.nextLine());
		System.out.println("Enter Author Name");
		s2.setAuthorName(sc.nextLine());
		System.out.println("Enter Pages");
		s2.setPage(sc.nextInt());
		System.out.println("Enter Book Price");
		s2.setPrice(sc.nextDouble());
		sc.nextLine();
		//---------obj-3-------------------------
		System.out.println("Enter Book Name");
		s3.setBookName(sc.nextLine());
		System.out.println("Enter Author Name");
		s3.setAuthorName(sc.nextLine());
		System.out.println("Enter Pages");
		s3.setPage(sc.nextInt());
		System.out.println("Enter Book Price");
		s3.setPrice(sc.nextDouble());
		//----------------------------------------------
		System.out.println("----------Book Details----------------");
		System.out.println(s1.bookDetails());
		System.out.println("----------------------------");
		System.out.println(s2.bookDetails());
		System.out.println("------------------------------");
		System.out.println(s3.bookDetails());
		
	}
}

class Book {
	private String bookName;
	private String authorName;
	private int page;
	private double price;
//setter
	public void setBookName(String bookName) {
		if(bookName !=null && !bookName.trim().isEmpty()) {
			this.bookName=bookName;
		}else {
			System.err.println("Please enter valid Book name");
			System.exit(0);
		}
	}

	public void setAuthorName(String authorName) {
		if (authorName != null && !authorName.trim().isEmpty()) {
			this.bookName = bookName;
		} else {
			System.err.println("Plese Enter valid authod name");
			System.exit(0);
		}
	}
	public void setPage(int page) {
		if(page>0) {
			this.page=page;
		}else {
			System.err.println("Plese Enter valid page");
			System.exit(0);
		}
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price=price;
		}else {
			System.err.println("Plese Enter valid page");
			System.exit(0);
		}
	}
	//getter
	public String getBookName() {
		return bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public int getPage() {
		return page;
	}
	public double getPrice() {
		return price;
	}
	//display
	public String bookDetails() {
		return "Book Name: "+bookName+
				"\nAuthor Name: "+authorName+
				"\nPages: "+page+
				"\nPrice: "+price;
	}
}
