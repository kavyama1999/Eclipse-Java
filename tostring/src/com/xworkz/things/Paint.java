package com.xworkz.things;

public class Paint extends Ring {
	
	public int price;
	public String color;
	public String finish;
	
	
	
public	Paint(int price,String color,String finish)
{
	//System.out.println("Running Paint");
	this.price=price;
	this.color=color;
	this.finish=finish;
	
	
}


public void dry()
{
	super.toString();
	System.out.println("Drying");
}

@Override
public String toString() {
	System.out.println("to String running in paint");

	return "Paint-price:"+price+",Color:"+color+",Finish:"+finish;
	

}         



}
