package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.Kavya;

public class KRunner {
	public static void main(String[] args) {
		
		
		
		Kavya ky=new Kavya();
		
		ky.setColor("White");
		System.out.println(ky.getColor());
		ky.setName("kavya");
		System.out.println(ky.getName());
		
		System.out.println(ky);
		//System.out.println(ky.toString());
		System.out.println(ky.hashCode());
		
		Kavya ky1=new Kavya();
		
		ky1.setColor("Red");
		System.out.println("Color :"+ky1.getColor());
		
		ky1.setName("Smithan");
		System.out.println("Name:"+ky1.getName());
		
		//System.out.println(ky1);
		System.out.println(ky1.toString());
		System.out.println(ky1.hashCode());
	}

}
