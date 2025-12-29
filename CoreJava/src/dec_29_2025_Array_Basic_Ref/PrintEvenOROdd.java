package dec_29_2025_Array_Basic_Ref;
/*Que 4 :
=======
Write a java program to print all even elements and odd elements 
separately from an array.
PrintEvenOROdd
Input as  : 1 2 3 4 5 6 7
Even elements are : 2 4 6
Odd elements are : 1 3 5 7*/
public class PrintEvenOROdd {
	void main() {
		int size=Integer.parseInt(IO.readln("Enter size of Array"));
		int arr[]= new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(IO.readln());
		}
		IO.print("Even Elements are: ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				IO.print(arr[i]+" ");
			}
		}
		IO.print("\nOdd Elements are: ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				IO.print(arr[i]+" ");
			}
		}
	}
}
