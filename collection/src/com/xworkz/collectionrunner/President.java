package com.xworkz.collectionrunner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class President {

	public static void main(String[] args) {

		Collection<String> president = new LinkedList<String>();
		president.add("Droupadi Murmu");
		president.add("Dr Sarvepalli Radhakrishnan");
		president.add("Dr Zakir Hussain");
		president.add("Varahagiri Venkata Giri");
		president.add("Pranab Mukherjee");
		president.add("Prathibha Patil");

		//kavyaMain("Some argument");
		System.out.println("President Names:" + president);// array[]
		System.out.println("No_of_president:" + president.size());// retursn no_of_president
		System.out.println("****President Names****");
		for (String names : president) {
			System.out.println(names);
			//kavyaMain("Some argument");
		}
		System.out.println("******Address******");
		kavyaMain("Some argument");

	}

	public static void kavyaMain(String s) {

		Collection<String> addresscollection = new LinkedList<String>();
		addresscollection.add("Shivamogga");
		addresscollection.add("Bengaluru");
		addresscollection.add("Karwar");
		addresscollection.add("Kerala");
		addresscollection.add("Dharawad");
		addresscollection.add("Vijayanagr");
		System.out.println("no_of_Address:" + addresscollection.size());
		for (String president : addresscollection) {
			System.out.println(president);
			
		}

		int val=12;
//		System.out.println(val);
//		Integer f=new Integer(20);
//		System.out.println(f);
	}
}
