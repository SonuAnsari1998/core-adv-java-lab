package Sep_22;

/*Program 02:
-----------
Write a Java program to check if a given number is a palindrome or not. A number is a palindrome if it remains the same when its digits are reversed.*/

public class CheckPalindromeNo{
public static void main(String []args){
int n=121;
int temp=n;
int rem=0;
int digit=0;

while(n!=0){
rem=n%10;
digit=digit*10+rem;
n/=10;

}
if(temp==digit){
System.out.println(temp+" is a palindrome Number");
}else{
System.out.println(temp+" is not palindrome Number");
}

}
}
