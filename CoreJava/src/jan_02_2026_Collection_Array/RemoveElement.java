package jan_02_2026_Collection_Array;
/*Q1.Remove an Element from an Array at Given Index

Problem: Remove an element from a specified index.

int[] arr = {10, 20, 30, 40, 50};
int index = 2;


Output:

Array after deletion: [10, 20, 40, 50]*/
public class RemoveElement {
	void main() {
		int[] arr = {10, 20, 30, 40, 50};
		int index = 2;
		int i1=0;
		int newArr[]=new int[arr.length-1];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=index) {
				newArr[i1]=arr[i];
			}
		}
		IO.println(newArr);
	}
}
