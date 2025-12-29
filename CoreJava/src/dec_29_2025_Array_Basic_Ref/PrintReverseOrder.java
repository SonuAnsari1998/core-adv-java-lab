package dec_29_2025_Array_Basic_Ref;

import java.util.Scanner;

/*Que 2:
=======
Print all elements in reverse order of an Array.

Input as: 1 2 3 4 5
Output as: 5 4 3 2 1*/
public class PrintReverseOrder {
	void main() {
		int size=Integer.parseInt(IO.readln("Enter size of Array"));
		int arr[]= new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(IO.readln());
		}
		for(int i=arr.length-1; i>=0; i--) {
			IO.print(arr[i]+" ");
		}
	}
}
