package jan_01_2025_Collection_Comparator_Array;

/*Q3) Find Pairs with a Given Sum
    Problem: Find all pairs (x, y) in the array where x + y = targetSum

     int[] arr = {2, 7, 4, 8, 3, 5, 1, 6};
     int targetSum = 9;

     Pairs with sum 9:
     (2, 7)
     (4, 5)
     (8, 1)
     (3, 6)*/
public class TargetSum {
	void main() {
		int[] arr = { 2, 7, 4, 8, 3, 5, 1, 6 };
		int targetSum = 9;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == targetSum) {
					IO.println("(" + arr[i] + " " + arr[j] + ")");
				}
			}
		}
	}
}
