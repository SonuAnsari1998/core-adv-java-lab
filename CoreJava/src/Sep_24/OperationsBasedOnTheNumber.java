package Sep_24;
/*Assignment -04
---------------
Write a Java program that performs different operations based on the number of arguments passed through 
the command-line arguments based on different criteria :

 a) It should print "No arguments provided!", If argument length is 0
 b) It should print square of the given number, If argument length is 1
 c) It should print sum and producet of the given numbers, If argument length is 2
 d) It should print the sum of all the numbers if argument length is more than 2.

java CommandLineOperations
Output : No arguments provided!

java CommandLineOperations 5
Output : Square of 5 = 25*/
public class OperationsBasedOnTheNumber {
	public static void main(String[] args) {
		if(args.length==0) {
			System.err.println("No arguments provided!");
		}else if(args.length==1) {
			int n=Integer.parseInt(args[0]);
			System.out.println("Square of "+n+" :"+n*n);
		}else if(args.length==2) {
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			System.out.println("Sum of "+x+" and "+y+" : "+(x+y));
			System.out.println("Product of "+x+" and "+y+" : "+(x*y));
		}else if(args.length>2) {
			int s = 0;
			for(int i=0; i<args.length; i++) {
				s+=Integer.parseInt(args[i]);
			}
			System.out.println("Sum of all number :"+s);
			
		}
	}
}
