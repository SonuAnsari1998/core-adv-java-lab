package jan_01_2026_Collection_Vector_practice_Question;
/*Question 2: Search & Update Operation

Problem Statement:
Store some city names in a Vector<String>.

Requirements:
Search for "Delhi" using contains().
If "Delhi" is present:
Replace it with "New Delhi".
If not present:
Add "Delhi" to the vector.

Expected Output:
Updated Vector: [Mumbai, New Delhi, Chennai]*/
import module java.base;
public class SearchUpdateOperation2 {
	void main() {
		Vector<String> citylist=new Vector();
		citylist.add("mumbai");
		citylist.add("delhi");
		citylist.add("chennai");
		
		if(citylist.contains("delhi")) {
			int index=citylist.indexOf("delhi");
			citylist.set(index, "New delhee");
		}else {
			citylist.add("Delhee");
		}
		IO.print(citylist);
	}
}
