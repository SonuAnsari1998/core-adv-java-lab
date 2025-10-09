package Sep_01;

import java.util.Scanner;

public class Student{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        ReportCart st1=new ReportCart();
         System.out.println("Enter name of Student :");
        String name=sc.next();
         System.out.println("Enter marks of Student :");
        int marks=sc.nextInt();
        st1.setInput(name,marks);
        st1.displayDetails();
        //--------------------
        ReportCart st2=new ReportCart();
         System.out.println("Enter name of Student :");
        String name2=sc.next();
         System.out.println("Enter marks of Student :");
        int marks2=sc.nextInt();
        st2.setInput(name2,marks2);
        st2.displayDetails();
        //----------------
        ReportCart st3=new ReportCart();
         System.out.println("Enter name of Student :");
        String name3=sc.next();
         System.out.println("Enter marks of Student :");
        int marks3=sc.nextInt();
        st3.setInput(name3,marks3);
        st3.displayDetails();
    }
}
class ReportCart{
String name;
int marks;
public void setInput(String name,int marks){
this.name=name;
this.marks=marks;
}
public void displayDetails(){
    System.out.println("Name: "+name+" |  "+"Marks: "+marks);
}
}
