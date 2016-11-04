package me.stoyan.exercises.pt01.base;

/**
 *
 */
public final class Node {

	public Node next;

	public Object value;

	public Node(Object value) {
		this.value = value;
	}

	public Node(Object value, Node next) {
		this.value = value;
		this.next = next;
	}
}
