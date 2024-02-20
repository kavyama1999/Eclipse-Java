package com.xworkz.encapsulation;

public class Pot {
	
	private String color;
	private String shape;
	private int price;
	private String material;
	private String height;
	
	
	
	public Pot()
	{
		System.out.println("No param in Pot");
	}
	
	
	@Override
	public String toString() {
		return "Pot-Color :" +this.color+ ",Shape:"+this.shape+ ",Price :"+this.price+ ",Material :" +this.material+ ",Height: "
	+this.height;
	
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		
		System.out.println("equals in :"+this);
		System.out.println("equals in :"+obj);
		
		if(obj!=null && obj instanceof Pot)
		{
			
			Pot pot=(Pot)obj;
			if(this.price==pot.price  && this.material.equals(pot.material))
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		}
		return false;	
		
	
	}
	
	
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		
		return this.color;
	}
	
	public void setShape(String shape)
	{
		this.shape=shape;
	}
	public String getShape()
	{
		return this.shape;
	}
	
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return this.price;
	}
	public void setMaterial(String material)
	{
		this.material=material;
	}
	public String getMaterial()
	{
		return this.material;
	}
	public void  setHeight(String height)
	{
		this.height=height;
	}
	public String getHeight()
	{
		return this.height;
	}
	
	
	
	

}
