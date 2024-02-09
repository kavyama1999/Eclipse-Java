package com.xworkz.casting;

public class Bus {
	
	public void move(HandWash hand )//string name
	{
		
		System.out.println(hand.aroma);
		hand.clean();
		
		if(hand instanceof Sanitizer)	
		{
			Sanitizer sanitizer=(Sanitizer)hand;//parent reference convert to child reference
			
			sanitizer.disinfect();
			sanitizer.quantity=10;
			System.out.println(sanitizer.quantity);

			
			sanitizer.aroma="Jasmine";
			System.out.println(sanitizer.aroma);
			
			
			sanitizer.clean();

		}
		else if(hand instanceof Soap)
		{
			Soap soap=(Soap)hand;
			soap.brand="Dove";
			System.out.println(soap.brand);
			soap.foam();
			soap.aroma="Lilly";
			System.out.println(soap.aroma);

			
		}
		
		if(hand instanceof Lux)
		{
			Lux lux=(Lux)hand;
			System.out.println(lux.price);
			lux.makeYoung();
			
		}
		
		
	}
	
	

}

