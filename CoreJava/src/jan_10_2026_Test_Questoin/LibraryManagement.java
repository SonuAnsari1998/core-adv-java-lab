package jan_10_2026_Test_Questoin;

import java.util.Vector;

public class LibraryManagement {
	void main() {
		Library library = new Library();
		Vector <Book> bookList = new Vector<>();
		bookList.add(new Book(101, "java", "Jems"));
		bookList.add(new Book(102, "Html", "Tim"));
		bookList.add(new Book(103, "Paython", "Guido van Rossum"));
		bookList.add(new Book(104, "React", "Jordan Walke."));
		
		while(true) {
			System.out.println(" 1) Display Books Available in the Library :\n"
					+ "	 2) Search a Book in the Library :\n"
					+ "	 3) Issue a Book from the Library :\n"
					+ "	 4) Exit from the application :");
			int choice= Integer.parseInt(IO.readln("Please Enter your Choice :"));
			switch(choice) {
			case 1->{
				library.displayAvailableBooks(bookList);
			}
			case 2->{
				int id =Integer.parseInt(IO.readln("Enter book id"));
				library.searchBook(bookList, id);
			}
			case 3->{
				int id =Integer.parseInt(IO.readln("Enter book id"));
				library.issueBook(bookList, id);
			}
			default -> System.err.println("Invalid choice.. ");
			
			};
		}
	}
	
}
