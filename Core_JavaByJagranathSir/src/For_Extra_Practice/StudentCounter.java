package For_Extra_Practice;

public class StudentCounter {
String studentName;
static int totalStudent;

public void setName(String studentName) {
	this.studentName=studentName;
	totalStudent++;
	
	System.out.println("Student Name is: "+studentName);
	System.out.println("Total Student is: "+totalStudent);
}
}
