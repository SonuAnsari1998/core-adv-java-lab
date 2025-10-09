package Aug_22;
//Question 5: Add Alternate Digits
//--------------------------------
//Write a Java program with the following requirements:
//- Class Name: AlternateDigitSum
//- Create a static method: addAlternate(int number) with return type void
//- Add digits alternately (skip one digit)
//- Print the result
//
//Sample Input/Output:
//Enter number: 12345
//Alternate digits sum = 1 + 3 + 5 = 9

class AlternateDigitSum {
	public static void addAlternate(int n) {
		int sum=0, count=0, sum2=0;
		while(n!=0) {
			int rev=n%10;
			sum+=rev;
			n/=10;
			count++;
			if(count%2!=0) {
				sum2=sum2+count;
			}
		}
		System.out.println(sum2);
	}
	public static void main(String[]args) {
		addAlternate(1234);
	}

}
