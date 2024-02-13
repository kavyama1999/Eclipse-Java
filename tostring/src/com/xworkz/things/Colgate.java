package com.xworkz.things;

public class Colgate {
	
	public String flavour="Salt";
	public int price=50;
	public boolean sensitive=true;
	
	public void whitening()
	{
		System.out.println("Whitening Running in Colgate");
		
		String rf=super.toString();
	System.out.println(rf);	
	System.out.println(rf.hashCode());
	}
	
	
	
@Override
	public String toString(){
	
	return "Colgate{"+"Flavour="+flavour+",Price="+price+",Sensitive="+sensitive+"}";
		
	}

}
