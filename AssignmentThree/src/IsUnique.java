//James Shively III
//ITC155 - Data Structures
//Stani Meredith
//Assignment 3 - IsUnique.java

import java.util.*;

public class IsUnique {

	public static void main(String[] args) {
		
		
	}

	public boolean isUnique(Map<String, String> map){
		//create the Set
		Set<String> set = new HashSet<String>();
		for(String key : map.keySet()) {
			String value = map.get(key);
			
			if(set.contains(value)) {
				return false;
			}
			set.add(value);
		}
		
		
		return true;
	}

}
