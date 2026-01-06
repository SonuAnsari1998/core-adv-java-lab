package jan_02_2026_Collection_Array;
/*Q3) Check Whether Two Arrays Are Equal

Two arrays are equal if:

Same length

Same elements in same order

int[] arr1 = {1, 2, 3, 4};
int[] arr2 = {1, 2, 3, 4};


Output:

Arrays are equal*/
public class CheckEqual {
	void main() {
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {1, 3, 3, 4};
		boolean isEqual=false;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					isEqual=true;
				}
			}
		}
		if(isEqual) {
			IO.println("Arrays are equal");
		}else {
			IO.println("Arrays are not equal");
			
		}
	}
}
