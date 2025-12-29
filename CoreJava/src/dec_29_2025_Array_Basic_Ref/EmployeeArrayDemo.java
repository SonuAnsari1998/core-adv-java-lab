package dec_29_2025_Array_Basic_Ref;

public class EmployeeArrayDemo {
	void main() {
		int size = Integer.parseInt(IO.readln("Enter number of employees:"));
		Employee[] emp = new Employee[size];
		for (int i = 0; i < size; i++) {
			IO.println("Enter Details for Employee " + (i + 1));
			int id = Integer.parseInt(IO.readln("Enter ID"));
			String name = IO.readln("Enter Name");
			double salary = Double.parseDouble(IO.readln("Enter salary"));
			Employee e1 = new Employee(id, name, salary);

			emp[i] = e1;
		}
		for (int i = 0; i < size; i++) {
			IO.println(emp[i]);
		}
	}
}
