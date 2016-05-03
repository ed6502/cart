package org.eddie.cart;

import java.util.ArrayList;

public class ShoppingCart implements Cart {

	private ArrayList<Item> items = new ArrayList<Item>();
	
	@Override
	public void add(Item i) {
		// TODO Auto-generated method stub
		items.add(i);
	}

	@Override
	public void remove(Item i) {
		items.remove(i);
	}

	@Override
	public double getTotal() {
		int total = 0;
		for (Item i:items) {
			total += i.getPenceValue();
		}
		return (double)total/100;
	}

	@Override
	public ArrayList<Item> getItems() {
		return items;
	}

}
