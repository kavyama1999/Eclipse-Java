package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.Basket;
import com.xworkz.encapsulation.Box;
import com.xworkz.encapsulation.Cock;
import com.xworkz.encapsulation.NailPolish;
import com.xworkz.encapsulation.Pot;

public class Runner {

	public static void main(String[] args) {
		
		Box box=new Box();//when access box reference we can get 9 method 2 are protected
		
  //System.out.println(box);
		
//		box.brandName="Trendenza";
//		box.type="Corrugated";	
		
		
	String value = box.getBrandName();
	System.out.println(value);
	String value1=box.getType();
	System.out.println(value1);//print null value
	
	box.setBrandName("Trendenza");//for writing
	System.out.println("Brand Name: " +box.getBrandName());
	
	box.setType("Corrugated");
	System.out.println("Type : " +box.getType());
	
	box.setColor("Brown");
	System.out.println("Color : " +box.getColor());
	
	
	box.setBoxWidth("7 cm");
String values2=box.getBoxWidth();
System.out.println("Box-Width : " +values2);

box.setPrice(200);
System.out.println("Price: " +box.getPrice());


System.out.println("-------");

Box box1=new Box();

box1.setBrandName("Trendenza");
System.out.println("Brand Name: " +box1.getBrandName());


box1.setType("Corrugated");
System.out.println("Type : " +box1.getType());

box1.setColor("Red");
System.out.println("Color : " +box1.getColor());

box1.setBoxWidth("6 cm");
System.out.println("Box=Width : " +box1.getBoxWidth());

box1.setPrice(300);
System.out.println("Price : " +box1.getPrice());


System.out.println("---toString----");

System.out.println(box);
System.out.println(box.hashCode());


boolean  compare=box.equals(box1);
System.out.println(compare);
	
	
	
	
	NailPolish nail=new NailPolish();
	
//	System.out.println(nail);
	
	nail.setBrandName("Sugar Pop");
	System.out.println("Brand Name :" +nail.getBrandName());
	
	nail.setPrice(100);
	System.out.println("Price : " +nail.getPrice());
	
	nail.setQunatity("20 ml");
	System.out.println("Quantity : " +nail.getQuantity());
	
	nail.setColor("Pink");
	System.out.println("Pink : "+nail.getColor());
	
	nail.setFinsih("Glossy");
	System.out.println("Finish : " +nail.getFinish());
	
	
	
	//System.out.println("-------NailPilish------");
	
	NailPolish nail1=new NailPolish();
	
	nail1.setBrandName("Volo");
	System.out.println("Brand Name :"+nail1.getBrandName());
	
	nail1.setPrice(150);
	System.out.println("Price :" +nail1.getPrice());
	
	nail1.setQunatity("20 ml");
	System.out.println("Quantity :" +nail1.getQuantity());
	
	nail1.setColor("Blue");
	System.out.println("Color :"+nail1.getColor());
	
	nail1.setFinsih("Glossy");
	System.out.println("Finish :" +nail1.getFinish());
	
	System.out.println("-------NailPilish----");

	
	System.out.println(nail);
	System.out.println(nail.hashCode());
	
	System.out.println("-------NailPilish----");
	
	boolean next=nail.equals(nail1);
	System.out.println(next);
	
	
	
	
	Basket  basket=new Basket();
	
	basket.setMaterial("Plastic");
	System.out.println("Brand Name :" +basket.getBrandName());
	
	
	basket.setPrice(700);
	System.out.println("Price :" +basket.getPrice());
	
	basket.setColor("White");
	System.out.println("Color :" +basket.getColor());
	
	
	basket.setBrandName("Kolor");
	System.out.println("Brand Name:" +basket.getBrandName());
	
	basket.setShape("Rectangular");
	System.out.println("Shape :"+basket.getShape());
	
	
	System.out.println("********Basket***********");
	
	Basket basket1=new Basket();
	
	basket1.setMaterial("Plastic");
	System.out.println("Material :"+basket1.getMaterial());
	
	basket1.setPrice(700);
	System.out.println("Price :" +basket1.getPrice());
	
	basket1.setColor("Pink");
	System.out.println("Color :"+basket1.getColor());
	
	basket1.setBrandName("Nayasa");
	System.out.println("Brand Name :"+basket1.getBrandName());
	
	basket1.setShape("Round");
	System.out.println("Shape:"+basket1.getShape());
	
	System.out.println("*******Basket********");
	
	
	System.out.println(basket);
	System.out.println(basket.hashCode());
	
	System.out.println("*******Basket********");

	
	boolean compared=basket.equals(basket1);
	System.out.println(compared);
	
	System.out.println("--------Pot-----");
	
	Pot pot=new Pot();
	
	pot.setColor("Green");
	System.out.println("Color :" +pot.getColor());
	
	pot.setShape("Square");
	System.out.println("Shape :"+pot.getShape());
	
	
	pot.setPrice(250);
	System.out.println("Price :"+pot.getPrice());
	
	pot.setMaterial("Plastic");
	System.out.println("Material:"+pot.getMaterial());
	
	pot.setHeight("14 cm");
	System.out.println("Height :"+pot.getHeight());
	
	
	Pot pot1=new Pot();
	
	System.out.println("--------Pot-------------");
	
	pot1.setColor("Green");
	System.out.println("Color :"+pot1.getColor());
	
	pot1.setShape("Round");
	System.out.println("Shape:"+pot1.getShape());
	
	pot1.setPrice(350);
	System.out.println("Price :"+pot1.getPrice());
	
	
	pot1.setMaterial("Plastic");
	System.out.println("Material :"+pot1.getMaterial());
	
	pot1.setHeight("18 cm");
	System.out.println("Height :"+pot1.getHeight());
	
	
	System.out.println(pot);
	System.out.println(pot.hashCode());
	
	
	boolean compares=pot.equals(pot1);
	System.out.println(compares);
	
	
	Cock cock=new Cock();
	
	cock.setColor("White");
	System.out.println("Color :"+cock.getColor());
	
	cock.setPrice(20);
	System.out.println("Price: "+cock.getPrice());
	
	cock.setMaterial("RubberCock");
	System.out.println("Material :"+cock.getMaterial());
	
	cock.setWeight("5.2g");
	System.out.println("Weight :"+cock.getWeight());
	
	cock.setIdealFor("Junior");
	System.out.println("IdealFor:"+cock.getIdealFor());
	
	
	System.out.println("-------Cock--------");
	
	Cock cock1=new Cock();
	
	
	
	cock1.setColor("Yelllow");
	System.out.println("Color :"+cock1.getColor());
	
	cock1.setPrice(20);
	System.out.println("Price :"+cock1.getPrice());
	
	cock1.setMaterial("Plastic");
	System.out.println("Material:"+cock1.getMaterial());
	
	cock1.setWeight("6 g");
	System.out.println("Weight :"+cock1.getWeight());
	
	cock1.setIdealFor("Junior");
	System.out.println("IdealFor :"+cock1.getIdealFor());
	
	System.out.println("---------Cock-------");
	
	System.out.println(cock);
	System.out.println(cock.hashCode());
	
	
	System.out.println("---------Cock-----------");
	
	boolean answer=cock.equals(cock1);
	System.out.println(answer);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
