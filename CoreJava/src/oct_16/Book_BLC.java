package oct_16;
/*Assignment 03 :
---------------
Design a Book printing System

Create a class  Book (BLC Class)

Attributes/Properties :[private access modifier for all the fields]

Name		     data type 
-------		      -----------
title                 :String
author       	      :String
price 		      :double

Implement a parameterized constructor to initialize all the fields

Methods :
Genearte toString() method to print object properties.

Method Name		:applyDiscount(double discountPercentage)
Return type		:void
Acess modifier	        :public


Take Main class (ELC Class) which having in main method  and execute the main method


Test Cases :
--------------

Test Case 1:
 Applying Invalid Discount (Negative)

Error: Invalid discount percentage.
Title: 1984
Author: George Orwell
Price: 14.391

Test Case 2: Creating Book with Negative Price
Error : Book Price cannot be negative.
Title: Negative Price Book
Author: No Author
Price: -5.0*/
public class Book_BLC {
	private String title;
	private String author;
	private double price;
	
	public Book_BLC(String title, String author, double price) {
		super();
		if(price<=0) {
			System.err.println("Book Price cannot be negative.");
			System.exit(0);
		}
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void applyDiscount(double discountPercentage) {
		if(discountPercentage<=0) {
			System.err.println("Invalid discount percentage.");
			System.exit(0);
			price+=(discountPercentage*price)/100;	
		}
	}
	@Override
	public String toString() {
		return "Book_BLC [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	

	
}






















