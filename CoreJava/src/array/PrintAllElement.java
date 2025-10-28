package array;
import java.util.Arrays;
/*1. Q: Write a Java program to print all elements of an array. 
   Input: [1, 2, 3, 4, 5]
   Expected Output: 1 2 3 4 5*/
import java.util.Scanner;
public class PrintAllElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
