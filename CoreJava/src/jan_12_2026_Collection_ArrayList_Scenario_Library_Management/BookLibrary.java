package jan_12_2026_Collection_ArrayList_Scenario_Library_Management;

import java.util.ArrayList;

public class BookLibrary {
	void main() {
		IO.println("-------WELCOME TO LIBRARY MANAGMENT SYSTEM-------");
		Library library = new Library();
		while (true) {
			IO.println(
					"1. Add Book\n" + "2. Display Books\n" + "3. Update Quantity\n" + "4. Delete Book\n" + "5. Exit");
			int choice = Integer.parseInt(IO.readln());
			switch (choice) {
			case 1 -> {
				String title = IO.readln("Enter Title:");
				String author = IO.readln("Enter Author:");
				long isbn = Long.parseLong(IO.readln("Enter ISBN:"));
				double price = Double.parseDouble(IO.readln("Enter Price:"));
				int quantity = Integer.parseInt(IO.readln("Enter Quantity:"));
				 Book book = new Book(title, author, isbn, price, quantity);
				library.addBook(book);
			}
			case 2->{
				
				library.displayAllBooks();
			}

			default -> System.err.println("Invalid Choice.......");
			}
			;
		}
	}
}
