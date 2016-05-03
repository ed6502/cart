package org.eddie.cart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {

	private ShoppingCart cart;
	
	@Before
	public void setUp() throws Exception {
		cart = new ShoppingCart();
	}
	
	@Test
	public void testAdd() {
		Item pc = new Item("IBM PC", 2000);
		cart.add(pc);
		assertTrue(cart.getItems().contains(pc));
		assertTrue(cart.getItems().size() == 1);
	}

	@Test
	public void testRemove() {
		Item pc = new Item("IBM PC", 2000);
		cart.add(pc);
		cart.remove(pc);
		assertFalse(cart.getItems().contains(pc));
		assertTrue(cart.getItems().size() == 0);
	}

	@Test
	public void testAddMultiple() {
		Item pc = new Item("IBM PC", 2000);
		Item mac = new Item("Apple Mac", 666);
		cart.add(pc);
		cart.add(mac);
		assertTrue(cart.getItems().contains(pc));
		assertTrue(cart.getItems().contains(mac));
		assertTrue(cart.getItems().size() == 2);
	}

	@Test
	public void testRemoveFromMultiple() {
		Item pc = new Item("IBM PC", 2000);
		Item mac = new Item("Apple Mac", 666);
		cart.add(pc);
		cart.add(mac);
		cart.remove(pc);
		assertFalse(cart.getItems().contains(pc));
		assertTrue(cart.getItems().contains(mac));
		assertTrue(cart.getItems().size() == 1);
		// compare - total is in pounds
		assertEquals(6.66, cart.getTotal(), 0);
	}

	
	@Test
	public void testTotal() {
		Item pc = new Item("IBM PC", 2000);
		Item mac = new Item("Apple Mac", 666);
		cart.add(pc);
		cart.add(mac);
		// compare - total is in pounds
		assertEquals(26.66, cart.getTotal(), 0);
	}

}
