package Sep_10;

import java.util.Scanner;
class LinkedIn
{
    static Scanner sc = new Scanner(System.in);
public static void createProfile(Profile p,Address a)//ref received is 1010
    {
        p.address = a;
    System.out.println("Enter your name: ");
    p.name = sc.nextLine();
    System.out.println("Enter designation: ");
    p.designation = sc.nextLine();
   
    System.out.println("Enter street name: ");
    p.address.streetName = sc.nextLine();
    System.out.println("Enter state: ");
    p.address.state = sc.nextLine();
    System.out.println("Enter country: ");
    p.address.country = sc.nextLine();
    System.out.println("Enter webpage link: ");
    p.webPage = sc.nextLine();
    //no. of connection depends on no. of followers so user cant add it
    System.out.println("Enter the university name: ");
    p.universityName = sc.nextLine();
}
public static void follow(Profile p1,Profile p2){
System.out.println(p1.name+" following "+p2.name);
p2.connections++;
}
public void connect(Profile p1,Profile p2){
System.out.println("Request sent for connection.");
}
public static String viewProfile(Profile p){
return "Name: "+p.name+
       "\nDesignation: "+p.designation+
       "\nWebpage: "+p.webPage+
       "\nStreetName: "+p.address.streetName+
       "\nState: "+p.address.state+
       "\nCountry: "+p.address.country+
       "\n Connections: "+p.connections+
       "\nUniversity Name: "+p.universityName;
}
}
class Profile
{
public String name;
public String designation;
public Address address;
public String webPage;
public int connections;
public String universityName;
}
class Address
{
String streetName;
String state;
String country;
public void contactInfo(){

}
}
class User
{
    public static void main(String []args){
    Profile profile1 = new Profile();//ref 1010
    Address address1 = new Address();

    Profile profile2 = new Profile();//ref 2020
    Address address2 = new Address();

    LinkedIn.createProfile(profile1,address1);//ref 1010 passed
    LinkedIn.createProfile(profile2,address2);
    System.out.println(LinkedIn.viewProfile(profile1));
    }
}
