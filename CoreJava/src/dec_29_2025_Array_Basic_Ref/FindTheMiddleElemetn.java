package dec_29_2025_Array_Basic_Ref;
/*Que 5:
=======
Write a java program to find the middle elements of a given array. 
If array is odd then print only the middle element, if array is even
then print both the middle elements.
FindTheMiddleElemetn
Input as : 1 2 3 4 5     
Output is : 3

Input is :1 2 3 4 5 6    
Output is :3 4
*/
public class FindTheMiddleElemetn {
	void main() {
		int size=Integer.parseInt(IO.readln("Enter size of Array"));
		int arr[]= new int[size];//6
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(IO.readln());
		}
		if(size%2==0) {
			IO.println(arr[size/2-1]);
			IO.println(arr[size/2]);
		}else {
			IO.println(arr[size/2]);
		}
		
	}
}
