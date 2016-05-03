package org.eddie.cart;

import java.util.ArrayList;

public interface Cart {
	public void add(Item i);
	public void remove(Item i);
	// intelligent Cart can also do checkout, which could be a separate class
	public double getTotal();
	public ArrayList<Item> getItems();
}
