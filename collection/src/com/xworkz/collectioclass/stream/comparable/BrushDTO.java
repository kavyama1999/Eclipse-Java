package com.xworkz.collectioclass.stream.comparable;

import java.io.Serializable;

public class BrushDTO implements Serializable,Comparable<BrushDTO> {
	
	private String brand;
	private Integer price;//non primitive
	private String material;
	private String type;
	
	public BrushDTO()
	{
		System.out.println("no arguments in BrushDTO");
	}

	public BrushDTO(String brand, Integer price, String material, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.material = material;
		this.type = type;
	}

	
	@Override
	public String toString() {
		return "BrushDTO [brand=" + brand + ", price=" + price + ", material=" + material + ", type=" + type + "]";
	}
	
	//for sorting
	
	@Override
	public int compareTo(BrushDTO ref1) {
		return(this.price.compareTo(ref1.price)) ;//another brush2 compare by using this
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	


}
