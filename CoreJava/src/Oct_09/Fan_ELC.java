package Oct_09;

import java.util.Scanner;

public class Fan_ELC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Fan_BLC f1=new Fan_BLC();
		System.out.print("Enter Fan Name");
		f1.name=sc.nextLine();
		System.out.print("Enter Fan Coil");
		f1.coil=sc.nextLine();
		System.out.print("Enter Fan Wings");
		f1.wings=Integer.parseInt(sc.nextLine());
		f1.switchOn();
		f1.switchOff();
	}
}
