package com.xworkz.equalmethod;

public class Stand {
	
	public int price;
	public String loadCapacity;
	public String weight;
	public int warranty;
	public String color;
	
	
	
	public Stand()
	{
		System.out.println("Running in Stand");
		
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		
		if(obj != null && obj instanceof  Stand)
		{
			
			Stand next=(Stand)obj;
			if(this.color.equals(next.color) 
					&& this.weight.equals(next.weight)&&
					this.warranty==next.warranty)
			{
				return true;
			}
			
			return false;
			
		}
		
		return false;
		
		
		
}		

	
	@Override
	public String toString() {
		
		return "Stand-Price: " +this.price+ " "
				+ "LoadCapacity: " 
		+this.loadCapacity+" Weight: "+this.weight+ 
		" Warranty : "
				+this.warranty+ 
		" Color: "+color;
	}
			

}
	
	

