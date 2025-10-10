package blc;
/*Program 01:
-----------
Write a Program on OOPs to define Product class properties and behaviour.

Properties/Field/Attribute :

productId : int
productName : String
productPrice : double

Initialize these properties with the help of method using parameter variable.

behavior/Method:
setProductData(int id, String name, double price) : public void
getProductInfo() : public void*/
public class Product_BLC {
	int productId;
	String productName;
	double productPrice;
	public void setProductData(int id, String name, double price) {
		productId=id;
		productName=name;
		productPrice=price;
	}
	public void getProductInfo() {
		System.out.println("Product id is: "+productId+"\nand Product Name is: "
	+productName+"\nand Product price is "+productPrice);
	}
	
}
