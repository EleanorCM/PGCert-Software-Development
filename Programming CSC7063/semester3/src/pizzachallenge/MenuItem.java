package pizzachallenge;

public class MenuItem implements IDetail {
	private String name;
	private double price;
	
	public MenuItem(String name, double price) {
		super();
		setName(name);
		setPrice(price);
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name.isEmpty() || name.charAt(0)==' ' || !name.matches("[a-zA-Z ]+")) {
			this.name = "INVALID NAME";
		} else {
			this.name = name;
		}
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}

	public void printDetails() {
		System.out.printf("%s ..... £%.2f\n", getName(), getPrice());
	}
}
