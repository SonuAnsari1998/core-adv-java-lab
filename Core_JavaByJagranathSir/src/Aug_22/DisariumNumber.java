package Aug_22;

//Question 2: Disarium Number Checker
//-----------------------------------
//Write a Java program with the following requirements:
//- Class Name: DisariumNumber
//- Create a static method: checkDisarium(int number) with return type void
//- A number is called Disarium if sum of its digits powered with their positions is equal to the number itself
//- Print whether the number is a Disarium number or not
//
//Sample Input/Output:
//Enter number: 175
//1^1 + 7^2 + 5^3 = 175
//175 is a Disarium Number
class DisariumNumber {
	public static void checkDisarium(int n) {
		int rev = 0, sum = 0, c = 1, temp = n;
		while (temp != 0) {
			rev = rev * 10 + (temp % 10);
			temp /= 10;
		}
		while (rev != 0) {
			sum += (int) Math.pow(rev % 10, c++);
			rev /= 10;
		}
		if (sum == n) {
			System.out.println(sum + " is a Disarium Number");
		}

	}

	public static void main(String[] args) {
		checkDisarium(175);
	}

}
