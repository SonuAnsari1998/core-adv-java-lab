package Aug_25;

import java.util.Scanner;

class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Number : ");
		int n= sc.nextInt();
		int count=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count==1) {
			System.out.println("Prime Number ");
		}else {
			System.out.println(" Not Prime Number ");
		}

	}

}
