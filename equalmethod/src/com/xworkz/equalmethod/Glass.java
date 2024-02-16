package com.xworkz.equalmethod;

public class Glass {
	
	public int price;
	public String color;
	public char size;
	public String type;
	public String material;
	public String capacity;
	
	
	
	
	public Glass()
	{
		System.out.println("Running in Glass");
		
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		
		if(obj != null && obj instanceof  Glass)
		{
			
			Glass next=(Glass)obj;
			if(this.price==next.price  && this.type.equals(next.type)  && this.material.equals(next.material))
			{
				return true;
			}
			
			return false;
			
		}
		
		return false;
		
		
		
}		

	
	@Override
	public String toString() {
		
		return "Glass-Price: " +this.price+ " Color: " 
		+this.color+" Size: "+this.size+  " Type : " +this.type+ " Materialt: "+material+ " Capacity: " +capacity;
	}
			
			
}



