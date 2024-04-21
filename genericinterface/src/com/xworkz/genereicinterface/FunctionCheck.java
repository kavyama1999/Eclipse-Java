package com.xworkz.genereicinterface;

import java.util.function.Function;

public class FunctionCheck {

	
	private Function<Float, Integer> function;
	
	public FunctionCheck(Function<Float, Integer> fun)
	{
		this.function=fun;
	}
	
	public void fun()
	{
		System.out.println("fun method running in FunctionCheck");
		//Integer value=this.function.apply(2.3f);
		Integer value=function.apply(2.4f);
		System.out.println(value);
		if(value>5)
		{
			System.out.println("valid");
		}
		else
		{
		System.out.println("not valid");	
		}
		
	}
}
