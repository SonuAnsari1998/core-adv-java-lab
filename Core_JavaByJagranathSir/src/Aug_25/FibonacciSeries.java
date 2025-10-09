package Aug_25;

import java.util.Scanner;

class FibonacciSeries{
    public static void calculate(int n){
        int x=0, y=1, z=0;
        System.out.print(x+" "+y);
        for(int i=0; i<=n; i++){
        z=x+y;
        System.out.print(" "+z);
        x=y;
        y=z;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        calculate(n);
    }
}
