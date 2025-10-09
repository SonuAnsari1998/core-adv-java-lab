package Oct_09;

import java.util.Scanner;

public class Dog_ELC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many Dog Object Create");
		int n=Integer.parseInt(sc.nextLine());
		Dog_BLC dogs[]=new Dog_BLC[n];
		
		for(int i=0; i<n; i++) {
			dogs[i]=new Dog_BLC();
			System.out.println("Enter Dog Name");
			dogs[i].name=sc.nextLine();
			System.out.println("Enter Dog Height");
//			d1.height=sc.nextDouble();
			dogs[i].height=Double.parseDouble(sc.nextLine());
			System.out.println("Enter Dog Age");
			dogs[i].age=Integer.parseInt(sc.nextLine());
		
		}
		
		
		for(Dog_BLC dog:dogs)
		{
			dog.getDogInformation();
		}
		
	}
}
