package com.xworkz.interfacemetrorules;

public interface MetroRules {

	//final and static is default
	//static and final decalration 
	String YELLOW_LINE="yellow";
	String GREEN_LINE="gren";
    String BLUE_LINE="blue";

    //is nothing but abstract class 
//    public int buyTicket();
//    public boolean cleaness();
//    public boolean exceesLaguage();
//    public String getLine();
//already it is public
    //if diffrent project  we can use jar file
     int buyTicket();
     boolean cleaness();
     boolean excessLaguage();
     String getLine();

	
}
