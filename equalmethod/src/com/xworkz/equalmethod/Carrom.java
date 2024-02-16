package com.xworkz.equalmethod;

public class Carrom {
	
	public int price;
	public String material;
	public String size;
	public String frameMaterial;
	public boolean waterResistant;
	public String capacity;

	
	
	
	public Carrom()
	{
		System.out.println("Running in Carrom");
		
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		
		if(obj != null && obj instanceof  Carrom)
		{
			
			Carrom next=(Carrom)obj;
			if(this.material.equals(next.material)  && this.size.equals
					(next.size)  && this.capacity.equals(next.capacity))
			{
				return true;
			}
			
			return false;
			
		}
		
		return false;
		
		
		
}		

	
	@Override
	public String toString() {
		
		return "Carrom-Price: " +this.price+ "Material: " +this.material+ "Size: "
		+this.size+  "Frame Material: " +this.frameMaterial+ "Water Resistant: "
				+waterResistant+ "Capacity: " +capacity;
	}
			
			
}




