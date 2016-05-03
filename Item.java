package org.eddie.cart;

/**
 * An Item that can be placed into a shopping cart
 * 
 * @author eleeper
 *
 */
public class Item {
	
	// for serious money values use BigDecimal
	private int penceValue=0;	
	private String description="New Item";
	
	public Item(String description, int penceValue) {
		this.description = description;
		this.penceValue = penceValue;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPenceValue() {
		return penceValue;
	}
	public void setPenceValue(int penceValue) {
		this.penceValue = penceValue;
	}

	public boolean equals(Object o) {
		boolean result = false;
		if (o instanceof Item) {
			result = description.equals(((Item) o).description) &&
					penceValue == ((Item)o).penceValue;
		}
		return result;
	}
	
	public String toString() {
		return description + " : " + penceValue + "p";
	}

	
}
