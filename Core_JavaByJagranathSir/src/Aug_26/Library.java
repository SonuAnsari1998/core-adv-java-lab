package Aug_26;

class Library {
String sName;
int rollNo;
String dept;
String email;
long mobileNo;

public void setInput(String sName,int rollNo,String dept,String email,long mobileNo){
	this.sName=sName;
	this.rollNo=rollNo;
	this.dept=dept;
	this.email=email;
	this.mobileNo=mobileNo;
}
public void displayDetails() {
	System.out.println("Welcome to Our Library");
	System.out.println("Full Name: "+sName);
	System.out.println("Roll Number: "+rollNo);
	System.out.println("Department: "+dept);
	System.out.println("Email: "+email);
	System.out.println("Mobile: "+mobileNo);
	System.out.println("Thank you!");
}

}
