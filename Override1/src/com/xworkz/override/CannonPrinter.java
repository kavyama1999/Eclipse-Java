package com.xworkz.override;

public class CannonPrinter extends Printer {
	
	
	public void connectWifi()
	{
		System.out.println("Running connectWifi in CannonPrinter");
	}
	@Override
	public void print()
	{
		System.out.println("Running print in CannonPrinter");
	}

	@Override
	public void scan()
	{
		System.out.println("Running scan in CannonPrinter");
	}

	
	@Override
	public void copy()
	{
		System.out.println("Running  copy in CannonPrinter");
	}
	
	

	
	

}
