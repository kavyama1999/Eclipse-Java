package com.xworkz.equalmethod;

public class Lace {
	
	
	
	
		
		public String brand;
		public String color;
		public String material;
		public int length;
		public int price;
		public int meter;
		
		public Lace()
		{
			System.out.println("no param for Lace");
		}
		
		 @Override
		   public String toString() {
		   	
		   	return "Lace:brand:"+this.brand+"\t"+"color:"+this.color+"\t"+"material:"+this.material+"\t"+"length:"+this.length+"\t"+"price:"+this.price+"\t"+"meter:"+this.meter;
		       
		       
		   }
		 
		 @Override
		 public boolean equals(Object obj)
		   {
		   	System.out.println("running in lace class");
		   	System.out.println(" " +this);
		   	
		   	if(obj!=null && obj instanceof Lace)
		   	{
		   		Lace lace=(Lace)obj;
		   		System.out.println("Comparing:"+lace);
		   		if(this.length == lace.length && this.meter == lace.meter && this.color.equals(color) && this.brand.equals(brand) )
		   		{
		   			
		   			return true;
		   		}
		   		
		   	}
		   	return false;
		}

	}

