package com.xworkz.icecream;

public class Cream {
	
	public Cream()
	{
		System.out.println("No-Parametrs");
	}
	
	public void creamRunner(Object obj)
	{
		if( obj instanceof IceCream)
		{
			IceCream icecream=(IceCream)obj;
			System.out.println(icecream.state);
			icecream.melting();
			
		}
		
		if(obj instanceof KwalityWalls)
		{
			KwalityWalls kwalityWalls=(KwalityWalls)obj;
			System.out.println(kwalityWalls.price);
			kwalityWalls.freezing();		
	}
		
		if(obj instanceof Hangyo)
		{
			Hangyo hangyo=(Hangyo)obj;
			System.out.println(hangyo.packaging);
			hangyo.cool();
		}
	
	if(obj instanceof ArunIce)
	{
		ArunIce arun=(ArunIce)obj;
		System.out.println(arun.price);
		arun.candy();
	}
		

}
}