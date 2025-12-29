package dec_29_2025_Array_Basic_Ref;
/*Que 3 :
=======
Write a java program to add the last and first element of a given array.

Input as: [1,2,3,4,5,6]   
Output as: 7*/
public class AddLastOrFirstArray {
	void main() {
		int size=Integer.parseInt(IO.readln("Enter size of Array"));
		int arr[]= new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(IO.readln());
		}
		int sum=arr[0]+arr[arr.length-1];
		IO.print("Sum of first and last element: "+sum);
	}
}
