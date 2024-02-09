package com.xworkz.casting.state;

public class India {
	
	
	public void socialWelfare(State state)
	{
		//System.out.println(state.name);
		//state.governance();
		
	if(state instanceof Karnataka)
	{
		Karnataka kar=(Karnataka)state;
		kar.governance();
		kar.infrastructureDevelopment();
		
		kar.name="Goa";
		System.out.print( kar. name);
		
		kar.population=50000;
		System.out.print(  kar.population);
		
		
}
	
	else if(state instanceof Kerala)
	{
		Kerala kerala=(Kerala)state;
		
		kerala.capital="Thiruvananthapuram";
		System.out.println(kerala.capital);

		kerala.tourismPromotion();
		
		kerala.name="Goa";
		System.out.print( kerala. name);
		
		kerala.governance();
		
		
		
	}

}
}
