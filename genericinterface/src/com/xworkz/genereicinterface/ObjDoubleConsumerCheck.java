package com.xworkz.genereicinterface;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerCheck {

	private ObjDoubleConsumer<String> objdouble;
	
	public ObjDoubleConsumerCheck(ObjDoubleConsumer<String> objconsumer)
	{
		this.objdouble=objconsumer;
	}
	
	public void objConsumer()
	{
		System.out.println("objConsumer method running in ObjDoubleConsumerCheck ");
	objdouble.accept("Sathwik", 40.3d);
	
	}
	
}
