//James Shively III
//ITC155 - Data Structures
//Stani Meredith
//Assignment 4 - WriteSequence.java

import java.util.Scanner;

public class WriteSequence {

	public static void main(String[] args) {
		reverse(1);
		System.out.println();
		reverse(2);
		System.out.println();
		reverse(3);
		System.out.println();
		reverse(4);
		System.out.println();
		reverse(5);
		System.out.println();
		reverse(6);
		System.out.println();
		reverse(7);
		System.out.println();
		reverse(8);
		System.out.println();
		reverse(9);
		System.out.println();
		reverse(10);
		/*  test and output
		  	1 
			1 1 
			2 1 2 
			2 1 1 2 
			3 2 1 2 3 
			3 2 1 1 2 3 
			4 3 2 1 2 3 4 
			4 3 2 1 1 2 3 4 
			5 4 3 2 1 2 3 4 5 
			5 4 3 2 1 1 2 3 4 5 
		 */
		
	}
	public static void reverse(int n) {
		//base case with IllegalArgumentException
		if (n < 1) {
	        throw new IllegalArgumentException("Unacceptable, try again");
	    } else if (n == 1) {
	    	//recursive case
	    	System.out.print("1 ");
	    } else {
	        System.out.print((n + 1) / 2 + " ");
	        if (n != 2) {
	            reverse(n - 2);
	        }
	        System.out.print((n + 1) / 2 + " ");
	    }

}
    
}