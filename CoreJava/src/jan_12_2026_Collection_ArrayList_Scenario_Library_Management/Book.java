package jan_12_2026_Collection_ArrayList_Scenario_Library_Management;

public class Book {
	private String title; 
    private String author;
    private long isbn;
    private double price;
    private int quantity;
	public Book(String title, String author, long isbn, double price, int quantity) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.quantity = quantity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String toString() {
		return "(title = "+this.title+", author = "+this.author+", isbn = "+this.isbn+", price = "+this.price+", quantity = "+this.quantity+")\n";
	}
    
}
