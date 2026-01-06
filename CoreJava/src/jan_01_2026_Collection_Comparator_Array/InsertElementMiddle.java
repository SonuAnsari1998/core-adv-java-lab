package jan_01_2026_Collection_Comparator_Array;
/*Q2) Program to insert an element in the Array in the miidle of the Array.

    int[] arr = {1, 2, 3, 5, 6}; [Original Array]
    Array after insertion: [1, 2, 3, 4, 5, 6]*/
public class InsertElementMiddle {
	void main() {
		int arr[]= {1, 2, 3, 5, 6};
		IO.println("Array Before insertion:");
		for(int i:arr) {
			IO.print(i+" ");
		}
		IO.println();
		IO.println("Array After insertion:");
		int elemetn=4;
		int n=arr.length;
		int middle=(n/2)+1;
		int newArr[]=new int[n+1];
		int index=0;
		for(int i=0; i<newArr.length; i++) {
				if(i==middle) {
					newArr[i]=elemetn;
				}else
				newArr[i]=arr[index++];
		}
		for(int a:newArr) {
			IO.print(a+" ");
		}
	}
}
