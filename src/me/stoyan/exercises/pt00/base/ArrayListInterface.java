package me.stoyan.exercises.pt00.base;

public interface ArrayListInterface {

	public void addItem(Object value);

	public Object getItem(int index);

	public int getSize();

	public boolean insertItem(int index, Object value);

	public boolean isEmpty();

	public Object removeItem(int index);

	public boolean setItem(int index, Object value);
}
