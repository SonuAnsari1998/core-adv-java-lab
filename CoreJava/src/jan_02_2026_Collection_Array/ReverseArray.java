package jan_02_2026_Collection_Array;

/*Q2) Reverse an Array Without Using Another Array
int[] arr = {10, 20, 30, 40, 50};


Output:

Reversed Array: [50, 40, 30, 20, 10]*/
public class ReverseArray {

	void main() {
		int[] arr = {10, 20, 30, 40, 50};
		for(int i=arr.length-1; i>=0; i--) {
			IO.print(arr[i]+" ");
		}
	
	}}
