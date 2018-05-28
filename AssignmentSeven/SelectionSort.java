//James Shively III
//ITC155 - Data Structures
//Stani Meredith
//Assignment Seven - SelectionSort.java

//now I've worked on this for all of Sunday and most of the Monday morning
//and I still don't know if I'm doing it right.  I know that it is sorting
//but making it the minimum value instead of the maximum.

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    	
    	int[] nums = new int[] {4,7,3,2,8,9};
    	
    	System.out.println("Before: " + Arrays.toString(nums));
    	selectionSort(nums);
    	System.out.println("After: " + Arrays.toString(nums));
    	
    }
    public static int[] selectionSort(int[] a) {
    	int i, j, minValue, minIndex, temp = 0;
    	for(i = 0; i < a.length; i++) {
    		minValue = a[i];
    		minIndex = i;
    		for(j = i; j < a.length; j++) {
    			if(a[j] < minValue) {
    				minValue = a[j];
    				minIndex = j;
    			}
    		}
    		if(minValue < a[i]) {
    			temp = a[i];
    	    	a[i] = a[minIndex];
    	    	a[minIndex] = temp;
    		}
    	}
    	return a;
    }
    
}