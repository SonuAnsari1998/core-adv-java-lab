package elc;

import java.util.Scanner;
import blc.Circle;

public class GetCircleArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double rad = Double.parseDouble(sc.nextLine());
		
		Circle.getAreaOfCircle(rad);
		sc.close();
	}

}
