package com.xworkz.collectioclass.dto.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectioclass.dto.HouseDTO;

public class HouseRunner {

	public static void main(String[] args) {

		HouseDTO house=new HouseDTO("Basaveshwara Nilaya",234,"Shivamogga",4);
		HouseDTO house1=new HouseDTO("Kavya ",235,"Shivamogga",4);
		HouseDTO house2=new HouseDTO("Shrimata Nilaya",236,"Karwar",4);
		HouseDTO house3=new HouseDTO("Naveen ",237,"Davangere",4);
		HouseDTO house4=new HouseDTO("Smithan ",233,"Vijanagar",4);
		HouseDTO house5=new HouseDTO("Sathwik ",231,"Rajajinagar",4);
		HouseDTO house6=new HouseDTO("Sharada ",239,"Mandya",4);
		HouseDTO house7=new HouseDTO("Ramesh ",221,"Mysore",4);
		HouseDTO house8=new HouseDTO("Sanvi ",254,"Kolar",4);
		HouseDTO house9=new HouseDTO("Sihi ",274,"Bengaluru",4);
		
		Collection<HouseDTO> collectHouse=new ArrayList<HouseDTO>();
		collectHouse.add(house);
		collectHouse.add(house1);
		collectHouse.add(house2);
		collectHouse.add(house3);
		collectHouse.add(house4);
		collectHouse.add(house5);
		collectHouse.add(house6);
		collectHouse.add(house7);
		collectHouse.add(house8);
		collectHouse.add(house9);

		System.out.println("size:"+collectHouse.size());
		
		for(HouseDTO housedto:collectHouse)
		{
			System.out.println(housedto);
		}
		
	}

}
