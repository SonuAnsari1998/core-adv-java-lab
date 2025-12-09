package dec_09_2025_interface_abstract_method;

public class DigitalProduct extends Product {
	private String licenseKey;
	private double uprice;
	private double discount;
	private double tex;
	public DigitalProduct(String name, double price, String category, String licenseKey) {
		if(price<=0) {
			System.err.println("Price cannot be negative.");
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
		if(licenseKey.isEmpty() || licenseKey==null) {
			System.err.println("LicenseKey cannot be empty or null.");
			System.exit(0);
		}
		super(name, price, category);
		this.licenseKey=licenseKey;
	}
	@Override
	public void applyDiscount(double percentage) {
		discount=(percentage*getPrice())/100;
		uprice=getPrice()-discount;
	}
	@Override
	public double calculateTax() {
		tex=(5*uprice)/100;
		return tex;
	}
	@Override
	public String toString() {
		return "Product Name: "+getName()+
				"\nCategory: "+getCategory()+
				"\nPrice RS: "+getPrice()+
				"\nLicense Key: "+licenseKey+
				"\nDiscount applied : "+discount+
				"\nNew Price : "+uprice+
				"\nTax RS : "+tex;
	}
	
	
	
}
