package com.xworkz.chocolate;

public class Munch {

	
	public void  cryspy(Chocolate chocolate)
	{
		System.out.println("Running in Munch");
	
	
	
	if(chocolate instanceof Cadbury)
	{
		Cadbury cd=(Cadbury)chocolate;
		System.out.println(cd.price);
		cd.melting();
		
	}
	
	if(chocolate instanceof DairyMilkChocolate)
	{
		DairyMilkChocolate dr=(DairyMilkChocolate)chocolate;
		System.out.println(dr.weight);
		dr.tasting();
	}
	
	if( chocolate instanceof  DarkChocolate)
	{
		DarkChocolate darkchocolate=(DarkChocolate)	chocolate;
		System.out.println(darkchocolate.flavour);
		darkchocolate.storing();
		
	}
	
	if(chocolate instanceof SilkChocolate)
	{
		SilkChocolate silk=(SilkChocolate)chocolate;
		System.out.println(silk.expireDate);
		silk.breaking();
	}
	
	
}
}