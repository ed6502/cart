package org.eddie.cart;

public class ItemFactory {
	public static Item create(String desc) {
		if ("Apple".equalsIgnoreCase(desc)) {
			return new Item("Apple", 60);
		}
		else if ("Orange".equalsIgnoreCase(desc)) {
			return new Item("Orange", 25);
		}
		else {
			return null;
		}
		
	}
}
