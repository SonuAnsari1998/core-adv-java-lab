package jan_21_2025_Collection_ArrayList_Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreObject {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Student> listOfStudent = new ArrayList<>();
		System.out.println("Enter size of loop");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			Student studentObject = Student.getStudentObject();
			listOfStudent.add(studentObject);
		}
		try {
			//var fos = new FileOutputStream("C:\\Serialization Deserialization\\student.txt");
			var fos = new FileOutputStream(new File("C:\\Serialization Deserialization\\student1.txt"));
			var oos = new ObjectOutputStream(fos);

			oos.writeObject(listOfStudent);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		try {
			var fos = new FileInputStream("C:\\Serialization Deserialization\\student.txt");
			var oos = new ObjectInputStream(fos);

			List<Student> object = (List<Student>)oos.readObject();
			System.out.println(object);
		} catch (Exception e) {
			e.printStackTrace();
}
	}
}
