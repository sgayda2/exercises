package me.stoyan.exercises.pt00.base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public abstract class ArrayListTestInterface<T extends ArrayListInterface> {

	private void assertEmpty(T list) {
		assertNotNull(list);
		assertTrue(list.isEmpty());
		assertEquals(0, list.getSize());
		assertNull(list.getItem(0));
	}

	public abstract T createNewList(int capacity);

	@Test
	public void setupTest() {
		assertNull(createNewList(-10));
		assertEmpty(createNewList(0));
		assertEmpty(createNewList(10));
	}

	@Test
	public void testAdd() {
		T list = createNewList(2);

		assertTrue(list.isEmpty());
		assertEquals(0, list.getSize());

		Integer value1 = new Integer(1);
		Integer value2 = new Integer(2);
		Integer value3 = new Integer(3);
		Integer value4 = new Integer(4);

		list.addItem(value1);
		assertFalse(list.isEmpty());
		assertEquals(1, list.getSize());
		assertEquals(value1, list.getItem(0));

		list.addItem(value2);
		assertFalse(list.isEmpty());
		assertEquals(2, list.getSize());
		assertEquals(value1, list.getItem(0));
		assertEquals(value2, list.getItem(1));

		list.addItem(value3);
		assertFalse(list.isEmpty());
		assertEquals(3, list.getSize());
		assertEquals(value1, list.getItem(0));
		assertEquals(value2, list.getItem(1));
		assertEquals(value3, list.getItem(2));

		list.addItem(value4);
		assertFalse(list.isEmpty());
		assertEquals(4, list.getSize());
		assertEquals(value1, list.getItem(0));
		assertEquals(value2, list.getItem(1));
		assertEquals(value3, list.getItem(2));
		assertEquals(value4, list.getItem(3));
	}

	@Test
	public void testGet() {
		T list = createNewList(2);

		assertNull(list.getItem(-10));
		assertNull(list.getItem(10));
		assertNull(list.getItem(1));
		assertNull(list.getItem(0));

		Object value1 = new Object();
		list.addItem(value1);

		assertNull(list.getItem(-10));
		assertNull(list.getItem(10));
		assertNull(list.getItem(1));
		assertEquals(value1, list.getItem(0));
	}

	@Test
	public void testInsert() {
		T list = createNewList(2);

		Integer value1 = new Integer(1);
		Integer value2 = new Integer(2);
		Integer value3 = new Integer(3);
		Integer value4 = new Integer(4);
		Integer value5 = new Integer(5);
		Integer value6 = new Integer(6);
		Integer value7 = new Integer(7);

		assertFalse(list.insertItem(1, value1));
		assertFalse(list.insertItem(-10, value2));
		assertFalse(list.insertItem(10, value1));

		assertTrue(list.isEmpty());
		assertEquals(0, list.getSize());

		assertTrue(list.insertItem(0, value1));
		assertFalse(list.isEmpty());
		assertEquals(1, list.getSize());
		assertEquals(value1, list.getItem(0));

		assertTrue(list.insertItem(0, value2));
		assertFalse(list.isEmpty());
		assertEquals(2, list.getSize());
		assertEquals(value2, list.getItem(0));
		assertEquals(value1, list.getItem(1));

		assertFalse(list.insertItem(3, value1));
		assertFalse(list.insertItem(-10, value2));
		assertFalse(list.insertItem(10, value1));

		assertTrue(list.insertItem(2, value3));
		assertFalse(list.isEmpty());
		assertEquals(3, list.getSize());
		assertEquals(value2, list.getItem(0));
		assertEquals(value1, list.getItem(1));
		assertEquals(value3, list.getItem(2));

		assertTrue(list.insertItem(2, value4));
		assertFalse(list.isEmpty());
		assertEquals(4, list.getSize());
		assertEquals(value2, list.getItem(0));
		assertEquals(value1, list.getItem(1));
		assertEquals(value4, list.getItem(2));
		assertEquals(value3, list.getItem(3));

		list.addItem(value5);
		assertFalse(list.isEmpty());
		assertEquals(5, list.getSize());
		assertEquals(value2, list.getItem(0));
		assertEquals(value1, list.getItem(1));
		assertEquals(value4, list.getItem(2));
		assertEquals(value3, list.getItem(3));
		assertEquals(value5, list.getItem(4));

		assertTrue(list.insertItem(5, value6));
		assertFalse(list.isEmpty());
		assertEquals(6, list.getSize());
		assertEquals(value2, list.getItem(0));
		assertEquals(value1, list.getItem(1));
		assertEquals(value4, list.getItem(2));
		assertEquals(value3, list.getItem(3));
		assertEquals(value5, list.getItem(4));
		assertEquals(value6, list.getItem(5));

		list.addItem(value7);
		assertFalse(list.isEmpty());
		assertEquals(7, list.getSize());
		assertEquals(value2, list.getItem(0));
		assertEquals(value1, list.getItem(1));
		assertEquals(value4, list.getItem(2));
		assertEquals(value3, list.getItem(3));
		assertEquals(value5, list.getItem(4));
		assertEquals(value6, list.getItem(5));
		assertEquals(value7, list.getItem(6));
	}

	@Test
	public void testRemove() {
		T list = createNewList(2);

		Object value1 = new Object();
		Object value2 = new Object();
		Object value3 = new Object();
		Object value4 = new Object();
		Object value5 = new Object();
		Object value6 = new Object();

		assertNull(list.removeItem(-10));
		assertNull(list.removeItem(10));
		assertNull(list.removeItem(0));

		list.addItem(value1);
		list.addItem(value2);
		list.addItem(value3);
		list.addItem(value4);

		assertFalse(list.isEmpty());
		assertEquals(4, list.getSize());

		assertNull(list.removeItem(-10));
		assertNull(list.removeItem(10));
		assertNull(list.removeItem(4));
		assertNull(list.removeItem(5));

		assertEquals(value1, list.removeItem(0));
		assertFalse(list.isEmpty());
		assertEquals(3, list.getSize());
		assertEquals(value2, list.getItem(0));
		assertEquals(value3, list.getItem(1));
		assertEquals(value4, list.getItem(2));
		assertNull(list.getItem(3));
		assertNull(list.getItem(4));

		assertEquals(value3, list.removeItem(1));
		assertFalse(list.isEmpty());
		assertEquals(2, list.getSize());
		assertEquals(value2, list.getItem(0));
		assertEquals(value4, list.getItem(1));
		assertNull(list.getItem(2));
		assertNull(list.getItem(3));
		assertNull(list.getItem(4));

		assertEquals(value2, list.removeItem(0));
		assertFalse(list.isEmpty());
		assertEquals(1, list.getSize());
		assertEquals(value4, list.getItem(0));
		assertNull(list.getItem(1));
		assertNull(list.getItem(2));
		assertNull(list.getItem(3));
		assertNull(list.getItem(4));

		list.addItem(value5);
		assertFalse(list.isEmpty());
		assertEquals(2, list.getSize());
		assertEquals(value4, list.getItem(0));
		assertEquals(value5, list.getItem(1));
		assertNull(list.getItem(2));
		assertNull(list.getItem(3));
		assertNull(list.getItem(4));

		assertEquals(value4, list.removeItem(0));
		assertFalse(list.isEmpty());
		assertEquals(1, list.getSize());
		assertEquals(value5, list.getItem(0));
		assertNull(list.getItem(1));
		assertNull(list.getItem(2));
		assertNull(list.getItem(3));
		assertNull(list.getItem(4));

		assertEquals(value5, list.removeItem(0));
		assertTrue(list.isEmpty());
		assertEquals(0, list.getSize());
		assertNull(list.getItem(0));
		assertNull(list.getItem(1));
		assertNull(list.getItem(2));
		assertNull(list.getItem(3));
		assertNull(list.getItem(4));

		list.addItem(value6);
		assertFalse(list.isEmpty());
		assertEquals(1, list.getSize());
		assertEquals(value6, list.getItem(0));
		assertNull(list.getItem(1));
		assertNull(list.getItem(2));
		assertNull(list.getItem(3));
		assertNull(list.getItem(4));
	}

	@Test
	public void testSetValue() {
		T list = createNewList(2);

		Integer value1 = new Integer(1);
		Integer value2 = new Integer(2);
		Integer value3 = new Integer(3);

		assertFalse(list.setItem(-12, value1));
		assertEquals(0, list.getSize());
		assertTrue(list.isEmpty());

		assertFalse(list.setItem(2, value1));
		assertEquals(0, list.getSize());
		assertTrue(list.isEmpty());

		assertFalse(list.setItem(3, value1));
		assertEquals(0, list.getSize());
		assertTrue(list.isEmpty());

		list.addItem(value1);
		list.addItem(value2);
		assertEquals(2, list.getSize());
		assertFalse(list.isEmpty());

		assertFalse(list.setItem(-12, value1));
		assertEquals(2, list.getSize());
		assertFalse(list.isEmpty());

		assertFalse(list.setItem(2, value1));
		assertEquals(2, list.getSize());
		assertFalse(list.isEmpty());

		assertFalse(list.setItem(3, value1));
		assertEquals(2, list.getSize());
		assertFalse(list.isEmpty());

		assertTrue(list.setItem(1, value3));
		assertEquals(value1, list.getItem(0));
		assertEquals(value3, list.getItem(1));
		assertEquals(2, list.getSize());
		assertFalse(list.isEmpty());
	}
}
