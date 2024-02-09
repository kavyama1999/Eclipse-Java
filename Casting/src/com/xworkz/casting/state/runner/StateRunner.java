package com.xworkz.casting.state.runner;

import com.xworkz.casting.state.India;
import com.xworkz.casting.state.Karnataka;
import com.xworkz.casting.state.Kerala;

public class StateRunner {

	public static void main(String[] args) {
		
		India india=new India();
		
		Karnataka karnataka=new Karnataka();
		india.socialWelfare(karnataka);
		
		//karnataka.governance();	
		
		System.out.print("$$$$$$$$$$$$$$$$$");
		
		Kerala kerala=new Kerala();
		india.socialWelfare(kerala);
		
		//kerala.governance();
		
	}

}
