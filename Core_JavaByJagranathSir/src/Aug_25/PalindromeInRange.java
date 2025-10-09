package Aug_25;

import java.util.Scanner;

class PalindromeInRange{
	    public static void calculate(int n){
	    	int temp=n;
	        int rem=0, rev=0;
	      
	        while(n!=0){
	            rem=n%10;
	            rev=rev*10+rem;
	            n/=10;
	            
	        }
	        
	        if(temp==rev) {
	        	System.out.println(temp+" Palindrome Number");
	        }else {
	        	System.out.println(temp+" Not Palindrome Number");
	        }
	        
	    }
	    public static void main(String[]args){
	    	Scanner sc=new Scanner (System.in);
	    	System.out.println("Enter a Number: ");
	    	int n=sc.nextInt();
	        calculate(n);
	    }
	}