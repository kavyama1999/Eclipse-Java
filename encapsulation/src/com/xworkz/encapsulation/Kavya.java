package com.xworkz.encapsulation;

public class Kavya {

	private String color;
	private String name;
	
	
	
	public Kavya()
	{
		System.out.println("no param");
	}
	
	public void game()
	{
		System.out.println("method");
	}
	
	@Override
	public String toString() {
		
		return "Color :"+this.color+ ",Name :"+this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	@Override
	public int hashCode() {
		return 70;
	}
	
	
	
	
}
