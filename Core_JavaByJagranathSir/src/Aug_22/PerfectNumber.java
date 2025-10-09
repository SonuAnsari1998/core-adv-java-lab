package Aug_22;
//Question 4: Perfect Number Checker
//----------------------------------
//Write a Java program with the following requirements:
//- Class Name: PerfectNumber
//- Create a static method: checkPerfect(int number) with return type void
//- A number is Perfect if the sum of its proper divisors (excluding itself) equals the number
//- Print whether the number is Perfect or not
//
//Sample Input/Output:
//Enter number: 28
//Divisors: 1 + 2 + 4 + 7 + 14 = 28
//28 is a Perfect Number

class PerfectNumber {
public static void checkPerfect(int n) {
	int sum=0;
	for(int i=1; i<n; i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
	if(sum==n) {
		System.out.println(n+" is a Perfect Number");
	}else {
		System.out.println(n+" is not a Perfect Number");
	}
		
	
}
public static void main(String[]args) {
	checkPerfect(28);
}
}
