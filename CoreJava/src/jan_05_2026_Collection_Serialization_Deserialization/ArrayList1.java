package jan_05_2026_Collection_Serialization_Deserialization;
import module java.base;

public class ArrayList1 {
	void main() throws IOException{
		ArrayList<String> listOfIceream= new ArrayList<>();
		listOfIceream.add("Vanila");
		listOfIceream.add("VaStrwbarry");
		listOfIceream.add("VanButterla Scotch");
		
		String filePath="C:\\Serialization Deserialization\\product.txt";
		
		var fos =new FileOutputStream(filePath);
		var oos =new ObjectOutputStream(fos);
		
		try(fos; oos){
			oos.writeObject(listOfIceream);
			IO.println("Data Stored Successfully.................");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		//De-Serialization
		
		var fin= new FileInputStream(filePath);
		var ois= new ObjectInputStream(fin);
		
		try(fin; ois){
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





















