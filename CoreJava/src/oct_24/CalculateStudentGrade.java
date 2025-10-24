package oct_24;
public class CalculateStudentGrade {
	public static StudentGrade calculateGrade(Student s) {
		StudentGrade sgrade=null;
		int marks=s.getMarks();
		if(marks >90) {
			sgrade=new StudentGrade(s, 'A');
		}else if(marks>=75 && marks<=90) {
			sgrade=new StudentGrade(s, 'B');
		}else if(marks>=60 && marks<75) {
			sgrade=new StudentGrade(s, 'C');
		}else {
			sgrade=new StudentGrade(s, 'D');
		}
		return sgrade;
	}
}
