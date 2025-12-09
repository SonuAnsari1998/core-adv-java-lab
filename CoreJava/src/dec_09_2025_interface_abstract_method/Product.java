package dec_09_2025_interface_abstract_method;

public abstract class Product {
	 private String name;
	 private double price;
	 private String category;
	 public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	 }
	 public abstract void applyDiscount(double percentage) ;
	 public abstract double calculateTax() ;
		 
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public void setPrice(double price) {
		 this.price = price;
	 }
	 public String getCategory() {
		 return category;
	 }
	 public void setCategory(String category) {
		 this.category = category;
	 }
	 @Override
	 public String toString() {
		return "Product [" + (name != null ? "name=" + name + ", " : "") + "price=" + price + ", "
				+ (category != null ? "category=" + category : "") + "]";
	 }	 
	 
}
