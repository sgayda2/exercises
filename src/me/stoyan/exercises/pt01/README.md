# Exercise 1 #

###### Getting Started ######
To start this exercise, make a copy of the example package and rename it to your
name.

You will need to fill in the blanks for the LinkedList class such that when
you run the test class within your package it passes all of the tests.

###### Linked Lists ######
A linked list is a list of items where each part of the list has a pointer to
the next part of the list. The linked list does not things to be created ahead
of time and the items it stores are usually not stored next to each other in
memory.

We have a Node class that is part of the basic structure of a Linked List. It
contains a value of some kind and a pointer to the next Node in the list.

```java
public class Node {
	public Node next;
	public Object value;
	...
}
```

The challenge is to implement a LinkedList class that uses the Node class to
store its data. The basic methods we want out of our Linked List are defined in
the LinkedListInterface class.

```java
	public boolean insertItem(int index, Object value);
	public void addItem(Object value);
	public Object getItem(int index);
	public Object removeItem(int index);
	public boolean isEmpty();
	public int getSize();
```