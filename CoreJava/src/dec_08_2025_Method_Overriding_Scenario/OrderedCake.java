package dec_08_2025_Method_Overriding_Scenario;

public class OrderedCake extends Cake {
	private String message;

	public OrderedCake() {
		super("Round", "Vanilla", 1);
	}

	public OrderedCake(String shape, String flavor, int quantity) {
		super(shape, flavor, quantity);
	}

	public OrderedCake(String shape, String flavor, int quantity, String message) {
		super(shape, flavor, quantity);
		this.message = message;
	}

	@Override
	public String toString() {
		if (message == null || message.isEmpty()) {
			return super.toString();
		}
		return "A " + getShape() + " " + getFlavor() + " Cake of " + getQuantity() + " KG is Ready with Happy Birthday "
				+ this.message + " @ Rs. " + (price * this.getQuantity());
	}

}
