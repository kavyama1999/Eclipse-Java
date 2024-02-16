package com.xworkz.equalmethod;

public class Fan {
	
	public int price;
	public String brandName;
	public int numberOfBlades;
	public String color;
	public String suitableFor;
	public boolean remoteControl;
	
	
	

	public Fan()
	{
		System.out.println("Running in Fan");
		
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		
		if(obj != null && obj instanceof  Fan)
		{
			
			Fan next=(Fan)obj;
			if(this.brandName.equals(next.brandName)  && this.price==
			next.price  && this.numberOfBlades==next.numberOfBlades)
			{
				return true;
			}
			
			return false;
			
		}
		
		return false;
		
		
		
}		

	
	@Override
	public String toString() {
		
		return "Fan-Price: " +this.price+ " Brand Name: " 
		+this.brandName+" Number Of Blades: "+this.numberOfBlades+  
		" Color: "
				+this.color+ 
		" Suitable For: "+suitableFor+ " Remote Control: "+remoteControl;
	}
			


	
	
}
