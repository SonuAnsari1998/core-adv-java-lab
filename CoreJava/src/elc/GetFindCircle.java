package elc;

import java.text.DecimalFormat;
import java.util.Scanner;

import blc.FindCircle;

public class GetFindCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of Circle");
		double radius=Double.parseDouble(sc.nextLine());
		DecimalFormat df=new DecimalFormat("00.00");
		
		System.out.println("Area of Circle is : "+df.format(Double.parseDouble(FindCircle.getArea(radius))));
	}
}
