package Sep_19;

/*3) Write a program to find the sum and average of three numbers where  number must be taken from command line argument.
*/

public class FindSumAndAvg{
public static void main(String []args){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);

int totalSum=a+b+c;
double avg=totalSum/3;

System.out.println("Sum of three number is: "+totalSum);
System.out.println("Avg. of Total Sum: "+avg);
}
}
