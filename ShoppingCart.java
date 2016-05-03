package org.eddie.cart;

import java.util.ArrayList;

public class ShoppingCart implements Cart {

	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<Offer> vouchers = new ArrayList<Offer>();
	
	@Override
	public void add(Item i) {
		items.add(i);
		// need to recalc offers
		ArrayList<Offer> localvouchers = vouchers;
		vouchers = new ArrayList<Offer>();
		for (Offer o:localvouchers) {
			addOffer(o);
		}
		
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
		// use any offers/vouchers
		for (Offer o:vouchers) {
			total -= o.getPenceValue();
		}
		return (double)total/100;
	}

	@Override
	public ArrayList<Item> getItems() {
		return items;
	}

	@Override
	public void addOffer(Offer o) {
		if (vouchers.contains(o)) {
			System.err.println("Warning: Offer already applied");
		}
		else {
			vouchers.add(o);
			o.applyOffer(this);
		}
	}

	@Override
	public ArrayList<Offer> getOffers() {
		return vouchers;
	}

}
