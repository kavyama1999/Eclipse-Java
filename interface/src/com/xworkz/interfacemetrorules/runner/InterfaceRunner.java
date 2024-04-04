package com.xworkz.interfacemetrorules.runner;

import com.xworkz.interfacemetrorules.BanashanakariMetrorulesImpl;
import com.xworkz.interfacemetrorules.MetroAdmin;
import com.xworkz.interfacemetrorules.MetroRules;

public class InterfaceRunner {

	public static void main(String[] args) {
		
		//MetroRules m=new MetroRules();//because it is interface for interface we cannot create object
		
		MetroRules metro=new BanashanakariMetrorulesImpl();
		
	//metro.
		
		BanashanakariMetrorulesImpl ban=new BanashanakariMetrorulesImpl();
		
		//we get 15 methods 2 are protectd so 13 methods we can see
		ban.buyTicket();
		Object obj=new BanashanakariMetrorulesImpl();
		obj.equals(obj);
		
		MetroAdmin admin=new MetroAdmin(metro);
		admin.metroAdmin();
		
		
	}

}
