package com.xworkz.override;

public class SmartCanonPrinter extends CannonPrinter {
	
	
	public void connectToMobile()
	{
		System.out.println("Running connectToMobile in SmartCanonPrinter ");
	}

	
	@Override
	public void connectWifi()
	{
		System.out.println("Running connectWifi in SmartCanonPrinter");
	}
	@Override
	public void print()
	{
		System.out.println("Running print in SmartCanonPrinter");
	}

	@Override
	public void scan()
	{
		System.out.println("Running scan in SmartCanonPrinter");
	}

	
	@Override
	public void copy()
	{
		System.out.println("Running  copy in SmartCanonPrinter");
	}
	
	
	
}
