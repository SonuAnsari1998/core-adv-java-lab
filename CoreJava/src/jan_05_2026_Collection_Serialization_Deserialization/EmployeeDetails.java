package jan_05_2026_Collection_Serialization_Deserialization;

import module java.base;

public class EmployeeDetails {
	void main() throws IOException{
		ArrayList<String> listOfStudent = new ArrayList<>();
		listOfStudent.add("Scott");
		listOfStudent.add("Allen");
		listOfStudent.add("Raj");
		listOfStudent.add("Rahul");
		listOfStudent.add("Karan");
		
		String filePath="C:\\Serialization Deserialization\\student.txt";
		
		var fos= new FileOutputStream(filePath);
		var oos= new ObjectOutputStream(fos);
		
		try(fos;oos){
			oos.writeObject(listOfStudent);
			IO.println("Stored Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//De-Serializable
		
		var fis= new FileInputStream(filePath);
		var ois= new ObjectInputStream(fis);
		
		try(fis; ois){
			@SuppressWarnings("unchecked")
			ArrayList<String> icecreams = (ArrayList<String>) ois.readObject();
			IO.println("--------------------");
			IO.println(icecreams);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
