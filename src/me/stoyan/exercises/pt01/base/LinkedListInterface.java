package me.stoyan.exercises.pt01.base;

public interface LinkedListInterface {

	public void addItem(Object value);

	// For testing only
	public Node getFirstNode();

	public Object getItem(int index);

	public int getSize();

	public boolean insertItem(int index, Object value);

	public boolean isEmpty();

	public Object removeItem(int index);

	public boolean setItem(int index, Object value);
}
