package oct_13;

/*Assignment 01 :
------------
A BLC (Business Logic Class) called Student is given to you.
Instance Variables/Non static fields: 
studentId :int
studentName : String
studentMarks: int
studentGrade: char

Create a method public void setStudentData() with the parameters: id, name, marks.

Note that studentGrade is not set through method because it is a calculated value.

Methods :
displayDetails(): This method should return a String with  the details of the student in the following format:
Student [name=John Smith, studentId=123, marks=95, grade=A] 

method : calculateGrade():public:void
calculateGrade(): This is a public method that calculates the grade based on the marks that is set. 
If marks is above 90, grade is set to A. 
If marks is between 81 and 90, grade is set to B, 
if marks is between 71 and 80, grade is set to C, 
if marks is between 61 and 70, grade is set to D, 
if marks is less than 61, grade is set to E.
Use this method when you need to set or reset grade.

An ELC(Executable Logic class) Tester with main method is given to you to test your code.*/
public class Student_BLC {
	int studentId;
	String studentName;
	int studentMarks;
	char totalGrade;

	public void setStudentData(int id, String name, int marks) {
		studentId = id;
		studentName = name;
		studentMarks = marks;
	}

	public void calculateGrade() {

		 int stdM=(studentMarks/5)/10;
		totalGrade = switch (stdM) {
		case 9 -> 'A';

		case 8 -> 'B';

		case 7 -> 'C';

		case 6 -> 'D';

		case 5 -> 'E';

		default -> 'F';

		};
	}

	public String display() {
		return "[name=" + studentName + ", studentId=" + studentId + ", marks= " + 95 + ", grade= " + totalGrade + " ]";
	}
}
