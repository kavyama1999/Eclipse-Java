package com.xworkz.collectioclass.stream.comparable;

import java.io.Serializable;

public class DayDTO implements Serializable, Comparable<DayDTO> {

	private String name;
	private int order;

	public DayDTO() {
		System.out.println("No arguments in DayDTO");
	}

	public DayDTO(String name, int order) {
		super();
		this.name = name;
		this.order = order;
	}

	@Override
	public String toString() {
		return "DayDTO [name=" + name + ", order=" + order + "]";
	}

//DayDTO
	@Override
	public int compareTo(DayDTO days1) {
		
		if(this.order==days1.order)
		{
			return 0;
			//return order;
		}
		else if(this.order>days1.order)
		{
			return 1;
		}
		else if(this.order<days1.order)
		{
			return -1;
		}
		return order;
			
		
	}

//	@Override
//    public int compareTo(DayDTO otherDay) {
//        return Integer.compare(this.order, otherDay.getOrder());
//    }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
