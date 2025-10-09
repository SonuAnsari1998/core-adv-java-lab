package Sep_19;

/*5) Write a Java program to verify whether a number is prime or not where number must be taken from command line argument. */

public class FindPrimNo{
public static void main(String []args){
int n=Integer.parseInt(args[0]);

int count=0;
boolean isPrime=true;
for(int i=2; i<=n/2; i++){
if(n%i==0){
	isPrime=false;
}
}
if(isPrime){
System.out.println(n+" is Prime Number");
}else{
System.out.println(n+" is not Prime Number");
}

}
}
