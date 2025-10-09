package Sep_23;
/*Program-1
-----------
A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. Apart from this a GST of 5% is charged. 
Display total selling price, profit along with GST charge.*/
class Shopkeeper {
	public static void main(String []args) {
		double sellingPrice=Double.parseDouble(args[0]);
		double profit1=Integer.parseInt(args[1]);
		double gst1=Integer.parseInt(args[2]);
		
		double profit=(profit1*sellingPrice)/100;
		double totalPrice=sellingPrice+profit;
		double gst=(gst1*totalPrice)/100;
		double profitPrice=totalPrice-gst;
		
		
		System.out.println("Total Selling Price : "+totalPrice);
		System.out.println("apply gst(5%) :"+gst);
		System.out.println("Profit : "+profitPrice);
	}

}
