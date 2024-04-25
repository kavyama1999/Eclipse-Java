package com.xworkz.collectioclass.dto.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectioclass.dto.BellDTO;

public class BellRunner {

	public static void main(String[] args) {
		
		BellDTO bell=new BellDTO("Brass","Sleigh Bell",40,20,25,200);
		BellDTO bell1=new BellDTO("Copper","Cow Bell",50,10,50,400);
		BellDTO bell2=new BellDTO("Bronze","Church Bell",30,20,70,100);
		BellDTO bell3=new BellDTO("Silver","Hand Bell",20,35,42,300);
		BellDTO bell4=new BellDTO("Steel","School Bell",45,40,45,142);
		BellDTO bell5=new BellDTO("Aluminium","Temple Bell",50,45,32,500);
		BellDTO bell6=new BellDTO("Iron","Bicycle Bell",55,50,20,366);
		BellDTO bell7=new BellDTO("Bronze","Wedding Bell",60,55,40,120);
		BellDTO bell8=new BellDTO("Platinum","Liberty Bell",65,30,30,2000);
		BellDTO bell9=new BellDTO("Tin","Jingle Bell",70,65,20,1200);


		Collection<BellDTO> collectBell=new ArrayList<BellDTO>();
		collectBell.add(bell);
		collectBell.add(bell1);
		collectBell.add(bell2);
		collectBell.add(bell3);
		collectBell.add(bell4);
		collectBell.add(bell5);
		collectBell.add(bell6);
		collectBell.add(bell7);
		collectBell.add(bell8);
		collectBell.add(bell9);
		
		System.out.println("Size:"+collectBell.size());
		
		for(BellDTO belldto:collectBell)
		{
			System.out.println(belldto);
		}

		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		int bellcountgreaterthan1000=0;
		for(BellDTO belldto1:collectBell)
		{
			//System.out.println(belldto1);
			if(belldto1.getPrice()>1000)
			{
				System.out.println("Bell which is greater than 1000:"+belldto1.getMetalUsed());
				bellcountgreaterthan1000++;
			}
		}
		System.out.println("No_of Bell:"+bellcountgreaterthan1000);
		
		System.out.println("*************************");
		for(BellDTO belldto2:collectBell)
		{
			if(belldto2.getMetalUsed().equals("Bronze"))
			{
				System.out.println("Bronze metal:"+belldto2.getMetalUsed());
			}
		}
		
		System.out.println("*************************");
		for(BellDTO belldto3:collectBell)
		{
			if(belldto3.getHeight()==belldto3.getWeight())
			{
				//System.out.println("Height and weight:" + belldto3.getHeight()+",weidj:"+belldto3.getWeight());
				System.out.println("Height and weight which has same:"+belldto3.getType());
			}
		}
	}

}

