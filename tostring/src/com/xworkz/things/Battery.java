package com.xworkz.things;

public class Battery {
	
	public int capacity=500;
	public double voltage=40.25d;
	

	
	public void charger()
	{
		System.out.println("Charger running in Battery");
	}

public String toString()
{
	return "Battery-Capacity:"+capacity+",Battery-Voltage:"+voltage;

}


}
