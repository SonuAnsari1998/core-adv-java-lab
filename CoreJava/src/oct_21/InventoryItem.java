package oct_21;
/*Assignment 02 :
---------------
Design an inventory system for a retail store :
  
InventoryItem Class: [BLC Class]

Create an InventoryItem class with the following 
 
Instance Variables:(private for all the fields)
------------------------------------------------
Name			dataType
---------		-----------
itemName        	String 
pricePerUnit    	double 
quantityInStock 	int 

Implement a constructor that takes parameters to initialize the attributes of the InventoryItem object. [Validation is not reqd for this program]

Provide getter and setter methods for each attribute to ensure proper encapsulation.

 Method:
-------------
MethodName  	        :calculateTotalValue()
Return Type		:double
Access Modifier 	:public

This method should calculate and return the total value of the inventory item in stock, which is the product of the 
price per unit and the quantity in stock.

*/
class InventoryItem{
	private String itemName;
	private double pricePerUnit; 
 	private int quantityInStock;
	public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
		super();
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.quantityInStock = quantityInStock;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
 	public double calculateTotalValue() {
 		return this.pricePerUnit*this.quantityInStock;
 	}
}
























