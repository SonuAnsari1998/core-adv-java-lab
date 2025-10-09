package Sep_18;

/*
Arithmetic_Operations
Write a program to perform addition, subtraction, multiplication, and division between two integers using a third variable.

Input Format

Two integers separated by space.

Output Format

Print four lines showing results in the format:
Addition: <value>
Subtraction: <value>
Multiplication: <value>
Division: <value>
Sample Input
20 10
Sample Output
Addition: 30
Subtraction: 10
Multiplication: 200
Division: 2
*/


public class Arithmetic_Operations{
public static void main(String []args){
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);

System.out.println("Addition: "+(x+y));
System.out.println("Substraction: "+(x-y));
System.out.println("Multiplication: "+(x*y));
System.out.println("Division: "+(x/y));
}
}








