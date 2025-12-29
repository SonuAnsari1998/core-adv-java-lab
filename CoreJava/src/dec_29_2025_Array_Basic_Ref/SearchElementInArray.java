package dec_29_2025_Array_Basic_Ref;
/*Que 1 :
========
Search for a given Element in an Array if present then print
"Element found at index : ", if not present print "Element not found"
    SearchElementInArray
Input as: 1 4 3 5 2 6 5
Enter searching element: 5
Output: Element found at index 3

Input as: 1 4 3 5 2 6
Enter searching element: 7
Output: Element not found*/
import module java.base;
public class SearchElementInArray {
	void main() {
		Scanner sc=new Scanner(System.in);
		int size=Integer.parseInt(IO.readln("Enter size of Array"));
		int arr[]= new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(IO.readln("Enter "+(i+1)+" Elements"));
		}
		
		int searchElement=Integer.parseInt(IO.readln("Enter Finding Element"));
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==searchElement) {
				IO.println("Element found at index "+i);
				return;
			}
		}
		IO.print("Element Not found");
	}	
}
