package dec_09_2025_interface_abstract_method;

public class PhysicalProduct extends Product{
	private double shippingWeight;
	private double uprice;
	private double discount;
	double shippingCost;
	double tex;
	public PhysicalProduct(String name, double price, String category,double shippingWeight) {
		if(price<=0) {
			System.err.println("Price cannot be negative.");
			System.exit(0);
		}
		if(shippingWeight <=0) {
			System.out.println("Shipping Weight cannot be negative.");
			System.exit(0);
		}
		if(category.isEmpty() || category==null) {
			System.err.println("Category cannot be empty or null.");
			System.exit(0);
		}
		if(name.isEmpty() || name==null) {
			System.err.println("Name cannot be empty or null.");
			System.exit(0);
		}
		super(name, price, category);
		this.shippingWeight=shippingWeight;
	}
	@Override
	public void applyDiscount(double percentage) {
		discount=(percentage*getPrice())/100;
		uprice=getPrice()-discount;
	}
	@Override
	public double calculateTax() {
		tex=(8*uprice)/100;
		return tex;
	}
	public double calculateShippingCost() {
		shippingCost=shippingWeight*5;
		return shippingCost;
	}
	@Override
	public String toString() {
		return "Physical Product:"
				+ "\nProduct Name: "+getName()+
				"\nCategory: "+getCategory()+
				"\nPrice RS: "+getPrice()+
				"\nShipping Weight: "+shippingWeight+
				"\nDiscount applied : "+discount+
				"\nNew Price : "+uprice+
				"\nTax RS : "+tex+
				"\nShipping Cost RS : "+shippingCost;
	}
	
	
}
