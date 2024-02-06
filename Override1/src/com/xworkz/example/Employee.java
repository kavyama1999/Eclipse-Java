package com.xworkz.example;

public class Employee extends Company {
	
	
	
	
public void coding()
	{
		System.out.println("running coding in Employee");
	}

	public void teamWork()
	{
		System.out.println("running  teamwork in Employee");
	}
	@Override
	public void hireEmployee()
	{
		System.out.println("Running Hireemployee in Employee");
	}
	@Override
	public void salary()
	{
		System.out.println("Running Salary in Employee ");
	}

	@Override
	public void softwareDevelopment()
	{
		System.out.println("Running softwareDevelopment in Employee");
	}

}
