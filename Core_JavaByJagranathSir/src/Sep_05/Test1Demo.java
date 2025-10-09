package Sep_05;

import java.util.Scanner;

 record Problem(int balance, String firstName, String lastName, int age, String gender, String standard,
		String section, String dept, long emergencyContact, String address) {
	 
	 

}
//class Problem{
//private int balance;
//	
//	String firstName;
//    String lastName;
//    int age;
//    String gender;
//    String standard;
//    String section;
//    String dept;
//    long emergencyContact;
//    String address;
//    
//    public void Details()
//    {
//    	
//    }
//    public static void employeeDetails()
//    {
//    	
//    }
//    
//	
//    
//    
//	public Problem(int balance, String firstName, String lastName, int age, String gender, String standard,
//			String section, String dept, long emergencyContact, String address) {
//		super();
//		
//		if(balance<=0)
//		{
//			System.out.println("please enter valid number");
//			System.exit(0);
//		}
//		this.balance = balance;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.age = age;
//		this.gender = gender;
//		this.standard = standard;
//		this.section = section;
//		this.dept = dept;
//		this.emergencyContact = emergencyContact;
//		this.address = address;
//	}
//	public int getBalance() {
//		return balance;
//	}
//	public void setBalance(int balance) {
//		if(balance<=0)
//		{
//			System.out.println("please enter valid number");
//			System.exit(0);
//		}
//		if(balance>50000)
//		{
//			System.out.println("enter can not enter 50000");
//			System.exit(0);
//		}
//		this.balance += balance;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public String getStandard() {
//		return standard;
//	}
//	public void setStandard(String standard) {
//		this.standard = standard;
//	}
//	public String getSection() {
//		return section;
//	}
//	public void setSection(String section) {
//		this.section = section;
//	}
//	public String getDept() {
//		return dept;
//	}
//	public void setDept(String dept) {
//		this.dept = dept;
//	}
//	
//	public long getEmergencyContact() {
//		return emergencyContact;
//	}
//	public void setEmergencyContact(long emergencyContact) {
//		this.emergencyContact = emergencyContact;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	
//	
//	@Override
//	public String toString() {
//		return "Test1Demo [balance=" + balance + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
//				+ ", gender=" + gender + ", standard=" + standard + ", section=" + section + ", dept=" + dept
//				 + ", emergencyContact=" + emergencyContact + ", address=" + address
//				+ "]";
//	}	
//}
public class Test1Demo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		Problem obj1=new  Problem(1000, "sonu", "kumar", 23, "ftgyhu", "fhgj", "fgh", "fghj", 25, "tyuj");
		
		
	    System.out.println(obj1);	
	}  

}
