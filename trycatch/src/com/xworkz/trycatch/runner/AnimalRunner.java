package com.xworkz.trycatch.runner;

import com.xworkz.trycatch.Animal;
import com.xworkz.trycatch.AnimalException;
import com.xworkz.trycatch.NameException;

public class AnimalRunner {
	public static void main(String[] args) throws AnimalException, NameException {
		
		Animal animal=new Animal();
		
		//animal.playing(45);
		System.out.println("hi");
		
		try {
			
			System.out.println("before");
			animal.playing(20);
			System.out.println("hdhjhj");
			
			animal.run("yuvaraj");
			System.out.println("welcome");
		}
		
//		catch(AnimalException a)//
//		{
//		System.out.println(a.getMessage());	
//		System.out.println(a.getClass());
//		}
//		
//		catch( NameException b)
//		{
//			System.out.println(b.getMessage());
//			//System.out.println("next");
//		}
//		
		
		catch(AnimalException | NameException  b)
		{
			System.out.println(b.getMessage());
			System.out.println(b.getClass());
		}
	}

}
