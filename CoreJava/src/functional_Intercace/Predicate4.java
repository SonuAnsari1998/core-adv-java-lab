package functional_Intercace;

import java.util.function.Predicate;
//Based on the marks verify whether the Student is PASS OR FAIL

record Student(int id, String name, double marks) {
	public String toString() {
		return "Student ID " + id + "\nSudent Name: " + name + "\nStudnet Marks: " + marks;
	}
}

public class Predicate4 {
	void main() {
		Predicate<Student> p4 = student -> student.marks() > 60;
		int id=Integer.parseInt(IO.readln("Enter Student ID"));
		String studentName=IO.readln("Enter Student Name");
		double studentMarks=Double.parseDouble(IO.readln("Enter Student Marks"));
		Student s1 = new Student(id, studentName, studentMarks);
		IO.println("----------Students Details-------------");
		if (p4.test(s1))
			IO.println(s1 + "\nPASS");
		else
			IO.println(s1 + "\nFAIL");

	}
}
