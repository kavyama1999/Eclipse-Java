package com.xworkz.passbookrunner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collectioclass.Temperature;

public class TemperatureRunner {

public static void main(String[] args)
{
	Collection<Double>   temp=  Temperature.temperature();
	System.out.println("Size:"+temp.size());
	
	
	
	System.out.println("Temperature are");
	for(Double tem:temp)
	{
		System.out.println(tem);
		
	}
	
	System.out.println("Temperature which is greater than 20");

	for(Double tem:temp)
	{
		//System.out.println(tem);
		if(tem>20)
		{
			System.out.println(tem);
		}
		
		
	}
	
	System.out.println("Temperature which is lessthan than 20");

	
	for(Double tem:temp)
	{
		//System.out.println(tem);
		if(tem<20)
		{
			System.out.println(tem);
		}
		
		
	}
	
	
System.out.println("Removing Temperature which is lessthan than 15");

	Iterator<Double> iterator=temp.iterator();
	int countremove=0;
	while(iterator.hasNext())
	{
		Double ref=iterator.next();
		if(ref<15)
		{
			iterator.remove();
			countremove++;
		}
		
	}
	System.out.println(temp);
	System.out.println("Totally remove elements:"+countremove);

	
	for(Double t:temp)
	{
		System.out.println(t);
	}
}}
//while (iterator.hasNext()) {
//	String msg = iterator.next();
//	if (msg.length() > 30) {
//		iterator.remove();
//		countwithremove++;
//	}