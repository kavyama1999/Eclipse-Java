package com.xworkz.things;

import com.xworkz.things.runner.toString;

public class Ring {
	
	public String color="Gold";
	
	public int price=50;
	
	public String weight="1 Gram";
	
	
	public boolean design()
	{
		System.out.println("design runing...");
		super.toString();
		//this.toString();
		return false;
		
	}
	
	

	
	@Override
	public String toString() {
		System.out.println("tostring running...");
		return "Ring-color:"+color+",price:"+price+",weigth:"+weight;
		
	
	}         
	

}
