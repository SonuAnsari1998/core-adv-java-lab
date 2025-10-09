package Sep_18;

/*
sonu ansari
CircleArea
Write a program to calculate the area of a circle. The radius will be provided as a command line argument.

Input Format

A single number representing the radius.

Output Format
Print the area of the circle in the format:
Area of Circle = <value>

Sample Input
java CircleArea 7
Sample Output
Area of Circle = 153.93
*/

public class CircleArea{
public static void main(String []args){
int n=Integer.parseInt(args[0]);
double pi=3.14;
System.out.println("Area of Circle ="+(pi*n*n));
}
}
