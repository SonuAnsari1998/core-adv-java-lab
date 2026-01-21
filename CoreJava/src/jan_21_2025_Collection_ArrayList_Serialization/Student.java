package jan_21_2025_Collection_ArrayList_Serialization;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {
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

	public static Student getStudentObject() {
		int id = Integer.parseInt(IO.readln("Enter student id"));
		String name = IO.readln("Enter student name");
		double fee = Double.parseDouble(IO.readln("Enter student fee"));

		return new Student(id, name, fee, LocalDate.now());
	}

	@Override
	public String toString() {
		return "Student [" + (studentId != null ? "studentId=" + studentId + ", " : "")
				+ (studentName != null ? "studentName=" + studentName + ", " : "")
				+ (studentFees != null ? "studentFees=" + studentFees + ", " : "")
				+ (dateOfAdmission != null ? "dateOfAdmission=" + dateOfAdmission : "") + "]";
	}

}
