package Sep_19;

/*
2) Write a program to find out the area of Rectangle where length and  breadth of the Rectangle must be taken from user from command line argument..
*/

public class AreaRectangle{
public static void main(String []args){

Double length = Double.parseDouble(args[0]);
Double width = Double.parseDouble(args[1]);
Double areaOfR=length*width;
System.out.println("Area of Rectangle is : "+areaOfR);
}
}