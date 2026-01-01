package jan_01_2025_Collection_Comparator_Array;

/*Q5) Find Common Elements in Two Arrays.

    int[] arr1 = {1, 3, 4, 7, 9, 10};
    int[] arr2 = {2, 3, 7, 6, 9, 12};

    FindCommon elements: 3 7 9*/
public class FindCommonElements {
	void main() {
		int[] arr1 = { 1, 3, 4, 7, 9, 10 };
		int[] arr2 = { 2, 3, 7, 6, 9, 12 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					IO.println(arr1[i]);
				}

			}
		}
	}
}
