package dec_09_2025_interface_abstract_method;

public class Contractor {
	Payable c=new Payable() {
		
		@Override
		public void pay(double amount) {
			System.out.println("Contract Amount is : "+amount);
			
		}
		
	};
	
}
