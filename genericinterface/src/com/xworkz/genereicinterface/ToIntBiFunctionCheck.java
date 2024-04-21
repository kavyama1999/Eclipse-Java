package com.xworkz.genereicinterface;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionCheck {
	private ToIntBiFunction<Integer, String> tointfunction;
	
	public ToIntBiFunctionCheck(ToIntBiFunction<Integer, String> function)
	{
		this.tointfunction=function;
	}

	public void to()
	{
		System.out.println("running in ToIntBiFunctionCheck");
//		tointfunction.applyAsInt(244, "Shivamogga");
		Integer val=tointfunction.applyAsInt(244, "Shivamogga");
		System.out.println(val);
		if(val>10)
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("wrong");
		}
		
		

	}
}
