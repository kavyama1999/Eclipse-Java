package com.xworkz.interfacemetrorules;

public class MetroAdmin {
	
private	MetroRules metrorules;


public MetroAdmin(MetroRules metrorules)
{
   this.metrorules=metrorules;
}



public void metroAdmin()
{
	if(metrorules!=null)
	{
		if(metrorules.cleaness()&& metrorules.excessLaguage())
		{
			System.out.println("is good");
		}
		else
		{
			System.out.println("is  not good");
		}
	}
	
	//boolenan clean=
	
	
	//id(metrorules)
	
	
	
	
	
	
}




}
