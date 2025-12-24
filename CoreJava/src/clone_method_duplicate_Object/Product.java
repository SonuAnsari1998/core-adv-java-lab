package clone_method_duplicate_Object;

class Product implements Cloneable {
	Integer id;
	String name;

	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}

