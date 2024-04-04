package com.xworkz.interfacemetrorules;

public class BanashanakariMetrorulesImpl implements MetroRules {

	@Override
	public int buyTicket() {
		System.out.println("ticket price");
		return 20;
	}

	@Override
	public boolean cleaness() {
		System.out.println("is cleaness");
		return true;
	}

	@Override
	public boolean excessLaguage() {
		System.out.println("has excessLaguage");
		return true;
	}

	@Override
	public String getLine() {
		System.out.println("getline");
		return MetroRules.GREEN_LINE;
	}

}