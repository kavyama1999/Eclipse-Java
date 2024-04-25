package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;

public class Book {

	public static void main(String[] args) {
Collection<Long>collect =new ArrayList<Long>();
collect.add(45555555l);
collect.add(154785l);


System.out.println("size:"+collect.size());

for(Long lg:collect)
{
	System.out.println("number:"+lg);
	if(lg.startsWith("4"))
	{
		
	}
}

for(Long gh:collect)
{
	System.out.println();
	if(gh>3)
	{
	System.out.println();	
	}
}
	
	
	}

}
//The error you're encountering is because Long does not have a length() method. Long is a wrapper class for the primitive type long, and it does not have methods to directly access the length of the number it represents.
//
//If you want to check the length of the numeric value represented by a Long object, you need to convert it to a String first and then check the length of the string representation. Here's how you can do it:
//
//java
//Copy code
//for (Long gh : collect) {
//    String strGh = String.valueOf(gh); // Convert Long to String
//    if (strGh.length() > 3) {
//        // Your logic here for Long values with a length greater than 3
//        System.out.println(strGh + " has a length greater than 3");
//    }
//}