package com.xworkz.values;

import com.xworkz.values.example.Biscuit;
import com.xworkz.values.example.Location;
import com.xworkz.values.example.Monkey;
import com.xworkz.values.example.Tree;

public class Runner {

	public static void main(String[] args) {
		
		
		Tree tree=new Tree();
		tree.name="Mango";
		System.out.println(tree.name);
		
		tree.location=new Location();
		tree.location.area="Tinfactory";
		System.out.println(tree.location.area);
		
		tree.location.city="Bengaluru";
		System.out.println(tree.location.city);
		
		
		tree.monkey=new Monkey();
		tree.monkey.age=20;
		System.out.println(tree.monkey.age);
		
		tree.monkey.type="Gorilla";
		System.out.println(tree.monkey.type);
		
	tree.monkey.biscuit=new Biscuit();
	tree.monkey.biscuit.brand="BourBon";
	System.out.println(tree.monkey.biscuit.brand);
	
	tree.monkey.biscuit.cost=40.5d;
	System.out.println(tree.monkey.biscuit.cost);
	
	}

}


	
