package com.xworkz.chocolate.runner;

import com.xworkz.chocolate.Cadbury;
import com.xworkz.chocolate.Chocolate;
import com.xworkz.chocolate.DairyMilkChocolate;
import com.xworkz.chocolate.DarkChocolate;
import com.xworkz.chocolate.Munch;
import com.xworkz.chocolate.SilkChocolate;

public class Runner {

	public static void main(String[] args) {
		
		Munch munch=new Munch();
		
		Chocolate choco=new Chocolate();
		
		munch.cryspy(choco);
		
		System.out.println(choco.brandName);
		choco.eat();
		
		
		System.out.println("-----Cadbury-----");
		
		Cadbury cadbury=new Cadbury();
		munch.cryspy(cadbury);
		
//	System.out.println(cadbury.price);
//		cadbury.melting();
		
		System.out.println(cadbury.brandName);
		
		System.out.println("-----DairyMilk-----");
		
		
		DairyMilkChocolate dmc=new DairyMilkChocolate();
		
		munch.cryspy(dmc);
		
		System.out.println("-----Darkcholate-----");
		
		DarkChocolate dc=new DarkChocolate();
		munch.cryspy(dc);
		
		System.out.println("-----SilkChocolate-----");
		
		SilkChocolate silk=new SilkChocolate();
		munch.cryspy(silk);
		

		
		
	}

}
