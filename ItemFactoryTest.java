package org.eddie.cart;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ItemFactoryTest {

	@Test
	public void testCreateUnknownItem() {
		Item x = ItemFactory.create("Plum");
		assertNull(x);
	}

	@Test
	public void testCreateApple() {
		Item x = ItemFactory.create("apple");
		Item apple = new Item("Apple", 60);
		assertEquals(apple, x);
	}

	@Test
	public void testCreateOrange() {
		Item x = ItemFactory.create("orange");
		Item orange = new Item("Orange", 25);
		assertEquals(orange, x);
	}

	@Test
	public void testCreateConApple() {
		Item x = ItemFactory.create("apple");
		Item apple = new Item("Apple", 50);
		assertNotEquals(apple, x);
	}

	@Test
	public void testCreateConOrange() {
		Item x = ItemFactory.create("orange");
		Item orange = new Item("Orange", 20);
		assertNotEquals(orange, x);
	}

	
}
