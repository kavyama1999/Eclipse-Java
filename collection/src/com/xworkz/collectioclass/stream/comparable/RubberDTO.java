package com.xworkz.collectioclass.stream.comparable;

import java.io.Serializable;
import java.time.LocalDate;

public class RubberDTO implements Serializable,Comparable<RubberDTO>{
	
	private String brand;
	private String color;
	private String shape;
	private LocalDate manfDate;
	
	public RubberDTO()
	{
		System.out.println("No parametrs In RubberDTO ");
	}

	public RubberDTO(String brand, String color, String shape, LocalDate manfDate) {
		super();
		this.brand = brand;
		this.color = color;
		this.shape = shape;
		this.manfDate = manfDate;
	}

	@Override
	public String toString() {
		return "RubberDTO [brand=" + brand + ", color=" + color + ", shape=" + shape + ", manfDate=" + manfDate + "]";
	}
	
	@Override
	public int compareTo(RubberDTO rubber1) {
		return (rubber1.brand.compareTo(this.brand));
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public LocalDate getManfDate() {
		return manfDate;
	}

	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}

	

	

	

}
