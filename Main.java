package org.eddie.cart;

import java.awt.DisplayMode;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage: \n java org.eddie.cart.Main [Items]\n"
					+ "e.g. java org.eddie.cart.Main Apple Apple Orange");
			
		}
		else {
			// create a new empty cart
			ShoppingCart cart = new ShoppingCart();
			for (String arg:args) {
				cart.add(ItemFactory.create(arg));
			}
			displayCart(cart);
		}

	}
	
	public static void displayCart(ShoppingCart cart) {
		String contents = "Shopping Cart:\n";
		ArrayList<Item> items= cart.getItems();
		if (items.isEmpty()) {
			contents += "Is Empty";
		}
		else {
			for (Item i:items) {
				contents += i.getDescription() + "\t " + i.getPenceValue() + "\n";
			}
			contents +="--------------\n";
			contents +="TOTAL : £" + cart.getTotal();
		}
		System.out.println(contents);
	}

}
