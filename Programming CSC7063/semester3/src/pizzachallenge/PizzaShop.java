package pizzachallenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PizzaShop {

	public static void printReceipt(ArrayList<MenuItem> menuItems) {
		double total = 0;
		System.out.println("\nPRINTING RECEIPT");
		for (MenuItem item : menuItems) {
			item.printDetails();
			total += item.getPrice();
		}
		System.out.println("\n\t\t* * * * * * *");
		System.out.printf("\t\tTotal: £%.2f\n", total);
		System.out.println("\t\t* * * * * * *");
		System.out.println("RECEIPT END");
	}

	public static void findVeggies(ArrayList<MenuItem> menuItems) {
		ArrayList<Pizza> veggieItems = new ArrayList<Pizza>(0);
		System.out.println("\n* * * * * * * * *");
		System.out.println("Vegetarian pizzas");
		System.out.println("* * * * * * * * *");
		for (MenuItem item : menuItems) {
			if (item.getClass().equals(Pizza.class)) {
				Pizza pizza = (Pizza) item;
				if (pizza.isVegetarian()) {
					veggieItems.add(pizza);
					pizza.printDetails();
				}

			}
		}
		System.out.println("Total vegetarian pizzas: " + veggieItems.size());
	}

	public static ArrayList<MenuItem> readFromOrderFile(String fileName) {
		ArrayList<MenuItem> itemsFromCsv = new ArrayList<MenuItem>(0);
		File f = new File(fileName);
		FileReader fr;

		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine(); // first line is header - ignore
			line = br.readLine(); // read first true line

			while (line != null) {			
				String[] parts = line.split(",");
				if (parts[0].toLowerCase().equals("pizza")) {
					ArrayList<Topping> currentToppings = new ArrayList<Topping>(0);
					for (int i = 2; i<parts.length; i++) {
						currentToppings.add(Topping.valueOf(parts[i]));
					}
					int pizzaSize = Integer.parseInt(parts[1]) - (int) (currentToppings.size() * .5);
					Pizza currentItem = new Pizza(pizzaSize);
					for (Topping t : currentToppings) {
						currentItem.addTopping(t);
					}

					itemsFromCsv.add(currentItem);
				} else {
					MenuItem currentItem = new MenuItem(parts[0], Double.parseDouble(parts[1]));
					itemsFromCsv.add(currentItem);
				}
				
				line = br.readLine(); // read next line
			}

			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.err.println("File Not Found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return itemsFromCsv;
	}

	public static void main(String[] args) {
		MenuItem pasta = new MenuItem("Linguine", 10);
		MenuItem burger = new MenuItem("Burger", 5.50);
		Pizza p1 = new Pizza(14);
		Pizza p2 = new Pizza(20);
		Pizza p3 = new Pizza(5);
		p1.addTopping(Topping.CHICKEN);
		p1.addTopping(Topping.MUSHROOMS);
		p1.addTopping(Topping.CHICKEN);
		p3.addTopping(Topping.EXTRACHEESE);
		p3.addTopping(Topping.MUSHROOMS);
		p3.addTopping(Topping.PEPPERS);

		ArrayList<MenuItem> myOrder = new ArrayList<MenuItem>(0);
		myOrder.add(pasta);
		myOrder.add(burger);
		myOrder.add(p1);
		myOrder.add(p2);
		myOrder.add(p3);

		printReceipt(myOrder);

		findVeggies(myOrder);
		
		ArrayList<MenuItem> listFromFile = readFromOrderFile("OrderList-3-Full.csv");
		printReceipt(listFromFile);
		

	}
}
