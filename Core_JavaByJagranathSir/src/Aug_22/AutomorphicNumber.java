package Aug_22;
//Question 3: Automorphic Number Checker

//--------------------------------------
//Write a Java program with the following requirements:
//- Class Name: AutomorphicNumber
//- Create a static method: checkAutomorphic(int number) with return type void
//- A number is Automorphic if its square ends with the same digits as the number
//- Print whether the number is Automorphic or not
//
//Sample Input/Output:
//Enter number: 25
//25^2 = 625
//25 is an Automorphic Number

class AutomorphicNumber {
	public static void checkAutomorphic(int n) {
		int rem = n % 10;
		int sqrt = (int) Math.pow(n, 2);
		int sqrtRem = sqrt % 10;
		if (rem == sqrtRem) {
			System.out.println(n + "is an Automorphic Number");
		} else {
			System.out.println(n + "is not an Automorphic Number");
		}
	}

	public static void main(String[] args) {
		checkAutomorphic(25);
	}

}
