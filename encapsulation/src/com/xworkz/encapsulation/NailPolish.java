package com.xworkz.encapsulation;

public class NailPolish {
	
	private String brandName;
	private int price;
	private String quantity;
	private String color;
	private String finish;
	
	
	
	
	public NailPolish()
	{
		System.out.println("-----NailPolish----");
	}
	
	
	@Override
	public String toString() {

return "NailPolish : "+this.brandName+ ", Price : "+this.price+ " , Quantity: " +this.quantity+ " ,Color : " +this.color+ ","
		+ " Finish : "+this.finish;
		
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		if(obj!=null && obj instanceof NailPolish)
		{
			NailPolish nail=(NailPolish)obj;
			if(this.price==nail.price  && this.color.equals(nail.color) || this.quantity.equals(nail.quantity) )
			{
				return true;
			}
			
			return false;
		}
		
		return false;
	}
	
	
	
	
	public  String getBrandName()//read
	{
		return this.brandName;
		
	}
	
	public void setBrandName(String brandName)
	{
		this.brandName=brandName;
	}
	
	
	
	public int getPrice()
	{
		return this.price;
	}
	
	
    public void setPrice(int price)
  {
	this.price=price;
   }
    
    
	 
public String getQuantity()
{
	return this.quantity;
}

public void setQunatity(String quantity)
{
	this.quantity=quantity;
}

public String getColor()
{
	return this.color;
}
public void setColor(String color)
{
this.color=color;	
}


public String getFinish()
{
	return this.finish;
}

public void setFinsih(String finish)
{
	this.finish=finish;
}



}




