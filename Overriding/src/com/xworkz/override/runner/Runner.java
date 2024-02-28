package com.xworkz.override.runner;

import com.xworkz.override.Window;
import com.xworkz.override.WoodWindow;

public class Runner {

	public static void main(String[] args) {
		
		Window window=new Window();
		window.open();
		
		window.close();
		window.semiClose();
		
		WoodWindow woodWindow =new WoodWindow();
		woodWindow.close();
		woodWindow.open();
		woodWindow.autoClose();
		
		System.out.println("####");
		
		Window window1=new WoodWindow();
		
        window1.open();
		window1.close();
		window1.semiClose();
		//window1.autoClose();
		
		
		System.out.print("@@@@@@@@@@@@@@@@");
		//WoodWindow gy=new  Window();
		
		//casting....
		//data type casting->converting parent reference type to subclass reference type..
		//it possible 
		//in non-primitive inheritance
		
		WoodWindow woodwindow=(WoodWindow)window1;
		woodwindow.autoClose();
		woodwindow.	semiClose();
		woodwindow.open();
		woodwindow.close();		
	//parent  class to sub  class but sub class to parent we cannot create reference
		
	}

}
