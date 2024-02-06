package com.xworkz.override.overriding;

import com.xworkz.override.CannonPrinter;

import com.xworkz.override.Printer;
import com.xworkz.override.SmartCanonPrinter;
import com.xworkz.override.WoodWindow;

public class Runner {

	public static void main(String[] args) {
		
Printer printer=new Printer();
printer.print();

// 2 instances

//same type

CannonPrinter cannonprinter=new CannonPrinter();
cannonprinter.connectWifi();

//parent

Printer printer1=new CannonPrinter();
printer1.print();
printer1.scan();
printer1.copy();
//printer1.connectWifi();

CannonPrinter cannonprint=(CannonPrinter)printer1;
cannonprint.connectWifi();




//3 instances same type,parent,grand parent


//sameType

SmartCanonPrinter smartcanonprinter=new SmartCanonPrinter();


smartcanonprinter.connectToMobile();
smartcanonprinter.connectWifi();
smartcanonprinter.scan();
smartcanonprinter.print();
smartcanonprinter.copy();

//parent
Printer printer2=new SmartCanonPrinter();
printer2.scan();
printer2.print();
printer2.copy();
//printer2.connectWifi();

SmartCanonPrinter SmartCanonPrinter6=(SmartCanonPrinter)printer2;
SmartCanonPrinter6.connectWifi();

//grand parent
CannonPrinter cannonprinter2=new SmartCanonPrinter ();
cannonprinter2.connectWifi();
cannonprinter2.scan();
cannonprinter2.copy();
cannonprinter2.print();
//cannonprinter2. connectToMobile();




//casting


SmartCanonPrinter smartcanonprinter9=(SmartCanonPrinter)cannonprinter2; 
smartcanonprinter9.connectToMobile();



	}

}
