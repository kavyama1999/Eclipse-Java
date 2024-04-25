package com.xworkz.collectioclass.dto;

import java.io.Serializable;

public class PerfumeDTO implements Serializable {

	
	private String brnadname;
	private String color;
	private int cost;
	private String fragrance;
	private String durationLast;
	
	
	public PerfumeDTO()
	{
		System.out.println("No parametrs PerfumeDTO");
	}


	public PerfumeDTO(String brnadname, String color, int cost, String fragrance, String durationLast) {
		super();
		this.brnadname = brnadname;
		this.color = color;
		this.cost = cost;
		this.fragrance = fragrance;
		this.durationLast = durationLast;
	}


	@Override
	public String toString() {
		return "PerfumeDTO [brnadname=" + brnadname + ", color=" + color + ", cost=" + cost + ", fragrance=" + fragrance
				+ ", durationLast=" + durationLast + "]";
	}


	public String getBrnadname() {
		return brnadname;
	}


	public void setBrnadname(String brnadname) {
		this.brnadname = brnadname;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public String getFragrance() {
		return fragrance;
	}


	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}


	public String getDurationLast() {
		return durationLast;
	}


	public void setDurationLast(String durationLast) {
		this.durationLast = durationLast;
	}
}
