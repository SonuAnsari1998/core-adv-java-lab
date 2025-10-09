package Sep_05;

import java.util.Scanner;

class CollegeRegistration {
	String firstName;
    String lastName;
    int age;
    String gender;
    String standard;
    char section;
    String dept;
    Long contactNumber;
    long emergencyContact;
    String address;

    public String register() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name:");
        this.firstName = sc.nextLine();

        System.out.println("Enter Last"
        		+ " Name:");
        this.lastName = sc.nextLine();

        System.out.println("Enter Student Age:");
        this.age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Gender:");
        this.gender = sc.nextLine();

        System.out.println("Enter Student Standard:");
        this.standard = sc.nextLine();

        System.out.println("Enter Student Section:");
        this.section = sc.next().charAt(0);
        
        sc.nextLine();
        System.out.println("Enter Student Department:");
        this.dept = sc.nextLine();

        System.out.println("Enter Contact Number: ");
        this.contactNumber=sc.nextLong();
        
        System.out.println("Enter Emergency Contact Number: ");
        this.emergencyContact=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Address: ");
        this.address=sc.nextLine();

        return this.firstName + " Registration Successfully";
    }
    public String display() {
		return "First Name: " + firstName+
    "\n Last Name: " + lastName+
    "\n Age: " + age+
    "\n Gender: " + gender+
    "\n Standard: " + standard+
    "\n Section: " + section+
    "\n Department: " + dept+
    "\n Contact Number: "+contactNumber+
    "\n Emergensy Contact Number: "+
    "\n Address: "+address;   
}
	public static void main(String[] args) {
    	CollegeRegistration student1 = new CollegeRegistration();
    	CollegeRegistration student2 = new CollegeRegistration();
    	
    	System.out.println(student1.register());
    	System.out.println(student2.register());
    	System.out.println("-------------------------------");    	
    	System.out.println(student1.display());
    	System.out.println("---------------------------------");
    	System.out.println(student2.display());  
    }
}
