package blc;
/*Assignment 03 :
---------------
Define a method which returns the sum of three rounded numbers. 
If the right most digit of the number is less than 5, 
then round off its value to the previous multiple of 10 otherwise if the right most digit of 
the number is greater or equal to 5, and then round off to the next multiple of 10. 
Write the method with the following specifications: 
Name of the BLC class : RoundedSum
Name of method: sumOfRoundedValues() 
Access Modifier : public, static
Arguments: three argument of type integer
Return type: an integer value 
For example
If a = 23, b = 34, c = 66
   20 + 30 + 70 = 120
Note:Don't use any control statements and looping statements

Create an ELC class Main to test the application
------------------------------------------------------------------------------------------*/
public class RoundedSum {
	public static int sumOfRoundedValues(int num1,int num2,int num3) {
		
		int n1=(num1%10)>5?(num1/10+1)*10:(num1/10)*10;
		int n2=(num2%10)>5?(num2/10+1)*10:(num2/10)*10;
		int n3=(num3%10)>5?(num3/10+1)*10:(num3/10)*10;
		return n1+n2+n3;
	}
}













