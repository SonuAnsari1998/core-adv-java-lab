package array;
/*6. Q: Count even and odd numbers in an array. 
   Input: [1, 2, 3, 4, 5, 6]
   Expected Output: Even = 3, Odd = 3*/
import java.util.Scanner;
public class CountEvenAndOddNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size=Integer.parseInt(sc.nextLine());
		int arr[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++) {
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		int odd=0;
		int even=0;
		for(int i=0; i<size;i++) {
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even = "+even);
		System.out.println("Odd = "+odd);
	}
}
