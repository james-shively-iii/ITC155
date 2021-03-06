//James Shively III
//ITC155 - Data Structures
//Stani Meredith
//Assignment Eight - ArrayIntList.java
//Part 4 of 4

//this is just an extension of the class exercise we did last Thursday

import java.util.NoSuchElementException;

//provides a set of utilities for iterating
public class ArrayListIterator {
	
	//instance variables
	private ArrayIntList list; //list to iterate over
	private int position; //current position within the list
	private boolean removeOK;
	
	//constructor
	public ArrayListIterator(ArrayIntList list) {
		this.list = list;
		position = 0;
		removeOK = false;
	}
	
	//return true if there are more elements
	public boolean hasNext() {
		return position < list.size();
	}
	
	//pre: hasNext()
	//post: return the next element in the iteration
	public int next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		int result = list.get(position);
		position++;
		removeOK = true;
		return result;
	}
	
	//pre: next() has been called without a call on remove
	//post: remove the last element returned by the iterator
	public void remove() {
		if(!removeOK) {
			throw new IllegalStateException();
		}
		list.remove(position - 1);
		position--;
		removeOK = false;
	}
}
