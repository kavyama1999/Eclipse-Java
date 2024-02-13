package com.xworkz.things;

public class SwitchBoard {
	
	public int numberOfSwitches=6;
	public	 String brandName="Hi-Fi";
	public	 boolean hasIndicatorsLights=true;
	
	
	
	public void board()
	{
		System.out.println("Running in SWitch Borad");
	}
	
	
	
	public String toString()
	{
return "NumberOfSwitches:"+numberOfSwitches+",BrandName:"+brandName+","
		+ "IndicatorsLights:"+hasIndicatorsLights;

	
	}

}
