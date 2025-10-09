package Sep_25;
/*1) Write a java program to calculate the curved surface area of a cube? 
Formula = 6*side Square.*/
import java.util.Scanner;

public class CurvedSurfaceAreaOfCube {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter side square");
		double side=sc.nextDouble();
		double csac=6*(side*side);
		System.out.println("Curved surface area of a cube :"+csac);
	}
}
