package org.eddie.cart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppleOfferTest {

	Offer appleOffer;
	ShoppingCart cart;
	
	@Before
	public void setUp() throws Exception {
		appleOffer = new AppleOffer();
		cart = new ShoppingCart();
		//default to 3 apples and 1 orange - total 205
		// with offer 145
		cart.add(ItemFactory.create("Apple"));
		cart.add(ItemFactory.create("Orange"));
		cart.add(ItemFactory.create("Apple"));
		cart.add(ItemFactory.create("Apple"));
		cart.addOffer(appleOffer);
	}

	@Test
	public void testApplyOffer() {
		// add another apple
		cart.add(ItemFactory.create("Apple"));
		// no increase expected
		assertEquals(1.45, cart.getTotal(), 0);
		System.out.println(cart);
	}

	@Test
	public void testApplyOfferWithMoreApples() {
		// add three more apples
		cart.add(ItemFactory.create("Apple"));
		cart.add(ItemFactory.create("Apple"));
		cart.add(ItemFactory.create("Apple"));
		// increase expected of one apple
		assertEquals(2.05, cart.getTotal(), 0);
	}

	
	@Test
	public void testGetPenceValue() {
		assertEquals(1.45, cart.getTotal(), 0);
	}

}
