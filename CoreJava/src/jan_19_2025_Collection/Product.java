package jan_19_2025_Collection;

public class Product {
	int productId;
	String productName;
	double productPrice;
	int productQuantuty;

	public Product(int productId, String productName, double productPrice, int productQuantuty) {
		if(productId<0) {
			IO.println("Please Enter Possitive Product id");
			System.exit(0);
		
		}
		else {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantuty = productQuantuty;
		}
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantuty() {
		return productQuantuty;
	}

	public void setProductQuantuty(int productQuantuty) {
		this.productQuantuty = productQuantuty;
	}

	@Override
	public String toString() {
		return "[ Product Details: "+"Product Id: "+this.productId+" Product Name: "+this.productName+" Product Price: "+this.productPrice+" Product Quantity"+this.productQuantuty+" ]";
	}

}
