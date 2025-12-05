package loose_coupling_concept;

public interface HotDrink {
	void prepare();
}

class Tea implements HotDrink {
	public void prepare() {
		System.out.println("Preparing Tea");
	}
}

class Coffee implements HotDrink {
	public void prepare() {
		System.out.println("Preparing Coffee");
	}
}

class Horlicks implements HotDrink {
	public void prepare() {
		System.out.println("Preparing Horlicks");
	}
}

class Resturant {
	public static void acceptObject(HotDrink hd) {
		hd.prepare();
	}
}

class LooseCoupling {
	public static void main(String[] args) {
		Resturant.acceptObject(new Tea());
		Resturant.acceptObject(new Coffee());
		Resturant.acceptObject(new Horlicks());
	}
}

