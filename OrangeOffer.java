package org.eddie.cart;

import java.util.ArrayList;

public class OrangeOffer implements Offer {

	private int value;
	private boolean offerApplied = false;
	
	@Override
	public void applyOffer(Cart c) {
		offerApplied = true;
		value=0;
		ArrayList<Item> items = c.getItems();
		// apple offer is buy one get one free
		// count number of apples and divide by 2
		int count=0;
		Item orange = ItemFactory.create("Orange");
		for (Item i:items) {
			if (orange.equals(i)) {
				count ++;
				if (count % 3 == 0) {
					value += orange.getPenceValue();
				}
			}
		}
	}

	@Override
	public int getPenceValue() {
		if (offerApplied == false) {
			throw new RuntimeException("Offer not applied");
		}
		return value;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Oranges - 3 for 2";
	}
	
	
	
}
