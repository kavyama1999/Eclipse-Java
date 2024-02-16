package com.xworkz.equalmethod;

public class Mug {
	
	public String madeOf;
	public String type;
	public int price;
	public String capacity;
	public boolean withHandle;
	public String occasion;
	
	public Mug()
	{
		System.out.println("Running in Mug");
		
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		
		if(obj != null && obj instanceof  Mug)
		{
			
			Mug next=(Mug)obj;/// || or operator
			if(this.madeOf.equals(next.madeOf)  ||
					this.price==next.price || this.occasion.equals(next.occasion))
			{
				return true;
			}
			
			return false;
			
		}
		
		return false;
		
		
		
}		

	
	@Override
	public String toString() {
		
		return "Mug-MadeOf: " +this.madeOf+ " type: " 
		+this.type+" Price: "+this.price+  " Capacity : "
				+this.capacity+ 
		" With Handle: "+withHandle+ "Occasion: " +occasion;
	}
			
	

}
