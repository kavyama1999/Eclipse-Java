package com.xworkz.genereicinterface;

import java.util.function.Predicate;

public class PredicateCheck {
	
	private Predicate<Integer> predicate;
	
	public PredicateCheck(Predicate<Integer>predicate )
	{
		this.predicate=predicate;
	}
	
	public void pre()
	{
		System.out.println("pre method running in PredicateCheck");
		boolean val=this.predicate.test(456);
		System.out.println(val);
		if(val)
		{
			System.out.println("crt");
		}
		else
		{
			System.out.println("wrong");
		}
	}

}
