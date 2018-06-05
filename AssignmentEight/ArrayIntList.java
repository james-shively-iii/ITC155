//James Shively III
//ITC155 - Data Structures
//Stani Meredith
//Assignment Eight - ArrayIntList.java
//Part 1 of 4

//this is just an extension of the class exercise we did last Thursday
//at the bottom of this class, I created the methods and commented
//on each of them for each exercise on pg.961 for Ch.15

import java.util.Arrays;

//second version of ArrayIntList to store a list of ints
public class ArrayIntList {
	
	//instance variables
	private int[] elementData;
	private int size;
	
	public static final int DEFAULT_CAPACITY = 100;
	
	//constructor
	public ArrayIntList() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayIntList(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException("capacity " + capacity);
		}
		elementData = new int[capacity];
		size = 0;
	}
	
	//return the current number of elements in the list
	public int size() {
		return size;
	}
	
	//pre: 0 <= index < size()
	//post: return the integer value at the given index in the list
	public int get(int index) {
		checkIndex(index);
		return elementData[index];
	}

	//throw an exception if index is not legal
	private void checkIndex(int index) {
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("index " + index);
		}
		
	}
	
	//create a comma separated bracketed version of the list
	public String toString() {
		if(size == 0) {
			return "[]";
		} else {
			//fence post
			String result = "[" +  elementData[0];
			for(int i = 1; i < size; i++) {
				result += ", " + elementData[i];
			}
			result += "]";
			return result;
		}
	}
	
	//return position of first occurrence of the value
	//-1 is not found
	public int indexOf(int value) {
		for(int i = 0; i < size; i++) {
			if(elementData[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	//return true if list is empty
	public boolean isEmpty() {
		return size == 0; //return true if size is 0
	}
	
	//return true if a value is in the list
	public boolean contains(int value) {
		return indexOf(value) >= 0; //return true if it contains values
	}
	
	//append the value to the end of the list
	public void add(int value) {
		ensureCapacity(size + 1);
		elementData[size] = value;
		size++;
	}
	
	//append the value to the end of the list
	public void add(int index, int value) {
		checkIndex(index);
		ensureCapacity(size + 1);
		for(int i = size; i > index; i--) {
			elementData[i] = elementData[i-1];
		}
		elementData[index] = value;
		size++;
	}
	

	//ensure that array is of given capacity or double the size
	private void ensureCapacity(int capacity) {
		if(capacity > elementData.length) { 
			int newCapacity = elementData.length * 2 + 1;
			if(capacity > newCapacity) {
				newCapacity = capacity;
			}
			elementData = Arrays.copyOf(elementData, newCapacity);
		}	
	}
	
	//remove value at a given index; need to shift subsequent values to left
	public void remove(int index) {
		checkIndex(index);
		for(int i = index; i < size -1; i++) {
			elementData[i] = elementData[i+1];
		}
		size--;
	}
	
	//replace an int at a given index with a new value
	public void set(int index, int value) {
		checkIndex(index);
		elementData[index] = value;
	}
	
	//the list is empty
	public void clear() {
		size = 0;
	}
	
	//append all values in the list to the end of this list
	public void addAll(ArrayIntList other) {
		ensureCapacity(size + other.size());
		for(int i = 0; i < other.size(); i++) {
			add(i, other.elementData[i]);
		}
	}
	
	//
	public ArrayListIterator iterator() {
		return new ArrayListIterator(this);
	}
	
	
	//HERE IS THE METHOD FOR 15.E #1 lastIndexOf
	public int lastIndexOf(int[] a, int v) {
		for (int i = a.length - 1; i >= 0; i--) {
	        if (a[i] == v) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
	
	//HERE IS THE METHOD FOR 15.E #3 replaceAll
	public int replaceAll(int v, int r) {
		for(int i = 0; i < size; i++) {
			if(elementData[i] == v) {
				elementData[i] = r;
			}
		}
		return r;
	}
		
	
}
