package com.xworkz.equalmethod;

public class Ladder {
	
	public String color;
	public int price;
	public String material;
	public boolean foldable;
	public int numberOfSteps;
	public int warranty;
	
	
	
	public Ladder()
	{
		System.out.println("Running in Ladder");
		
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		
		if(obj != null && obj instanceof  Ladder)
		{
			
			Ladder next=(Ladder)obj;
			if(this.color.equals(next.color)  && this.material.equals(next.material)&& this.numberOfSteps==next.numberOfSteps)
			{
				return true;
			}
			
			return false;
			
		}
		
		return false;
		
		
		
}		

	
	@Override
	public String toString() {
		
		return "Ladder-color: " +this.color+ " Price: " 
		+this.price+" Material: "+this.material+  " NumberOfSteps : "
				+this.numberOfSteps+ 
		" Warranty: "+warranty;
	}
			

}
