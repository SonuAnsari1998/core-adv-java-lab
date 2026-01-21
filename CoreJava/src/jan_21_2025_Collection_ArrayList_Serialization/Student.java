package jan_21_2025_Collection_ArrayList_Serialization;

import java.time.LocalDate;

public class Student {
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private LocalDate dateOfAdmission;
	public Student(Integer studentId, String studentName, Double studentFees, LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	public static Student getStudentObject(int id, String name, double fee, LocalDate date) {
		
		return new Student(id, name, fee, date);
	}
	@Override
	public String toString() {
		return "Student [" + (studentId != null ? "studentId=" + studentId + ", " : "")
				+ (studentName != null ? "studentName=" + studentName + ", " : "")
				+ (studentFees != null ? "studentFees=" + studentFees + ", " : "")
				+ (dateOfAdmission != null ? "dateOfAdmission=" + dateOfAdmission : "") + "]";
	}
	
	

}
