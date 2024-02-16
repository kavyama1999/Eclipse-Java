package com.xworkz.equalmethod;

public class Belt {

		
		public int length;
		public String type;
		public String material;
		public int price;
		public String color;
		public boolean quality;
		
		
	public Belt()
	{
		System.out.println("Running in Belt");
		
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals in:"+this);
		System.out.println("equals in:"+obj);
		
		
		if(obj != null && obj instanceof  Belt)
		{
			
			Belt next=(Belt)obj;
			if(this.length==next.length  && this.price==next.price  && this.material.equals(next.material))
			{
				return true;
			}
			
			return false;
			
		}
		
		return false;
		
		
		
}		

	
	@Override
	public String toString() {
		
		return "Belt-Length: " +this.length+
				"type:  "+this.type+ " materail:  " +this.material+" Price: " +this.price+ " Color:  "
				+this.color+  " Quality: " +quality;
					
	}
			
			
}


