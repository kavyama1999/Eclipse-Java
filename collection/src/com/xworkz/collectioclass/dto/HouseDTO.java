package com.xworkz.collectioclass.dto;

import java.io.Serializable;

public class HouseDTO implements Serializable {
	
	private String name;
	private int number;
	private String area;
	private int rooms;
	
	public HouseDTO()
	{
		System.out.println("no arguments in HouseDTO");
	}

	public HouseDTO(String name, int number, String area, int rooms) {
		super();
		this.name = name;
		this.number = number;
		this.area = area;
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "HouseDTO [name=" + name + ", number=" + number + ", area=" + area + ", rooms=" + rooms + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

}
