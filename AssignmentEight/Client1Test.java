//James Shively III
//ITC155 - Data Structures
//Stani Meredith
//Assignment Eight - Client1Test.java
//Part 3 of 4

import static org.junit.Assert.*;

import org.junit.Test;

public class Client1Test {

	@Test
	public void test() {
		int[] data = {1,3,5,7,1};
		ArrayIntList a = new ArrayIntList();
		
		for(int n : data) {
			a.add(n);
		}
		
		assertEquals(a.lastIndexOf(data, 3), 1);
		assertEquals(a.replaceAll(1, 3), 3);
	}
	//I managed to get the jUnit tests running perfectly with each method I created to
	//work within it.  Looks like all those practice runs finally managed to pay off.
}
