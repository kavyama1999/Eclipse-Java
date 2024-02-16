package com.xworkz.equalmethod;

public class Shoe {
	
	public String color;
	public int price;
	public String idealFor;
	public String occasion;
	public String tipShape;
	public String brandName;
	
	
	
	public Shoe()
	{
		System.out.println("Running in Shoe");
		
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		
		if(obj != null && obj instanceof  Shoe)
		{
			
			Shoe next=(Shoe)obj;/// || or operator
			if(this.color.equals(next.color) && this.idealFor.equals(next.idealFor) && this.tipShape.equals(next.tipShape))
			{
				return true;
			}
			
			return false;
			
		}
		
		return false;
		
		
		
}		

	
	@Override
	public String toString() {
		
		return "Shoe-Color: " +this.color+ " Price: " 
		+this.price+" Ideal For: "+this.idealFor+  " Occasion: "
				+this.occasion+ 
		" Tip Shape: "+tipShape+ "Brand Name: " +brandName;
	}
			
	

	

}
