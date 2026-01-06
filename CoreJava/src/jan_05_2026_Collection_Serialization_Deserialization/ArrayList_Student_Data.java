
package jan_05_2026_Collection_Serialization_Deserialization;

import module java.base;

public class ArrayList_Student_Data {
	void main() throws IOException {
		ArrayList<String> listOfStudent = new ArrayList<>();
		listOfStudent.add("Sonu");
		listOfStudent.add("Rahul");
		listOfStudent.add("Raj");
		listOfStudent.add("Allen");
		listOfStudent.add("Scott");
		
		String filePath= "C:\\Serialization Deserialization\\student.txt";
		
		var fos =new FileOutputStream(filePath);
		var oos = new ObjectOutputStream(fos);
		
		try(fos; oos){
			oos.writeObject(listOfStudent);
			IO.println("Stored Successfullt.....................");
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		
	}
}
