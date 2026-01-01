package jan_01_2026_Collection_Comparable_Comparator;

import module java.base;

public class Main {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(101, "Rahul", 85));
		list.add(new Student(102, "Amit", 92));
		list.add(new Student(103, "Neha", 78));

		// Comparable (marks wise)
		Collections.sort(list);
		System.out.println("Sorted by Marks:");
		for (Student s : list) {
			System.out.println(s.name + " " + s.marks);
		}

		// Comparator (name wise)
		Collections.sort(list, new NameComparator());
		System.out.println("\nSorted by Name:");
		for (Student s : list) {
			System.out.println(s.name + " " + s.marks);
		}
	}
}
