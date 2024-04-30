package com.xworkz.collectioclass.stream.comparable.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectioclass.stream.comparable.RubberDTO;

public class RubberRunner {

	public static void main(String[] args) {
		RubberDTO rubber1 = new RubberDTO("FlexiGrip", "Orange", "Circular", LocalDate.of(2024, 4, 14));
		RubberDTO rubber2 = new RubberDTO("FlexiGrip", "Blue", "Rectangular", LocalDate.of(2023, 7, 12));
		RubberDTO rubber3 = new RubberDTO("SureTraction", "Yellow", "Hexagonal", LocalDate.of(2022, 6, 14));
		RubberDTO rubber4 = new RubberDTO("GripMaster", "Blue", "Oval", LocalDate.of(2021, 5, 14));
		RubberDTO rubber5 = new RubberDTO("PowerGrip", "Black", "Square", LocalDate.of(2023, 3, 14));
//DuraFlex
		
		
		Collection<RubberDTO> rubberCollection=new ArrayList<RubberDTO>();
		rubberCollection.add(rubber1);
		rubberCollection.add(rubber2);
		rubberCollection.add(rubber3);
		rubberCollection.add(rubber4);
		rubberCollection.add(rubber5);
		
for(RubberDTO rubber:rubberCollection)
{
	System.out.println(rubber);
}

System.out.println("******After Sorting Descending*****************************");
		rubberCollection
		.stream()
		.sorted()
		.forEach(rubber->System.out.println(rubber));
		

		System.out.println("***********Blue***********");
		
		rubberCollection
		.stream()
		.sorted()
		.filter(ref->ref.getColor().contains("Blue"))
		//.filter(ref->ref.getColor().equals("Blue"))
	    .forEach(rubber->System.out.println(rubber));

	}

}
