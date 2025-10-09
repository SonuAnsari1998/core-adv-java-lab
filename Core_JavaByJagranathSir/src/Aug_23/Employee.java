package Aug_23;
//
//class Employee{
//String empName;
//public void setName(String empName){
//	System.out.println("Employee name : "+this.empName);//null
//}
//public static void main(String []args){
//Employee e1 = new Employee();
//e1.setName("James");
//}
//}


class Employee{
String empName;
public void setName(String empName){
	empName = empName;
	System.out.println("Employee name : "+this.empName);//null
}

public static void main(String []args){
Employee e1 = new Employee();
e1.setName("James");
Employee e2 = new Employee();
e2.setName("Charles");
}
}
//Employee name : null
//Employee name : null
