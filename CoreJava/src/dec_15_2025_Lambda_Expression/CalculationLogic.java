package dec_15_2025_Lambda_Expression;

import java.util.function.*;

/*Assignment 01 :
---------------
Write a Java program that defines a method testPredicate to test a given 
number against a 
provided predicate.
class name CalculationLogic(ELC) :

Method name : testPredicate
Access Modifier : public
Non-Access Modifier : static
return type : boolean
parameters : int, Predicate<Integer>
This method should return a boolean value indicating whether the given 
number satisfies the 
provided predicate.


In the main method:
Define three predicates:
isEven: Checks if a given number is even.
isGreaterThanTen: Checks if a given number is greater than 10.
isPrime: Verify the given number is prime or not.

Define a sample integer number (e.g., 18).
Test each predicate using the testPredicate method and print the result 
indicating whether 
the number satisfies each predicate.

Test Cases:

Test case 1 : Sample Number (18):
18 is even: true
18 is greater than 10: true
18 is prime: false

Test Case 2:

For number1 = 6:
6 is even: true
6 is greater than 10: false
6 is prime: false

Test Case 3:
For number2 = 17:
17 is even: false
17 is greater than 10: true
17 is prime: true*/
public class CalculationLogic {
	void main() {
		int n = Integer.parseInt(IO.readln("Enter a Number :"));
		Predicate<Integer> isEven = x -> x % 2 == 0;
		Predicate<Integer> isGreter = y -> y > 10;
		Predicate<Integer> isPrime = z -> {
			boolean isPrim = false;
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrim = true;
				}
			}
			return isPrim;
		};
		IO.println(n+" is even: "+testPredicate(n, x -> (x % 2 == 0)));
		IO.println(n+" is greater than 10: "+testPredicate(n, y -> (y > 10)));
		IO.println(n+" is prime: "+testPredicate(n, z -> {
			boolean isPrim = false;
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrim = true;
				}
			}
			return isPrim;
		}));
	}
	public static boolean testPredicate(int x, Predicate<Integer> z) {
		return z.test(x);
	}

}
