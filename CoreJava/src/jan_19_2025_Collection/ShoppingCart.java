package jan_19_2025_Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {
	ArrayList<Product> productList = new ArrayList<Product>();

	public void addProduct(Product product) {
		productList.add(product);
	}
	public void removeProduct(int id) {
		ListIterator<Product> list=productList.listIterator();
		while(list.hasNext()) {
			Product p=list.next();
			if(p.getProductId()==id) {
				list.remove();
				IO.println("Product id "+id+" Deleted Successfullu.........");
			}else {
				IO.println(id+" is not available");
			}
		}
	}
	public void updateQuantity(int id,int productQuantuty) {
		ListIterator<Product> list=productList.listIterator();
		boolean isFound=false;
		
		while(list.hasNext()) {
			Product p=list.next();
			if(p.getProductId()==id) {
				p.setProductQuantuty(productQuantuty);
				IO.println(productQuantuty +" is Updated Sucessfully.......");
				isFound=true;
				break;
			}
		}
		if(!isFound) {
			IO.println("Product id not found...........");
		}
	}
	public void showData() {
		for(Product products : productList) {
			IO.println(products);
		}
	}
}
