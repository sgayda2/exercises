package me.stoyan.exercises.pt02.base;

public interface DoubleLinkedListInterface {

	public boolean insertItem(int index, Object value);

	public void addItem(Object value);

	public Object getItem(int index);

	public Object removeItem(int index);

	public boolean isEmpty();

	public int getSize();
}
