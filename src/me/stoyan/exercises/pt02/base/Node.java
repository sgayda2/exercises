package me.stoyan.exercises.pt02.base;

/**
 *
 */
public final class Node {

	public Node(Object value) {
		this.value = value;
	}

	public Node(Object value, Node previous, Node next) {
		this.value = value;
		this.next = next;
		this.previous = previous;
	}

	public Node next;
	public Node previous;
	public Object value;
}
