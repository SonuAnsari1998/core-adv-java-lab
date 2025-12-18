package dec_17_2025_Exception_Handling_Basic_Practice;

/*QUESTION 2: Array Index Access
A program has an integer array of size 5. The user enters an index to access an element.
 Invalid index access should be handled.

Test Cases:
TC1: Input: 0 -> Output: Element printed
TC2: Input: 4 -> Output: Element printed
TC3: Input: 7 -> Output: Error message displayed*/
public class ArrayIndexAccess {
void main() {
	try {
		int arr[]=new int[5];
		for(int i=0; i<=arr.length; i++) {
			IO.println("Hello");
		}
	}
	catch(Exception e){
		
	}
}
}
