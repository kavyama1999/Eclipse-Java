package com.xworkz.genereicinterface;

import java.util.function.LongFunction;

public class LongFunctionCheck {

	private LongFunction<String> longfunction;

	public LongFunctionCheck(LongFunction<String> fun) {
		this.longfunction = fun;
	}

	public void check() {
		System.out.println("check method running in LongFunctionCheck ");
		//longfunction.apply(234578l);
		String val = this.longfunction.apply(56456l);
		System.out.println(val);
		

	}

}
