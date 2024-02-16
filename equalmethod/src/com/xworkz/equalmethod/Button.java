package com.xworkz.equalmethod;

public class Button {
	
		public String shape;
		public String material;
		public String type;
		public int size;
		public int noOfPiece;
		public String color;
		
		public Button()
		{
			System.out.println("no param for button");
		}
		
		 @Override
		    public String toString() {
		    	
		    	return "Button:shape:"+this.shape+"\t"+"material:"+this.material+"\t"+"type:"+this.type+"\t"+"size:"+this.size+"\t"+"noOfPiece:"+this.noOfPiece+"\t"+"color:"+this.color;
		        
		        
		    }
		 
		 public boolean equals(Object obj)
		    {
		    	System.out.println("running in button class");
		    	System.out.println(" " +this);
		    	
		    	if(obj!=null && obj instanceof Button)
		    	{
		    		Button button=(Button)obj;
		    		System.out.println("Comparing:"+button);
		    		if(this.size == button.size && this.noOfPiece==button.noOfPiece&& this.color.equals(color) && this.type.equals(type) )
		    		{
		    			
		    			return true;
		    		}
		    		
		    	}
		    	return false;
		
	}
	

}
