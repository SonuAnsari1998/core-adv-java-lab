package Sep_05;
//class Test{
//	public static int generateASCII(char ch) {
//		return ch;
//	}
//	public static void main(String []args) {
//		System.out.println(generateASCII ('a'));
//	}
//}
//import java.util.Scanner;
//class Sum{
//	public static int addSum(int a, int b) {
//		int sum=a+b;
//		return sum;
//		
//	}
//	public static void main(String []args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter First Number");
//		int a=sc.nextInt();
//		System.out.println("Enter second number");
//		int b=sc.nextInt();
//		int result=a+b;
//		System.out.println("Sum of "+ a +"and "+b +"= "+ result);
//	}
//}


//import java.util.Scanner;
//class Test{
//	public static String findGreter(int a, int b) {
//		if(a>b) {
//			return a+" is greter";
//		}else if(a<b) {
//			return b+" is greter";
//		}
//		
//		else {
//			return a+" and "+b+" Equal";
//		}
//		
//	}
//	public static void main(String []args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter First Number");
//		int a=sc.nextInt();
//		System.out.println("Enter second number");
//		int b=sc.nextInt();
//		String result=findGreter(a,b);
//		System.out.println(result);
//	}
//}

//import java.util.Scanner;
//class Test{
//	public static boolean isEven(int number) {
//		if(number%2==0) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	public static void main(String []args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter First Number");
//		int number=sc.nextInt();
//		boolean result=isEven(number);//either true of false returned based on number 
//		System.out.println(number+" is Even. "+result);// making output readable
//	}
//}


//import java.util.Scanner;
//class Test{
//	String firstName;
//	String SecondName;
//	int age;
//	String gender;
//	String standard;
//	String section;
//	String dept;
//	int rollNo;
//	long contact;
//	public String register() {
//		this.firstName=firstName;
//		this.SecondName=SecondName;
//		this.age=age;
//		this.gender=gender;
//		this.standard=standard;
//		this.section=section;
//		this.dept=dept;
//		this.rollNo=rollNo;
//		this.contact=contact;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter First Name");
//		this.firstName=sc.nextLine();
//		System.out.println("Enter Second Name");
//		this.SecondName=sc.nextLine();
//		System.out.println("Enter Student Age:");
//		this.age=sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Student Gender:");
//		this.gender=sc.nextLine();
//		System.out.println("Enter Student Standard:");
//		this.standard=sc.nextLine();
//		System.out.println("Enter Student Section:");
//		this.section=sc.nextLine();
//		System.out.println("Enter Student Department");
//		this.dept=sc.nextLine();
//		System.out.println("Enter Roll No.");
//		this.rollNo=sc.nextInt();
//		System.out.println("Enter Student Contact Number:");
//		this.contact=sc.nextLong();
//		return firstName+"Registration Successfully";	
//	}
//	public void display() {
//		System.out.println("First Name: "+firstName);
//		System.out.println("Last Name: "+SecondName);
//		System.out.println("Age: "+age);
//		System.out.println("Geder: "+gender);
//		System.out.println("Standard: "+standard);
//		System.out.println("Section: "+section);
//		System.out.println("Department: "+dept);
//		System.out.println("Roll Number: "+rollNo);
//		System.out.println("Contact Number: "+contact);
//	}
//	public static void main(String []args) {
//		Test s1=new Test();
//		s1.register();
//		for(int i=1;i<=2;i++) {
//          Test t1 = new Test();
//		}
//	}
//}


//import java.util.Scanner;
//
//class Test {
//    String firstName;
//    String secondName;
//    int age;
//    String gender;
//    String standard;
//    String section;
//    String dept;
//    int rollNo;
//    long contact;
//
//    // register method returns first name + success message
//    public String register() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter First Name:");
//        this.firstName = sc.nextLine();
//
//        System.out.println("Enter Second Name:");
//        this.secondName = sc.nextLine();
//
//        System.out.println("Enter Student Age:");
//        this.age = sc.nextInt();
//        sc.nextLine(); // consume newline
//
//        System.out.println("Enter Student Gender:");
//        this.gender = sc.nextLine();
//
//        System.out.println("Enter Student Standard:");
//        this.standard = sc.nextLine();
//
//        System.out.println("Enter Student Section:");
//        this.section = sc.nextLine();
//
//        System.out.println("Enter Student Department:");
//        this.dept = sc.nextLine();
//
//        System.out.println("Enter Roll No.:");
//        this.rollNo = sc.nextInt();
//
//        System.out.println("Enter Student Contact Number:");
//        this.contact = sc.nextLong();
//
//        // return first name + message
//        return this.firstName + " Registration Successfully";
//    }
//
//    // Display student details
//    public void display() {
//        System.out.println("First Name: " + firstName);
//        System.out.println("Last Name: " + secondName);
//        System.out.println("Age: " + age);
//        System.out.println("Gender: " + gender);
//        System.out.println("Standard: " + standard);
//        System.out.println("Section: " + section);
//        System.out.println("Department: " + dept);
//        System.out.println("Roll Number: " + rollNo);
//        System.out.println("Contact Number: " + contact);
//        System.out.println("--------------------------------");
//    }
//
//    public static void main(String[] args) {
//        // Create 2 student objects
//        Test student1 = new Test();
//        Test student2 = new Test();
//
//        // Register both students first
//        String msg1 = student1.register();
//        System.out.println(msg1);
//
//        String msg2 = student2.register();
//        System.out.println(msg2);
//
//        // Only after both registrations, display details
//        System.out.println("\n--- Student Details ---");
//        student1.display();
//        student2.display();
//    }
//}




















