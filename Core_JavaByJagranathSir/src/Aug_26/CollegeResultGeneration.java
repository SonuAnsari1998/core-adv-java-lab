package Aug_26;

import java.util.Scanner;

class CollegeResultGeneration {
public static void main (String []args) {
	Scanner sc=new Scanner(System.in);
	
	College std1=new College();
	
	System.out.println("Enter Subject-1 Marks");
	int marksOfSubject1=sc.nextInt();

	System.out.println("Enter Subject-2 Marks");
	int marksOfSubject2=sc.nextInt();
	
	System.out.println("Enter Subject-3 Marks");
	int marksOfSubject3=sc.nextInt();
	
	std1.calculateResult(marksOfSubject1,marksOfSubject2,marksOfSubject3);
	std1.displayResult();
}
}
