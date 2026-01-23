package jan_10_2026_Test_Questoin;

import java.util.*;

public class Library {

	public void displayAvailableBooks(Vector<Book> book) {
		for (Book books : book) {
			System.out.println(books);
		}
	}

	public void issueBook(Vector<Book> book, int id) {
		ListIterator<Book> itr = book.listIterator();
		while (itr.hasNext()) {
			Book id1 = itr.next();
			if (id1.id() == id) {
				System.out.println("Book Issued........");
				itr.remove();
				break;
			} else {
				System.out.println("Book with ID " + id + " not Found");
			}

		}
	}

	public void searchBook(Vector<Book> book, int id) {
		ListIterator<Book> itr = book.listIterator();
		while (itr.hasNext()) {
			Book id1 = itr.next();
			if (id1.id() == id) {
				System.out.println("Book id is " + id + " Found");
				break;
			} else {
				System.out.println("Book not found");
			}
		}
	}
}
