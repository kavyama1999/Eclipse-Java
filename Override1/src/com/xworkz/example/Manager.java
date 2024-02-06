package com.xworkz.example;

public class Manager extends Employee {
	
	
	public void teamBuilding()
	{
		System.out.println("running teamBuilding  in manager");
	}
	public void decisionmaking()
	{
		System.out.println("running decisionmaking  in manager");
	}
	
	
	@Override
	public void coding()
	{
		System.out.println("running coding in manager");
	}
	@Override
	public void teamWork()
	{
		System.out.println("running  teamwork in manager");
	}
	@Override
	public void hireEmployee()
	{
		System.out.println("Running Hireemployee in manager");
	}
	@Override
	public void salary()
	{
		System.out.println("Running Salary in manager ");
	}

	@Override
	public void softwareDevelopment()
	{
		System.out.println("Running softwareDevelopment in manager");
	}

}
