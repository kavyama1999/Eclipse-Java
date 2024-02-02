package com.xworkz.pub1.protectd;

public class ProtectedRunner {
	
	
	ProtectedRunner()
	{
		super();
	}

	public static void main(String[] args) {
		
//new  Company();
		Company company=new Company();
		company.name="TCS";
		System.out.println(company.name);
		
		
		new Software();
		//Software software=new Software();
	
	
	}

}
