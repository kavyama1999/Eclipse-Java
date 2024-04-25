package com.xworkz.collectioclass.dto.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collectioclass.dto.BoxDTO;
import com.xworkz.collectioclass.dto.HouseDTO;

import javafx.scene.shape.Box;

public class BoxRunner {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		BoxDTO box = new BoxDTO(200, "Orange", 1, "wood");
		BoxDTO box1 = new BoxDTO(400, "Red", 2, "Plastic");
		BoxDTO box2 = new BoxDTO(300, "Green", 3, "Paper Craft");
		BoxDTO box3 = new BoxDTO(200, "Yellow", 4, "Steel");
		BoxDTO box4 = new BoxDTO(150, "Red", 1, "Glass");
		BoxDTO box5 = new BoxDTO(160, "Red", 2, "Ceramic");
		BoxDTO box6 = new BoxDTO(600, "Purple", 1, "Leather");
		BoxDTO box7 = new BoxDTO(450, "Green", 2, "Fabric");
		BoxDTO box8 = new BoxDTO(300, "Brown", 1, "PaperBoard");
		BoxDTO box9 = new BoxDTO(800, "Green", 2, "wood");

		Collection<BoxDTO> collectBox = new ArrayList<BoxDTO>();
		collectBox.add(box);
		collectBox.add(box1);
		collectBox.add(box2);
		collectBox.add(box3);
		collectBox.add(box4);
		collectBox.add(box5);
		collectBox.add(box6);
		collectBox.add(box7);
		collectBox.add(box8);
		collectBox.add(box9);

		System.out.println("Size:" + collectBox.size());
		System.out.println("**************************");

		for (BoxDTO boxdto : collectBox) {
			if (boxdto.getColor().equals("Red")) {
				System.out.println("Which has Red Color:" + boxdto.getMaterial());
			}
		}

		
		System.out.println("**********Green Color********************");
		
		Iterator<BoxDTO> iterator=collectBox.iterator();
		
		while(iterator.hasNext())
		{
			BoxDTO bt=iterator.next();
			if(bt.getColor().equals("Green"))
			{
				iterator.remove();
				//System.out.println("Colors"+bt.getColor());
				System.out.println("Green color Box:"+bt.getMaterial());
			}
		}
		System.out.println("*************After removing*************");
		
		for(BoxDTO bt:collectBox)
		{
			System.out.println(bt);
		}
	System.out.println("After size:"+collectBox.size());
	}

}
