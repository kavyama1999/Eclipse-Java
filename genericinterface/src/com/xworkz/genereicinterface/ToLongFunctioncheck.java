package com.xworkz.genereicinterface;

import java.util.function.ToLongFunction;

public class ToLongFunctioncheck {
	private ToLongFunction<Double> tolongfunction;

	public ToLongFunctioncheck(ToLongFunction<Double> tolongfunction) {
		this.tolongfunction = tolongfunction;
	}

	public void to() {
		System.out.println("running in ToLongFunctioncheck");
		Long val = tolongfunction.applyAsLong(56.7d);
		System.out.println(val);
		if(val>200)
		{
			System.out.println("valid");
		}
		else 
		{
			System.out.println("invalid");
		}
	}

}