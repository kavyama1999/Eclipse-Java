package com.xworkz.encapsulation;

public class Basket {
	
	private String material;
	private int price;
	private String color;
	private String brandName;
	private String shape;
	
	
	public Basket()
	{
		System.out.println("NO param Basket");;
	}
	
	@Override
	public String toString() {
		return "Basket-Material :" +this.material+ ", Price : "+this.price+ ",Color :" +this.color+
				", Brand Name : "+this.brandName+ ",Shape :"+this.shape;
	}
	

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		if(obj!=null && obj instanceof Basket)
		{
			Basket bs=(Basket)obj;
			if(this.material.equals(bs.material) && this.price==bs.price)
			{
				return true;
			}
			
			return false;
		}
		return false;
	}
	
	
	public  void setMaterial(String material)
	{
		this.material=material;
	}
	public String getMaterial()
	{
		return this.material;
	}
	
	
	public void  setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return this.price;
		
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
   return this.color;
    }
	
	public void setBrandName(String brandName)
	{
		this.brandName=brandName;
	}
	public String getBrandName()
	{
		return this.brandName;
	}
	
	public void setShape(String shape)
	{
		this.shape=shape;
	}
	public String getShape()
	{
		return this.shape;
	}
	
	
	
	
	
	
}
