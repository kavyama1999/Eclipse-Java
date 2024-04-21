package com.xworkz.genereicinterface;

import java.util.function.IntSupplier;

public class IntSupplierChek {
	
	private IntSupplier intsupplier;
	
	public IntSupplierChek(IntSupplier supplier)
	{
		this.intsupplier=supplier;
	}
	
	
	public void supplier()
	{
		System.out.println("supplier method running in IntSupplierChek");
		//intsupplier.getAsInt();
		Integer val=this.intsupplier.getAsInt();
		System.out.println(val);
	}

}
