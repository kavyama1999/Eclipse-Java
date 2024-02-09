package com.xworkz.casting.runner;

import com.xworkz.casting.Bus;
import com.xworkz.casting.HandWash;
import com.xworkz.casting.Lux;
import com.xworkz.casting.Sanitizer;
import com.xworkz.casting.Soap;

public class Runner {

	public static void main(String[] args) {
		
		Bus bus=new Bus();
//		Sanitizer sanitizer=new Sanitizer();
//		//sanitizer.quantity=10;
//		//System.out.println(sanitizer.quantity);
//
//		//sanitizer.aroma="Jasmine";
//		//System.out.println(sanitizer.quantity);
//		bus.move(sanitizer);
//		
//		System.out.println("****Soap***");
//		 
//		Soap soap=new Soap();
//		//soap.brand="dove";
//		//System.out.println(soap.brand);
//		//soap.foam();
//		bus.move(soap);
		
		Lux lux=new Lux();
		bus.move(lux);
		
	}

}
