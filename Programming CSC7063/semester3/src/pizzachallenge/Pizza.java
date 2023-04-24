package pizzachallenge;

import java.util.ArrayList;

import org.w3c.dom.ls.LSOutput;

public class Pizza extends MenuItem {

	private int size;
	private ArrayList<Topping> ExtraToppings = new ArrayList<Topping>(0);
	
	private static final int MAXSIZE = 16;
	private static final int MINSIZE = 8;
	private static final double TOPPINGPRICE = .5;
	
	public Pizza(int size) {
		super("Pizza", size);
		setSize(size);
		ExtraToppings = new ArrayList<Topping>();
	}
	

	public void addTopping(Topping topping) {
		if (ExtraToppings.contains(topping)) {
			System.err.println("Topping already on pizza");
		} else {
			ExtraToppings.add(topping);
			double currentPrice = this.getPrice();
			this.setPrice(currentPrice + TOPPINGPRICE);
		}
	}
	
	@Override
	public void printDetails() {
		pizzaDetail();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public double getPrice() {
		return super.getPrice();
	}

	public void setPrice(double price) {
		super.setPrice(price);
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size < MINSIZE) {
			this.size = MINSIZE;
		} else if (size > MAXSIZE) {
			this.size = MAXSIZE;
		} else {
			this.size = size;
		}
		setPrice(this.size);
	}

	private void pizzaDetail() {
		System.out.printf("%s %d\" ..... £%.2f\n", getName(), getSize(), getPrice());
		if (ExtraToppings.size() > 0) {
			System.out.println("   Toppings:");
			for (Topping t : ExtraToppings) {
				System.out.println("   " + t.toString());
			}
		} else {
			System.out.println("   No extra toppings");
		}
	}
	
	public boolean isVegetarian(){
		ArrayList<Topping> meatyToppings = new ArrayList<Topping>(0);
		meatyToppings.add(Topping.BEEF);
		meatyToppings.add(Topping.CHICKEN);
		meatyToppings.add(Topping.HAM);
		meatyToppings.add(Topping.PEPPERONI);
		for (Topping t : this.ExtraToppings) {
			if (meatyToppings.contains(t)) {
				return false;
			}
		}
		return true;
	}
}
