package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Colors {

	public static void main(String[] args) {

		Collection<String> color = new ArrayList<String>();
		// implicit
		color.add("Orange");
		color.add("Red");
		color.add("Pink");
		color.add("Green");
		color.add("Yellow");
		color.add("Brown");
		color.add("Black");
		color.add("White");
		color.add("Purple");
		color.add("Blue");

		String color1 = "Blue";// explicit
		System.out.println(color1);

		// return size of the colors
		System.out.println("No_of_colors:" + color.size());// implicit

		int si = color.size();// explicit
		System.out.println("No-of_colors:" + si);
//		
		

		// for accesing all colors
		for (String colors : color) 
		{
			System.out.println(colors);
		}
		
		Collection<String> presidentCollection=new LinkedList<String>();
		presidentCollection.add("Droupadi Murmu");
		presidentCollection.add("Dr Sarvepalli Radhakrishnan");
		presidentCollection.add("Dr Zakir Hussain");
		presidentCollection.add("Varahagiri Venkata Giri");
		presidentCollection.add("Pranab Mukherjee");
		presidentCollection.add("Prathibha Patil");

		System.out.println("President Names:" + presidentCollection);// array[]
		System.out.println("No_of_president:" + presidentCollection.size());// retursn no_of_president
		System.out.println("****President Names****");
		for (String names : presidentCollection) {
			System.out.println(names);
		}
		
		Collection<String> addressCollection=new LinkedList<String>();
		addressCollection.add("Shivamogga");
		addressCollection.add("Bengaluru");
		addressCollection.add("Karwar");
		addressCollection.add("Kerala");
		addressCollection.add("Dharawad");
		addressCollection.add("Vijayanagr");
		System.out.println("*************Address**********");
		System.out.println("no_of_Address:" + addressCollection.size());
		for (String president : addressCollection) {
			System.out.println(president);
			
		}
	}

}
