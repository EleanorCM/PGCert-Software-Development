package sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo implements Comparable<T> {

	public SetsDemo() {
	}
	
	public static void main(String[] args) {
		String[] colours = new String[] {"red", "blue", "red", "green", "red", "green", "yellow"};
		List<String> theList = new LinkedList<String>(Arrays.asList(colours));
		
		System.out.println(theList);
		
		printNonDupe(theList);
	}

	private static void printNonDupe(List<String> input) {
		Set<String> mySet = new HashSet<String>(input);
		System.out.println(mySet);
		
	}
	

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
