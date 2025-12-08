package dec_08_2025_Method_Overriding_Scenario;

public class Cake {
	private String shape;
	private String flavor;
	private int quantity;
	public static double price = 400;

	public Cake(String shape, String flavor, int quantity) {
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		//"A Round Chocolate Cake Of 4 KG is Ready @ Rs.1600.0"
		return "A "+shape+" "+flavor+" Cake Of "+quantity+" KG is Ready @ Rs. "+(price*getQuantity());
	}
	
}
