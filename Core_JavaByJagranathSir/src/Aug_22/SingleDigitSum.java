package Aug_22;
//Question 1: Add Until Single Digit
//----------------------------------
//Write a Java program with the following requirements:
//- Class Name: SingleDigitSum
//- Create a static method: addUntilSingleDigit(int number) with return type void
//- Continuously add the digits of the number until the result is a single digit
//- Print the final single digit result
//
//Sample Input/Output:
//Enter number: 9875
//Step 1: 9 + 8 + 7 + 5 = 29
//Step 2: 2 + 9 = 11
//Step 3: 1 + 1 = 2
//Final Single Digit: 2

class SingleDigitSum {
	public static void addUntilSingleDigit(int number) {
		int sum=0;
		while(number!=0) {
			int r=number%10;
			sum+=r;
			number/=10;
			if(number==0 && sum>9)
			{
				number=sum;
				sum=0;
			}
			}
		System.out.println("Final Single Digit: "+sum);
		}
	public static void main(String []args) {
		addUntilSingleDigit(9875);
	}

}
