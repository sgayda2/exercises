package me.stoyan.exercises.pt02.example;

import me.stoyan.exercises.pt02.base.DoubleLinkedListTestInterface;

public class DoubleLinkedListTest extends DoubleLinkedListTestInterface<DoubleLinkedList> {

	@Override
	public void setup() {
		list = new DoubleLinkedList();
	}

}
