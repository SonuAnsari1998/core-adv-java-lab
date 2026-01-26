package jan_26_2026_Collection_HashMap_Student_Management_System;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StudentDataManagement {
	public static void main(String[] args) {
		Map<String, Integer> studentList = new HashMap<>();

		System.out.println("------ Student Management Menu ------");
		while (true) {
			System.out.println("1. Add Student\r\n" + "2. Update Marks\r\n" + "3. Delete Student\r\n"
					+ "4. Search Student\r\n" + "5. Display All Students\r\n" + "6. Show Topper\r\n"
					+ "7. Show Lowest Scorer\r\n" + "8. Show Total and Average Marks\r\n" + "9. Exit");
			int choice = Integer.parseInt(IO.readln("Enter your choice:"));

			switch (choice) {
			case 1 -> {
				String name = IO.readln("Enter Student name:");
				int marks = Integer.parseInt(IO.readln("Enter marks:"));
				studentList.put(name, marks);
				System.out.println("Student added successfully!");
			}
			case 2 -> {
				String updateName = IO.readln("Enter student name to update the marks :");
				int newMarks = Integer.parseInt(IO.readln("Enter new marks:"));
				boolean isUpdate = false;
				for (Map.Entry<String, Integer> entry : studentList.entrySet()) {
					if (entry.getKey().equals(updateName)) {
						entry.setValue(newMarks);
						isUpdate = true;
					}
				}
				if (isUpdate) {
					System.out.println("Marks updated successfully!");
				} else {
					System.err.println(updateName + " Not Found...");
				}
			}
			case 3 -> {
				String name = IO.readln("Enter student name to delete:");
				boolean isDelete = false;
				if (studentList.containsKey(name)) {
					studentList.remove(name);
					System.out.println("Student " + name + " deleted successfully!");
				} else {
					System.err.println(name + " Not Found!");
				}
			}
			case 4 -> {
				String name = IO.readln("Enter student name to search:");
				boolean isFound = true;
				for (Map.Entry<String, Integer> entry : studentList.entrySet()) {
					if (entry.getKey().equals(name)) {
						System.out.println("Student Name is " + entry.getKey() + " And makrs is " + entry.getValue());
						isFound = false;
						break;
					}
				}
				if (isFound) {
					System.err.println(name + " Not Found");
				}
			}
			case 5 -> {
				for (Map.Entry<String, Integer> entry : studentList.entrySet()) {
					System.out.println(entry.getKey() + " => " + entry.getValue());
				}
			}
			case 6 -> {
				int max = Collections.max(studentList.values());

				for (Map.Entry<String, Integer> entry : studentList.entrySet()) {
					if (entry.getValue().equals(max)) {
						IO.println(entry.getKey() + " " + entry.getValue());
						break;
					}
				}
			}
			case 7 -> {
				int min = Collections.min(studentList.values());

				for (Map.Entry<String, Integer> entry : studentList.entrySet()) {
					if (entry.getValue().equals(min)) {
						IO.println(entry.getKey() + " " + entry.getValue());
						break;
					}
				}
			}
			case 8->{
				int total=0;
				
				for(Map.Entry<String, Integer> entry:studentList.entrySet()) {
					total+=entry.getValue();
				}
				System.out.println("Total Marks: "+total);
				System.out.println("Average Marks: "+(double)total/studentList.size());
			}
			case 9->{
				System.out.println("Thank you for Visiting........");
				System.exit(0);
			}

			default -> System.err.println("Invalid choice... Please Enter valid choice..");
			}
		}

	}
}
