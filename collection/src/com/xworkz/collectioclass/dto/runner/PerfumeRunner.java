package com.xworkz.collectioclass.dto.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collectioclass.dto.PerfumeDTO;

public class PerfumeRunner {

	public static void main(String[] args) {

		PerfumeDTO perfume1 = new PerfumeDTO("Park Avenue", "Black", 600, "Ambrosia", "12 Dec");
		PerfumeDTO perfume2 = new PerfumeDTO("Engage", "White", 500, "Blissful Breeze.", "10 April");
		PerfumeDTO perfume3 = new PerfumeDTO("Yardley ", "Pink", 1000, "Blossom", "3 May");
		PerfumeDTO perfume4 = new PerfumeDTO("FOGG", "Black", 600, "Ambrosia", "6 July");
		PerfumeDTO perfume5 = new PerfumeDTO("Plum", "Black", 600, "Ambrosia", "12 April");
		PerfumeDTO perfume6 = new PerfumeDTO("Ajmal", "Blue", 600, "Ambrosia", "30 Dec");
		PerfumeDTO perfume7 = new PerfumeDTO("Denver", "Black", 600, "Ambrosia", "2 Agust");
		PerfumeDTO perfume8 = new PerfumeDTO("AXE", "Black", 600, "Ambrosia", "1 Jan");
		PerfumeDTO perfume9 = new PerfumeDTO("Azzaro", "Black", 600, "Ambrosia", "2 Jan");
		PerfumeDTO perfume10 = new PerfumeDTO("Park Avenue", "Black", 600, "Ambrosia", "31 Nov");

		Collection<PerfumeDTO> collectPerfume = new ArrayList<PerfumeDTO>();
		collectPerfume.add(perfume1);
		collectPerfume.add(perfume2);
		collectPerfume.add(perfume3);
		collectPerfume.add(perfume4);
		collectPerfume.add(perfume5);
		collectPerfume.add(perfume6);
		collectPerfume.add(perfume7);
		collectPerfume.add(perfume8);
		collectPerfume.add(perfume9);
		collectPerfume.add(perfume10);
		
		System.out.println("Size:"+collectPerfume.size());
		
Iterator<PerfumeDTO> iterator=collectPerfume.iterator();
while(iterator.hasNext())
{
	PerfumeDTO perfume=iterator.next();
	if(perfume.getColor().equals("Black"))
	{
		iterator.remove();
		//System.out.println("Removed Color:"+perfume.getBrnadname());
	}
}
	System.out.println("******After Removing*******");
	System.out.println("Size:"+collectPerfume.size());
	
	for(PerfumeDTO perfumedto:collectPerfume)
	{
		System.out.println(perfumedto.getColor());
	}
	
	}

}
