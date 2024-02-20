package com.xworkz.encapsulation;

public class Box {
	
private	String brandName;
private	String type;
private String color;
private String boxWidth;
private int price;
	
	public Box()
	{
		System.out.println("---Box-----");
	}
	

	@Override
	public String toString() {
		
		return "Box-Brand Name : " +this.brandName+ " ,Type :  "+this.type+ ", Color : " +this.color+ " ,"
				+ " ,Box-Width: " +this.boxWidth + " ,Price : " +this.price;
		
		
			}
	
	
	
	
	
	
	public String getBrandName()//read access
	{
		return this.brandName;
	}

	public String getType()
	{
		return this.type;
	}
	
	
	public void setBrandName(String brandName)//write
	{
		this.brandName=brandName;
	}
	
	public void setType(String type)
	{
	this.type=type;	
	}
	
	//read access
	
	public String getColor()
	{
		return this.color;
	}

	//write access
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public String getBoxWidth()
	{
		return this.boxWidth;
	}
	
	public void setBoxWidth(String boxWidth)
	{
		this.boxWidth=boxWidth;
	}
	
	public int getPrice()
	{
		return this.price;
		
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	@Override
	public boolean equals(Object obj) {
		

		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		if(obj!=null && obj instanceof Box)
		{
			
			
			Box box=(Box)obj;
			if(this.brandName.equals(box.brandName))
			//if(this.price==box.price)
			{
				return true;
			}
			
			return false;
			
		}
				return false;
	
	
	
	}
	
	
//	@Override
//	public String toString() {
//		
//		return "Box-Brand Name : " +this.brandName+ " ,Type :  "+this.type+ ", Color : " +this.color+ " ,"
//				+ " ,Box-Width: " +this.boxWidth + " ,Price : " +this.price;
//		
//			}
	
	
}

