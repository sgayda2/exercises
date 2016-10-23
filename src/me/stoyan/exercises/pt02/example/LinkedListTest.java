package me.stoyan.exercises.pt02.example;

import me.stoyan.exercises.pt01.base.LinkedListTestInterface;

public class LinkedListTest extends LinkedListTestInterface<LinkedList> {

	@Override
	public void setup() {
		list = new LinkedList();
	}

}
