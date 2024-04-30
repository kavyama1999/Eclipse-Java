package com.xworkz.collectioclass.stream;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FanRunner {
	
	public static void main(String[] args) {
		Collection<String> fanCollection =new ArrayList<String>();
		fanCollection.add("Usha");
		fanCollection.add("Usha");
		fanCollection.add("KAvya");
		fanCollection.add("Smith");
		fanCollection.add(null);
		
		//Stream<String> streamCollection=fanCollection.stream();
		fanCollection
		.stream()
		.filter(ref-> ref!=null && ref.startsWith("U") && ref.endsWith("a"))
	.collect(Collectors.toList())
		.forEach(y->System.out.println(y));
		
		// Create a new collection to add elements
//				Collection<String> newFanCollection = new ArrayList<>(fanCollection);
//			newFanCollection.add("Yuvaraj"); // Adding a new element
		
		
//		for(String name:fanCollection)
//		{
//		fanCollection.add("ndjhjh");
//			System.out.println(name);
//		}
 
	}

}

//.filter(ref -> ref.startsWith("U") && ref.endsWith("a")) // Filter elements starting with "U" and ending with "a"
