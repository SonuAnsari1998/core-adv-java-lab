package dec_09_2025_interface_abstract_method;

public class Employee {
	Payable e= new Payable() {
		@Override
		public void pay(double amount) {
			IO.println("Employee Amount : "+amount);
		}
	};
}
