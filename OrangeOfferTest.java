package org.eddie.cart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrangeOfferTest {

	Offer orangeOffer;
	ShoppingCart cart;
	
	@Before
	public void setUp() throws Exception {
		orangeOffer = new OrangeOffer();
		cart = new ShoppingCart();
		//default to 1 apples and 3 orange - total 205
		// with offer 110
		cart.add(ItemFactory.create("Apple"));
		cart.add(ItemFactory.create("Orange"));
		cart.add(ItemFactory.create("Orange"));
		cart.add(ItemFactory.create("Orange"));
		cart.addOffer(orangeOffer);
	}

	@Test
	public void testApplyOffer() {
		// add another orange
		cart.add(ItemFactory.create("Orange"));
		// no increase expected
		assertEquals(1.35, cart.getTotal(), 0);
		System.out.println(cart);
	}

	@Test
	public void testApplyOfferWithMoreOranges() {
		// add three more oranges
		cart.add(ItemFactory.create("Orange"));
		cart.add(ItemFactory.create("Orange"));
		cart.add(ItemFactory.create("Orange"));
		// increase expected of two oranges
		assertEquals(1.60, cart.getTotal(), 0);
	}

	
	@Test
	public void testGetPenceValue() {
		assertEquals(1.10, cart.getTotal(), 0);
	}

}
