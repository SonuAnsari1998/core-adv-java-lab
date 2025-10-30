package oct_24;
import java.util.Scanner;
public class HealthConditionCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Patient Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Health Index: ");
		double helthIndex=Double.parseDouble(sc.nextLine());
		Patient p=new Patient(name,helthIndex);
		System.out.println(CalculatePatientCondition.evaluateCondition(p));
	}
}
