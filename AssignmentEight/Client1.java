//James Shively III
//ITC155 - Data Structures
//Stani Meredith
//Assignment Eight - Client1.java
//Part 2 of 4

public class Client1 {
	public static void main(String[] args) {
		int[] data = {1,2,3,2,4,2,5,2};
		ArrayIntList list = new ArrayIntList();
		
		for(int n : data) {
			list.add(n);
		}
		
		System.out.println(list.toString());
		ArrayListIterator i = list.iterator();
		int product = 1;
		
		while(i.hasNext()) {
			int n = i.next();
			if(n == 0) {
				i.remove();
			} else {
				product *= n;
			}
		}
		
		System.out.println("list now " + list.toString());
		System.out.println("product " + product);
		System.out.println("The last instance of 2 is in index " + list.lastIndexOf(data, 2));
		System.out.println("List before replacement: " + list.toString());
		list.replaceAll(2, 8);
		System.out.println("List after replacement: " + list.toString());
		
	}
	
}
