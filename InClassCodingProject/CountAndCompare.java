//James Shively & Dan Micheli
//ITC155 - Data Structures (Java II)
//Stani Meredith
//In Class Coding Assignment

import java.io.*;
import java.util.*;

public class CountAndCompare {
	
		//create constant
		//private static final int OCCURRENCES = 2000;

		public static void main(String[] args) throws FileNotFoundException {
			
			//program greeting
			System.out.println("This program compares the vocabulary of two ");
			System.out.println("text files, reporting the number of words ");
			System.out.println("in common and the percent of overlap.");
			
			Scanner in1 = new Scanner(new File("hamlet.txt"));
			Scanner in2 = new Scanner(new File("romeo_and_juliet.txt"));
			
			Set<String> f1 = new TreeSet<String>();
			Set<String> f2 = new TreeSet<String>();
			
			while(in1.hasNext()) {
				String word = in1.next();
				word = word.toLowerCase();
				f1.add(word);
			}
			System.out.println("File 1 contains " + f1.size() + " words.");
			
			while(in2.hasNext()) {
				String word = in2.next();
				word = word.toLowerCase();
				f2.add(word);
			}
			System.out.println("File 2 contains " + f2.size() + " words.");
			
			double ham = f1.size();
			double raj = f2.size();
			
			Set<String> comparedSets = compareSets(f1,f2);
			
			double overlap1 = ((double)comparedSets.size() / ham) * 100; 
			double overlap2 = ((double)comparedSets.size() / raj) * 100;
			System.out.println("% of file 1 overlap: " + overlap1);
			System.out.println("% of file 2 overlap: " + overlap2);
		
			in1.close();
			in2.close();

		}

		
		private static Set<String> compareSets(Set<String> f1, Set<String> f2) {
			Set<String> comparedSets = new TreeSet<String>();
			
			f2.retainAll(f1);
			System.out.println("The common words are: " + f2.size());
			comparedSets.addAll(f2);
			
			return comparedSets;
		}
}


