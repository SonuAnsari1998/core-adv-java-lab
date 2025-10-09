package Sep_19;

/*4) Write a program to accept a two digit number from command line argument and find the sum of digit. (Example : 54   5 + 4 =9)*/

public class FindSumOfDigit{
public static void main(String []args){
int n=Integer.parseInt(args[0]);

int x=n%10;
int y=n/10;

System.out.println("Sum of "+n+" Digit is "+(x+y));

}
}
