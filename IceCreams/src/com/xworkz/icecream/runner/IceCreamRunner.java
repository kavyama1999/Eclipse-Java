package com.xworkz.icecream.runner;

import com.xworkz.icecream.ArunIce;
import com.xworkz.icecream.Cream;
import com.xworkz.icecream.Hangyo;
import com.xworkz.icecream.IceCream;
import com.xworkz.icecream.KwalityWalls;

public class IceCreamRunner {

	public static void main(String[] args) {

		Cream cream=new Cream();
		Object obj=new Object();
		cream.creamRunner(obj);
		
		IceCream ice=new IceCream();
		cream.creamRunner(ice);
		
		System.out.println(ice.state);
		ice.melting();


		
		System.out.println("**********");
		
//
//		System.out.println(cream.material);
//		door.security();
		
		System.out.println("**********");
		
		
		KwalityWalls kwalitywalls=new KwalityWalls();
		cream.creamRunner(kwalitywalls);
		
		Hangyo hangyo=new Hangyo();
		
		cream.creamRunner(hangyo);
		
//		System.out.println(hangyo.packaging);
//		hangyo.cool();
		
		System.out.println("**********");

		
		ArunIce arunice=new ArunIce();
		
		cream.creamRunner(arunice);
		
		

		
		
		
		
				
		
	}

}
