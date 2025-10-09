package Sep_10;

import java.util.Scanner;
public class NumberComparator{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Comparator n1=new Comparator();
        n1.num1=sc.nextInt();
        n1.num2=sc.nextInt();
        String m=n1.findLarger();
        System.out.println(m);
    }
}
class Comparator{
    int num1;
    int num2;

    public String findLarger(){
        if(num1>num2){
            return "First number is greater";
        }else if(num2>num1){
            return  "Second number is greater";
        }else{
            return "Both numbers are equal";
        }
    }
}
