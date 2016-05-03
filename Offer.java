package org.eddie.cart;

public interface Offer {
	public void applyOffer(Cart c);
	public int getPenceValue();
	public String getDescription();
}
