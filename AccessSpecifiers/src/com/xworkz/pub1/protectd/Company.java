package com.xworkz.pub1.protectd;

public class Company {

	String name;
	int NoOfEmployee;
	
	
	
	 protected Company()
	{
		super();
		System.out.println("No Parameters");
	}
	 
	public Company(String name,int NoOfEmployee)
	 {
		 this.name=name;
		 this.NoOfEmployee=NoOfEmployee;
		 System.out.println("2nd Constructor");
	 }
}
