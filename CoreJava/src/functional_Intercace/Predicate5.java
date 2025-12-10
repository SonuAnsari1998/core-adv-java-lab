package functional_Intercace;

import java.util.function.Predicate;
record Student1(int id, String name, double marks) {
	public String toString() {
		return "Student ID " + id + "\nSudent Name: " + name + "\nStudnet Marks: " + marks;
	}
}
//Based on the marks verify whether the Student is PASS OR FAIL
public class Predicate5 {
	void main() {
		Predicate<Student> p5= student-> student.marks()>=60;
		int size=Integer.parseInt(IO.readln("Enter How many Student Check Result"));
		Student arr[]=new Student[size];
		int id[] = null;
		String studentName[] = null;
		double studentMarks[] = null;
		for(int i=0; i<=size; i++) {
			id[i]=Integer.parseInt(IO.readln("Enter Student ID"));
			studentName[i]=IO.readln("Enter Student Name");
			studentMarks[i]=Double.parseDouble(IO.readln("Enter Student Marks"));
			
		}
		//Student student =new Student(id,studentName,studentMarks);
		
	}
}
