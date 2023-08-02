package javaBasics;

import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		List<Integer> list = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(10);
		numbers.add(40);

		System.out.println(numbers.get(0));

		System.out.println("Iteration #1");

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		System.out.println("Iteration #2");
		for (Integer value : numbers) {
			System.out.println(value);
		}
		// removing items form array

		numbers.remove(0);

		numbers.remove(numbers.size() - 1);

		System.out.println("Iteration #3 after removing element");
		for (Integer value : numbers) {
			System.out.println(value);
			
			doTiming("Array List",numbers);
			doTiming("Linked List",list);
			
		}

		// checking fot time taken for adding item at the beginning and the end of
		// arrayList and LinkedList
	}
		private static void doTiming(String type ,List<Integer> list )
		{
			for(int i=0;i<1E5;i++)
			{
				list.add(i);
			}
			
			long Start = System.currentTimeMillis();
			
			
			//adding items at the end of the list 
			
			for(int i=0;i<1E5;i++)
			{
				list.add(i);
			}
			
			//adding element elsewhere in the list
			
			for(int i=0;i<1E5;i++)
			{
				list.add(0,i);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println("time taken"+(end - Start)+"ms for" + type);
			
		}

	

}
