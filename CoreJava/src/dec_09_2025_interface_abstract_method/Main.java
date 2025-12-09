package dec_09_2025_interface_abstract_method;

public class Main {
	void main() {
		double employeeSalary=Double.parseDouble(IO.readln("Enter Contract Salary: "));
		double contractSalary=Double.parseDouble(IO.readln("Enter Contract Salary: "));
		Contractor con =new Contractor();
		Employee employee=new Employee();
		IO.println("---------Salary Slip ---------");
		con.c.pay(employeeSalary);
		employee.e.pay(contractSalary);
	}
}
