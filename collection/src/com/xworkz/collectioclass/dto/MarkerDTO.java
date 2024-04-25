package com.xworkz.collectioclass.dto;

import java.io.Serializable;

public class MarkerDTO  implements Serializable{
	
	
	private String brandName;
	private String color;
	private int price;
	private int size;
	
	public MarkerDTO()
	{
		System.out.println("No parametrs in MArkerDTO");
	}

	public MarkerDTO(String brandName, String color, int price, int size) {
		super();
		this.brandName = brandName;
		this.color = color;
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {
		return "MarkerDTO [brandName=" + brandName + ", color=" + color + ", price=" + price + ", size=" + size + "]";
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
