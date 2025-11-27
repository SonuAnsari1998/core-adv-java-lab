package logical_question_on_first_mockTest_2;
import java.util.Scanner;
public class FindArray {
	public static void main(String[] args) {
		int arr[]= {121, 153, 370, 407, 1634, 999};
		int count=0;
		for(int i=1; i<=arr.length; i++) {
			for(int j=1; j<=arr.length; j++) {
				while(arr[j]!=0) {
					count++;
					arr[i]/=10;
				}
			}
			int digit=0;
			int sum=0;
			for(int j=1; j<=arr.length; j++) {
				int last=0;
				int sqr=1;
				while(arr[j]!=0) {
					last=arr[j]%10;
					sqr=sqr*last;
				}
				sum+=sqr;
			}
			System.out.println(sum);
		}
	}
}
