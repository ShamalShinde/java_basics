package javaBasics;

import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo
{
	
	public static void main(String[] args) 
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		
		testMap(treemap);
		
	}	
	
	public static void testMap(Map<Integer,String> map)
	{
		
		map.put(4,"Four");
		map.put(2,"Two");
		map.put(6,"Six");
		map.put(5,"Five");
		map.put(8,"Eight");
		map.put(1,"One");
		
		String text = map.get(6);
		System.out.println(text);
		
		for(Entry<Integer, String> entry : map.entrySet())
		{
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key+":"+ value);
		}
		
	}

}
