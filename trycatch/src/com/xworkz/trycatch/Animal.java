package com.xworkz.trycatch;

public class Animal {
	
	
	
	
	public void playing(int age) throws AnimalException
	{
	if(age>18 && age<30)
	{
		System.out.println("the given age is correct");
	}
	
	else
	{
		//System.out.println("The given name length is not correct");
		throw new AnimalException("The given name is invalid");
	}
	}
	
	
	public void run(String name) throws NameException
	{
		if(name.equals("Kavya"))
		{
			System.out.println("Name is kavya");
		}
		
		else if (name.equals("jyo"))
		{
			System.out.println("Name is jyo");
		}
		else
		{
			//System.out.println("Name is Invalid");
			throw new NameException("The given name is not found");

		}
	}

}

