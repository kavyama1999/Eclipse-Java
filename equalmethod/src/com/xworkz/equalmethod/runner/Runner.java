package com.xworkz.equalmethod.runner;

import com.xworkz.equalmethod.Belt;
import com.xworkz.equalmethod.Button;
import com.xworkz.equalmethod.Carrom;
import com.xworkz.equalmethod.Fan;
import com.xworkz.equalmethod.Glass;
import com.xworkz.equalmethod.Lace;
import com.xworkz.equalmethod.Ladder;
import com.xworkz.equalmethod.Mug;
import com.xworkz.equalmethod.Plate;
import com.xworkz.equalmethod.Shoe;
import com.xworkz.equalmethod.Socks;
import com.xworkz.equalmethod.Stand;

public class Runner {

	public static void main(String[] args) {
		
		
			
				
				
				Belt belt=new Belt();
				
				System.out.println("---1---");
				
				belt.length=10; //*
				belt.type="Drive";
				belt.material="Leather";//*
				belt.price=100;
				belt.color="Maroon";
				belt.quality=true;//*
				
				
				
				
				
				Belt belt1=new Belt();
				
				System.out.println("---2---");

				
				belt1.length=10;//*
				belt1.type="Rubber";
				belt1.material="Leather";//*
				belt1.price=100;
				belt.color="Brown";
				belt.quality=true;//*
				

				
				Belt belt2=new Belt();
				
				System.out.println("---3---");

				
				belt2.length=10;
				belt2.type="Plastic";
				belt2.material="Leather";//* default value null
				belt2.price=200;
				belt.color="Black";
				belt.quality=true;//*


				
				
				System.out.println(belt);
				System.out.println(belt1);
				System.out.println(belt2);
				
				
				//boolean cmp=belt.equals(null);
				System.out.println("----Belt Comparisoin----");
				
				boolean compares=belt.equals(belt1);
				System.out.println(compares);
				
				
				boolean compares1=belt1.equals(belt2);
				System.out.println(compares1);
				
				boolean compares2=belt2.equals(belt);
				System.out.println(compares2);
				
				
				
				System.out.println("----Glass-");
				
				Glass glass=new Glass();
				
				glass.price=40;//8
				glass.color="Transparent";
				glass.size='M';
				glass.type="Juice Glass";
				glass.material="Glass";
				glass.capacity="300ml";
				
				
				System.out.println("----1---");
				
                 Glass glass1=new Glass();
				
				glass1.price=90;
				glass1.color="Transparent";
				glass1.size='M';
				glass1.type="Juice Glass";
				glass1.material="Glass";
				glass1.capacity="300ml";
				
				
				System.out.println("----2---");
				
                Glass glass2=new Glass();
				
				glass2.price=90;
				glass2.color="Green";
				glass2.size='M';
				glass2.type="Water Glasss";
				glass2.material="Plastic";
				glass2.capacity="300ml";
				
				
				boolean result=glass.equals(glass1);
				System.out.println(result);
				
				
				boolean result1=glass1.equals(glass2);
				System.out.println(result1);
				
				boolean result2=glass2.equals(glass);
				System.out.println(result2);
				
				
				
				
				System.out.println("----Ladder-");

				Ladder ladder=new Ladder();
				ladder.color="Silver";
				ladder.price=2000;
				ladder.material="Aluminium";
				ladder.numberOfSteps=5;
				ladder.warranty=2;
				
				System.out.println("----1-");

				Ladder ladder1=new Ladder();
				
				ladder1.color="Silver";
				ladder1.price=4000;
				ladder1.material="Aluminium";
				ladder1.numberOfSteps=5;
				ladder1.warranty=2;
				
				System.out.println("----2-");
				
				Ladder ladder2=new Ladder();
				ladder2.color="Silver";
				ladder2.price=2000;
				ladder2.material="Wood";
				ladder2.numberOfSteps=10;
				ladder2.warranty=2;
				
				
				boolean other=ladder.equals(ladder1);
				System.out.println(other);
				
				boolean other1=ladder1.equals(ladder2);
				System.out.println(other1);
				
				boolean other2=ladder2.equals(ladder);
				System.out.println(other2);
				
				
				
				Plate plate=new Plate();
				
				plate.type="Dinner Plate";
				plate.price=100;
				plate.color="Silver";
				plate.material="Stainless Steel";
				plate.shape="Round";
				plate.disposable=false;	
				
				System.out.println("----1---");

				
				
				
Plate plate1=new Plate();
				
				plate1.type="Dinner Plate";
				plate1.price=100;
				plate1.color="plastic";
				plate1.material="Stainless Steel";
				plate1.shape="Round";
				plate1.disposable=true;		
			
				System.out.println("----2---");

				
Plate plate2=new Plate();
				
				plate2.type="Dinner Plate";
				plate2.price=100;
				plate2.color="Silver";
				plate2.material="Stainless Steel";
				plate2.shape="Square";
				plate2.disposable=false;
				
System.out.println("----Plate Comparisoin----");
				
				boolean hi=plate.equals(plate1);
				System.out.println(hi);
				
				
				boolean hi1=plate1.equals(plate2);
				System.out.println(hi1);
				
				boolean hi3=plate2.equals(plate);
				System.out.println(hi3);
				
				
				
				
				
				System.out.println("----Mug-");
				
				Mug mug=new Mug();
				
				mug.madeOf="Ceramic";
				mug.type="Coffe Mug";
				mug.price=200;
				mug.capacity="325 ml";
				mug.withHandle=true;
				mug.occasion="Birthday";
				
				
System.out.println("----1-");
				
				Mug mug1=new Mug();
				
				mug1.madeOf="Ceramic";
				mug1.type="Coffe Mug";
				mug1.price=250;
				mug1.capacity="325 ml";
				mug1.withHandle=true;
				mug1.occasion="Birthday";
				
				
System.out.println("----Mug-");
				
				Mug mug2=new Mug();
				
				mug2.madeOf="Ceramic";
				mug2.type="Coffe Mug";
				mug2.price=250;
				mug2.capacity="325 ml";
				mug2.withHandle=true;
				mug2.occasion="Birthday";
				
				
				boolean value=mug.equals(mug1);
				System.out.println(value);
				
				boolean value1=mug1.equals(mug2);
				System.out.println(value1);
				
				boolean value2=mug2.equals(mug);
				System.out.println(value2);
				
				
				
				Carrom carrom=new Carrom();
				
				
				carrom.price=1295;
				carrom.material="Wooden";//*
				carrom.size="Full";//*
				carrom.frameMaterial="Wooden";
				carrom.waterResistant=true;
				carrom.capacity="6kg";//*	
				
				Carrom carrom1=new Carrom();
				
				carrom1.price=2000;
				carrom1.material="Wooden";//*
				carrom1.size="Full";//*
				carrom1.frameMaterial="Wooden";//*
				carrom1.waterResistant=true;
				carrom1.capacity="6kg";	
				
				Carrom carrom2=new Carrom();
				
				carrom2.price=1295;
				carrom2.material="Wooden";//*
				carrom2.size="Full";//*
				carrom2.frameMaterial="Wooden";
				carrom2.waterResistant=true;
				carrom2.capacity="8kg";	
				
				
				boolean compare=carrom.equals(carrom1);
				System.out.println(compare);
				
				boolean compare1=carrom1.equals(carrom2);
				System.out.println(compare1);
				
				boolean compare2=carrom2.equals(carrom1);
				System.out.println(compare2);
				
				
				

				System.out.println("----Stand-");
				
				Stand stand=new Stand();
				
				stand.price=400;
				stand.loadCapacity="490g";
				stand.weight="320g";
				stand.warranty=2;
				stand.color="Brown";
				
				
             System.out.println("----1-");
				

             Stand stand1=new Stand();

             stand1.price=600;
             stand1.loadCapacity="490g";
             stand1.weight="320g";
             stand1.warranty=2;
             stand1.color="Black";
             				

             System.out.println("----2-");

             Stand stand2=new Stand();

             stand2.price=400;
             stand2.loadCapacity="490g";
             stand2.weight="320g";
             stand2.warranty=2;
             stand2.color="Black";	
             				
             	
			boolean fix=stand.equals(stand1);
				System.out.println(fix);
				
				boolean fix1=stand1.equals(stand2);
				System.out.println(fix1);
				
				boolean fix2=stand2.equals(stand);
				System.out.println(fix2);
				
				
				
				
				System.out.println("----Fan-");

	             Fan fan=new Fan();

	             fan.price=2500;
	             fan.brandName="Usha";
	             fan.numberOfBlades=3;
	             fan.color="Maroon";
	             fan.suitableFor="Indoor";
	             fan.remoteControl=true;	
	             
	             
	             System.out.println("----1----");

	             Fan fan1=new Fan();

	             fan1.price=2600;
	             fan1.brandName="Kansihka";
	             fan1.numberOfBlades=3;
	             fan1.color="White";
	             fan.suitableFor="Indoor";

	             fan1.remoteControl=false;	
	             
	             System.out.println("----2----");

	             Fan fan2=new Fan();

	             fan2.price=3500;
	             fan2.brandName="Usha";
	             fan2.numberOfBlades=3;
	             fan2.color="Maroon";
	             fan.suitableFor="Outdoor";

	             fan2.remoteControl=true;	
	             
	             				
	             	
				boolean stop=fan.equals(fan1);
					System.out.println(stop);
					
					boolean stop1=fan1.equals(fan2);
					System.out.println(stop1);
					
					boolean stop2=fan2.equals(fan);
					System.out.println(stop2);
				
				
			
				System.out.println("----Shoe-----");

					 Shoe shoe=new Shoe();

		             shoe.color="Pink";
		             shoe.price=600;
		             shoe.idealFor="Women";
		             shoe.occasion="Sports";
		             shoe.tipShape="Round";
		             shoe.brandName="Abros";	
		             
		              System.out.println("----1----");

		             Shoe shoe1=new Shoe();

		             shoe1.color="Pink";
		             shoe1.price=800;
		             shoe1.idealFor="Women";
		             shoe1.occasion="Casual";
		             shoe1.tipShape="Round";
		             shoe1.brandName="Bata";	
		             


		             System.out.println("----2----");

		             Shoe shoe2=new Shoe();

		             shoe2.color="Purple";
		             shoe2.price=1000;
		             shoe2.idealFor="Women";
		             shoe2.occasion="Casual";
		             shoe2.tipShape="Round";
		             shoe2.brandName="Bata";	
		             
		             				
		             	
					boolean shoes=shoe.equals(shoe1);
						System.out.println(shoes);
						
						boolean shoes1=shoe1.equals(shoe2);
						System.out.println(shoes1);
						
						boolean shoes2=shoe2.equals(shoe);
						System.out.println(shoes2);
					
						
						
						System.out.println("----Scoks------");
						
						Socks socks = new Socks();
						socks.brand="Adidas";
						socks.color="pink";
						socks.price=1000;
						socks.size='s';
						socks.type="anklet";
						socks.style="Classic";
						
						Socks socks1 = new Socks();
						socks1.brand="adidas";
						socks1.color="pink";
						socks1.price=1000;
						socks1.size='s';
						socks1.type="anklet";
						socks1.style="Classic";
						
						Socks socks2 = new Socks();
						socks2.brand="puma";
						socks2.color="white";
						socks2.price=500;
						socks2.size='m';
						socks2.type="low";
						socks2.style="retro";
						
						boolean sock=socks.equals(socks1);
						System.out.println(sock);
						
						boolean sock1 =socks.equals(socks2);
						System.out.println(sock1);
						
						boolean sock2 =socks1.equals(socks2);
						System.out.println(sock2);
						
						
						System.out.println("-----Lace------");
						
						Lace lace = new Lace();
						lace.brand="Lock Laces";
						lace.color="Yellow";
						lace.material="cotton";
						lace.length=120;
						lace.meter=9;
						lace.price=100;
						
						Lace lace1 = new Lace();
						lace1.brand="Lock Laces";
						lace1.color="Yellow";
						lace1.material="cotton";
						lace1.length=120;
						lace1.meter=9;
						lace1.price=100;
						
						Lace lace2 = new Lace();
						lace2.brand="Lify";
						lace2.color="White";
						lace2.material="Ployster";
						lace2.length=100;
						lace2.meter=12;
						lace2.price=200;
						
						boolean la=lace.equals(lace1);
						System.out.println(la);
						
						boolean la1 =lace.equals(lace2);
						System.out.println(la1);
						
						boolean la2 =lace1.equals(lace2);
						System.out.println(la2);
						
						
						System.out.println("_");
						
						Button button = new Button();
						button.shape="Round";
						button.material="Plastic";
						button.type="Shell";
						button.noOfPiece=12;
						button.size=8;
						button.color="Red";
						
						Button button1 = new Button();
						button1.shape="Round";
						button1.material="Plastic";
						button1.type="shell";
						button1.noOfPiece=12;
						button1.size=8;
						button1.color="Red";
						
						Button button3 = new Button();
						button3.shape="Square";
						button3.material="Wood";
						button3.type="Shank";
						button3.noOfPiece=22;
						button3.size=12;
						button3.color="Pink";
						
						boolean b =button.equals(button1);
						System.out.println(b);
						
						boolean b1 =button.equals(button3);
						System.out.println(b1);
						
						boolean b2 =button1.equals(button3);
						System.out.println(b2);
						
						
					}
				}
					
				
				
				

		


		
	


