package Sep_25;
/*2) Write a java program to calculate the total surface area of a cylinder? 
Formula = 2 pi square r * 2 pi r h (take the pi as 3.14 with final modifier).*/
import java.util.Scanner;
public class SurfaceAreaOfcylinder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double radius=sc.nextDouble();
		System.out.println("Enter Height");
		double height=sc.nextDouble();
		
		final double pI= 3.14;
		double areaOfCylinder=(2*pI*radius*radius)+(2*pI*radius*height);
		System.out.println("Total surface area of a cylinder :"+areaOfCylinder);
	}
}
