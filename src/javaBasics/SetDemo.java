package javaBasics;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		 
		if(set1.isEmpty())
		{
			System.out.println("the set is empty at start");
		}
		
		set1.add("cat");
		set1.add("dog");
		set1.add("mouse");
		set1.add("ant");
		set1.add("bear");

		if(set1.isEmpty())
		{
			System.out.println("the set is empty after adding elements");
		}
		// set does not contains duplicate value so etheir adding up the duplicate it
		// wont be concedered.

		set1.add("dog");

		System.out.println(set1);

		//// iteration //////

		for (String element : set1) {
			System.out.println(element);
		}

		if(set1.contains("cat"))
		{
			System.out.println("it's contains cat");
		}
		
		if(set1.contains("camale"))
		{
			System.out.println("it's contains camale");
		}
		
		
		Set<String> set2 = new HashSet<String>();

		set1.add("cat");
		set1.add("dog");
		set1.add("girrafe");
		set1.add("Tiger");
		
		//////// intersection///////
//		
//		Set<String> intersection = new HashSet<String>(set1);
//		
//		intersection.retainAll(set2);
//		
//		System.out.println(intersection);

		////////Difference ///////////
		
		Set<String> differences = new HashSet<String>(set1);
		
		differences.removeAll(set2);
		
		System.out.println(differences);
		
	}

}
