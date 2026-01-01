package jan_01_2025_Collection_Comparator_Array;
/*Q4) Find the Smallest and Largest Elements in an Array.
     int[] arr = {15, 3, 7, 22, 5, 9, 12};

     Smallest element: 3
     Largest element: 22*/
public class SmallestLargest {
	void main() {
		int[] arr = {1000, 300, 20,70, 22, 50, 90, 12};
		
		int small=arr[0];
		int largest=arr[0];
		
		for(int i=0; i<arr.length; i++) {
				if(arr[i]<small) {
					small=arr[i];
				}
				if(arr[i]>largest) {
					largest=arr[i];
				}
		}
		IO.println(small);
		IO.println(largest);
	}
}
