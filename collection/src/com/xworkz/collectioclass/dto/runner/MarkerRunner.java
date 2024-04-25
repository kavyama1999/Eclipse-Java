package com.xworkz.collectioclass.dto.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collectioclass.dto.MarkerDTO;

public class MarkerRunner {

	public static void main(String[] args) {

		MarkerDTO marker1 = new MarkerDTO("Sharpie", "Pink", 50, 10);
		MarkerDTO marker2 = new MarkerDTO("Copic", "White", 60, 4);
		MarkerDTO marker3 = new MarkerDTO("Prismacolor", "Yellow", 70, 6);
		MarkerDTO marker4 = new MarkerDTO("Posca", "Red", 80, 8);
		MarkerDTO marker5 = new MarkerDTO("Pentel", "White", 90, 3);
		MarkerDTO marker6 = new MarkerDTO("Renylods", "Green", 100, 9);
		MarkerDTO marker7 = new MarkerDTO("Pentel", "Blue", 90, 6);
		MarkerDTO marker8 = new MarkerDTO("Zig", "Orange", 45, 5);
		MarkerDTO marker9 = new MarkerDTO("Touch Twin Marker", "Black", 55, 10);
		MarkerDTO marker10 = new MarkerDTO("Copic", "Pink", 90, 20);

		Collection<MarkerDTO> markerCollection = new ArrayList<MarkerDTO>();

		markerCollection.add(marker1);
		markerCollection.add(marker2);
		markerCollection.add(marker3);
		markerCollection.add(marker4);
		markerCollection.add(marker5);
		markerCollection.add(marker6);
		markerCollection.add(marker7);
		markerCollection.add(marker8);
		markerCollection.add(marker9);
		markerCollection.add(marker10);
		
		System.out.println("Size:"+markerCollection.size());
		
		Iterator<MarkerDTO> iterator=markerCollection.iterator();
		
		while(iterator.hasNext())
		{
			MarkerDTO marker=iterator.next();
			if(marker.getBrandName().equals("Pentel"))
			{
				iterator.remove();
				System.out.println("Removed Branda Name:"+marker.getBrandName());
			}
		}
		
		System.out.println("*******After Removing***********");
		
		System.out.println("Size:"+markerCollection.size());
		
		for(MarkerDTO mk:markerCollection)
		{
			System.out.println(mk);
		}
	}

}
