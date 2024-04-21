package com.xworkz.genereicinterface;

import java.util.function.BiFunction;

public class BiFunctionCheck {
	
	private BiFunction<Integer, Integer, Boolean> bio;
	
	public BiFunctionCheck(BiFunction <Integer, Integer, Boolean> bifuntion)
	{
		this.bio=bifuntion;
	}
	
	

	public void function()
	{
		System.out.println("function method running in BiFunctionCheck ");
		boolean value=this.bio.apply(40, 60);
		 System.out.println(value);	
		 if(value)
		 {
			 System.out.println("corect");
		 }
		 else
		 {
			 System.out.println("wrong");
		 }
	}
}
