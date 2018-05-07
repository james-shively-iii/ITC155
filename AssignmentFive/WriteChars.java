//James Shively III
//ITC155 - Data Structures
//Stani Meredith
//Assignment Five - WriteChars.java

public class WriteChars {

	public static void main(String[] args) {
		writeChars(16);
	}
	
	public static void writeChars(int n) {
	    if (n < 1) {
	    	//base case - if parameter is 0 or negative integer
	        throw new IllegalArgumentException();
	    } else if (n == 1) {
	    	//case for if parameter is equal to 1
	        System.out.print("*");
	    } else if (n == 2) {
	    	//case for 2 as parameter
	        System.out.print("**");
	    } else {
	    	//recursive case where writeChars() is called
	        System.out.print("<");
	        writeChars(n - 2);
	        System.out.print(">");
	    }
	}

}
