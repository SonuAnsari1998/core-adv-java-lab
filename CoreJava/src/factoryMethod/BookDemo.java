package factoryMethod;
public class BookDemo {
	public static void main(String[] args) {
		Book b1=Book.getBookObject();
		System.out.println(b1);
	}
}
class Book{
	private String title;
	private String author;
	
	private Book(String title, String author) {
		this.title=title;
		this.author=author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	public static Book getBookObject() {
		return new Book("Java", "Jems Gosling");
	}
}
