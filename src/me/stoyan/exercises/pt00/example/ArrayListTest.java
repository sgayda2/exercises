package me.stoyan.exercises.pt00.example;

import me.stoyan.exercises.pt00.base.ArrayListTestInterface;

public class ArrayListTest extends ArrayListTestInterface<ArrayList> {

	@Override
	public ArrayList createNewList(int capacity) {
		return new ArrayList(capacity);
	}

}
