package com.xworkz.encapsulation;

public class Cock {

	private String color;
	private int price;
	private String material;
	private String weight;
	private String idealFor;
	
	
	public Cock()
	{
		System.out.println("No parameter in Cock");
	}
	
	@Override
	public String toString() {
		return "Cock-Color :"+this.color+ ",Price :"+this.price+",Material :"+this.material+",Weight:"+this.weight+","
				+ "IdealFor :"+this.idealFor;
	}
	
	


@Override
public boolean equals(Object obj) 
{
	
	if(obj!=null && obj instanceof Cock)

		
		System.out.println("equals in:"+this);
	System.out.println("equals in :"+obj);
	
		{
		Cock ck=(Cock)obj;
		if(this.price==ck.price && this.color.equals(ck.color))
		{
			return true;
		}
		
			
		return false;
		}
	//return false;
}	
	
	
	
	
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return this.color;
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
    
    public void setWeight(String weight)
    {
    	this.weight=weight;
    }
	public String getWeight()
	{
		return this.weight;
	}
	
	
	public void setIdealFor(String idealFor)
	{
		this.idealFor=idealFor;
	}
	public String getIdealFor()
	{
		return this.idealFor;
	}
	
	
	
	
}
