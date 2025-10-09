package Sep_19;

/*1) Write a program to find out the cube of a number where number must be taken from command line argument.*/

public class FindCube{
public static void main(String []args){
int n=Integer.parseInt(args[0]);
int cube=n*n*n;
System.out.println("Cube of "+n+" is "+cube);
}
}
