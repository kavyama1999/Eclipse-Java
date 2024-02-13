package com.xworkz.things.runner;

import com.xworkz.things.Battery;
import com.xworkz.things.Colgate;
import com.xworkz.things.Paint;
import com.xworkz.things.Ring;
import com.xworkz.things.SwitchBoard;
import com.xworkz.things.Table;
import com.xworkz.things.Tie;

public class ThingsRunner {

	public static void main(String[] args) {

		//new Ring();
		
		Ring ring=new Ring();//1 possibility
		
		
	System.out.println(ring);//FQN with @hexadecimal nUmbers
	System.out.println(ring.hashCode());
      ring.color="silver";//updating
      ring.price=150;
	ring.weight="2 grams";
    System.out.println(ring);
System.out.println(ring.hashCode());
		
//2nd way
		Object object=new Ring();
System.out.println(object);
System.out.println(object.hashCode());
		
		ring.design();
		System.out.println(ring);
		
		System.out.println("---------------------------");
       
		
		
	Paint paint=new Paint(500,"Orange","Matte");
	
	
	System.out.println(paint);//by implicitly invoke toString method 
	System.out.println(paint.hashCode()); //reference same so hashcode is also same
	System.out.println(paint.toString()); //by explicitly invoke the toString method
	
	System.out.println(paint.hashCode());
	
	Paint paint1=new Paint(600,"Green","Matte");
	System.out.println(paint1);
	System.out.println(paint.hashCode());
	
	//other possibility
	
	Object obj=new Paint(500,"Orange","Matte");
	//obj.color();//the color is not defined in the object so it will show error
	System.out.println(obj);
	System.out.println(obj.hashCode());
	
	paint.dry();
	
	System.out.println("---Colgate---");
	
	Colgate colgate=new Colgate();
	System.out.println(colgate);//print 
	System.out.println(colgate.hashCode());
	
	colgate.flavour="Mint";
	colgate.price=60;
	colgate.sensitive=true;
	
	System.out.println(colgate);
	System.out.println(colgate.hashCode());// Explicitly invoke hashCode..gives some number ..
	//when re-update the values but hashCode  number is same
	//System.out.println(ref);
	
	colgate.whitening();
	
	
	System.out.println("-----Table-------");
	Table table=new Table();
	System.out.println(table);//give FQN like com.xworkz.things.Table@2ed94a8b(hexadecimal numbers)
	System.out.println(table.hashCode());
	//re-update
	table.material="Plastic";
	table.width=60;
	table.length=40;
	
	System.out.println(table);
	System.out.println(table.hashCode());
	
	table.table();
	
	
	System.out.println("---------Battery--------------");
	
	
	
	Battery battery=new Battery();
	System.out.println(battery);
	System.out.println(battery.hashCode());
	
	battery.charger();	
	
	battery.capacity=200;
	battery.voltage=52.45d;
	
	System.out.println(battery);
	System.out.println(battery.hashCode());
	
	//battery.charger();	
	
	System.out.println("-----Switch Board----");
	
	SwitchBoard sb=new SwitchBoard();
	System.out.println(sb);
	System.out.println(sb.hashCode());
	
	sb.numberOfSwitches=8;
	sb.brandName="Havells";
	sb.hasIndicatorsLights=true;
	
	System.out.println(sb);
	System.out.println(sb.hashCode());
	
	System.out.println("----Tie-----");
	
	Tie tie=new Tie();
	System.out.println(tie);
	System.out.println(tie.hashCode());
	
	tie.color="Marron";
	tie.material="Cotton";
	tie.pattern="Floral";
	
	System.out.println(tie);
	System.out.println(tie.hashCode());
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
}