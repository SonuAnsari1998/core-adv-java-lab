package Sep_24;
/*Assignment 03
----------------
Program to Concatenate Strings from Command Line Argument.

java ConcatStrings Java is platform independent

Output : Concatenated String: Java is platform independent[Space should be in the output]*/

public class ConcatenateStrings {
	public static void main(String[] args) {
		
		for(int i = 0;i<args.length;i++) {
			System.out.print(args[i]+" ");
		}
	}
}
