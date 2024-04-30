package com.xworkz.collectioclass.stream.comparable.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectioclass.stream.comparable.BrushDTO;

public class BrushRunner {

	public static void main(String[] args) {
		BrushDTO brush1 = new BrushDTO("Zig_Zag", 25, "Plastic", "ToothBrush");
		BrushDTO brush2 = new BrushDTO("Colgate", 20, "Plastic", "ToothBrush");
		BrushDTO brush3 = new BrushDTO("Sensodyne", 40, "Plastic", "ToothBrush");
		BrushDTO brush4 = new BrushDTO("Zig_Zag", 30, "Plastic", "ToothBrush");
		BrushDTO brush5 = new BrushDTO("Aquafresh", 100, "Plastic", "ToothBrush");
		BrushDTO brush6 = new BrushDTO("Jordan", 20, "Plastic", "ToothBrush");
		BrushDTO brush7 = new BrushDTO("Crest", 55, "Plastic", "ToothBrush");
		BrushDTO brush8 = new BrushDTO("Reach", 70, "Plastic", "ToothBrush");
		BrushDTO brush9 = new BrushDTO("Zig_Zag", 30, "Plastic", "ToothBrush");
		BrushDTO brush10 = new BrushDTO("Oral-B", 50, "Plastic", "ToothBrush");

		Collection<BrushDTO> brushCollection = new ArrayList<BrushDTO>();
		brushCollection.add(brush1);
		brushCollection.add(brush2);
		brushCollection.add(brush3);
		brushCollection.add(brush4);
		brushCollection.add(brush5);
		brushCollection.add(brush6);
		brushCollection.add(brush7);
		brushCollection.add(brush8);
		brushCollection.add(brush9);
		brushCollection.add(brush10);
//if we wan to sort we can go for camparable or comparator//

		for (BrushDTO br : brushCollection) {
			System.out.println(br);
		}

		System.out.println("**********After sorting Ascending******************");

		brushCollection
		.stream()
		.sorted()
         .forEach(ref -> System.out.println(ref));

		System.out.println("************price which is Greaterthan 50***************");
		// print price>50
		
		brushCollection

			.stream()
			.sorted()
			.filter(brush -> brush.getPrice() > 50)
			.forEach(ref -> System.out.println(ref));

	}

}
