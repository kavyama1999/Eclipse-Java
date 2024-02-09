package com.xworkz.override;

public class WoodWindow extends Window {

	@Override
	public void open()
	{
		System.out.println("running open in Woodwindow");
	}
	@Override
	public void close()
	{
		System.out.println("running close in Woodwindow");
	}
	
	
	public void autoClose()
	{
		System.out.println("running autoClose in Woodwindow");
	}
	
}
