package Sep_01;
import java.util.Scanner;
class Transfer {
	String name;
	int age;
	public void setInput(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("Name is : "+name);
		System.out.println("Age is :"+age);
	}
}
class Test{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Transfer st1=new Transfer();
	
		System.out.println("Enter a name:");
		String name=sc.nextLine();
		
		System.out.println("Enter a age");
		int age=sc.nextInt();
		
		st1.setInput(name,age);
		st1.display();
		//-----------------------
		Transfer st2=new Transfer();
		
		System.out.println("Enter a name:");
		String name2=sc.nextLine();
		
		System.out.println("Enter a age");
		int age2=sc.nextInt();
		
		st2.setInput(name2,age2);
		st2.display();
		
	}
}

