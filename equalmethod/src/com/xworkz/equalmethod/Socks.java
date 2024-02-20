package com.xworkz.equalmethod;

public class Socks {
	


		public String type;
		public String color;
		public String brand;
		public int price;
		public char size;
		public String style;
		
		public Socks() {
			System.out.println("no param for socks");
			
		}
		
		@Override
		   public String toString() {
		   	
		   	return "Sock:type:"+this.type+"\t"+"color:"+this.color+"\t"+"brand:"+this.brand+"\t"+"price:"+this.price+"\t"+"size:"+this.size+"\t"+"style:"+this.style;
		       
		       
		   }
		 
		@Override
		 public boolean equals(Object obj)
		   {
			
			System.out.println("equals in:"+this);
			System.out.println("equals in:"+obj);
//		   	System.out.println("running in socks class");
//		   	System.out.println(" " +this);
		   	
		   	if(obj!=null && obj instanceof Socks)
		   	{
		   		Socks socks=(Socks)obj;
		   		System.out.println("Comparing:"+socks);
		   		if(this.size == socks.size && this.price == socks.price && this.color.equals(color) && this.brand.equals(brand) )
		   		{
		   			
		   			return true;
		   		}
		   		
		   	}
		   	return false;
		}
	}


