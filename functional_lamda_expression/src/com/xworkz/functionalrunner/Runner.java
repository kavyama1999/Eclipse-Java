package com.xworkz.functionalrunner;

import com.xworkz.functional_lamda_expression.Bag;
import com.xworkz.functional_lamda_expression.Bat;
import com.xworkz.functional_lamda_expression.Book;
import com.xworkz.functional_lamda_expression.Cycle;
import com.xworkz.functional_lamda_expression.Fan;
import com.xworkz.functional_lamda_expression.Oil;
import com.xworkz.functional_lamda_expression.School;
import com.xworkz.functional_lamda_expression.Sky;
import com.xworkz.functional_lamda_expression.Umbrella;

public class Runner {

	public static void main(String[] args) {

		// using lamda Expression implemention
		Book book = () ->

		// if one statement no need body..
		System.out.println("No parameter and no return type in book interface");

		book.read();

		System.out.println("************************************");

		Bat bat = (name) -> {
			System.out.println("one parameter and no return type in bat interface");
			System.out.println("Playing:" + name);

		};
		bat.playing("Cricket");

		System.out.println("*******************************************");

		Oil oil = (price, brandName) -> {
			System.out.println("two parameter and no return type in Oil interface");
			System.out.println("Price:" + price);
			System.out.println("Brand Name:" + brandName);
		};

		oil.hairOil(100, "Parachoot");

		System.out.println("**********************************");

		Bag bag = (price, color, quantity) -> {
			System.out.println("three parmeters and no return type in bag interface");
			System.out.println("price:" + price);
			System.out.println("Color:" + color);
			System.out.println("Quantity:" + quantity);

		};

		bag.protecting(500, "Orange", "5kg");

		System.out.println("*********************************");

		Sky sky = () -> {

			System.out.println("no parameter and boolean retur type in Sky");

			return true;
		};

		// calling the method of functional interface
		boolean result = sky.hasBlueColor();
		System.out.println("Has SkyBlue Color:" + result);

		System.out.println("*********************************");

		School school = () -> {
			System.out.println("no parameter and int return type in school interface");
			return 10000;
		};
		int fees = school.schoolFees();
		System.out.println("School Fees:" + fees);

		System.out.println("*******************************************");

		Fan fan = () -> {
			System.out.println("no parameter and string return type in fan interface");
			return "Brown";
		};

		String clr = fan.fanColor();
		System.out.println("Fan Color:" + clr);

		System.out.println("*****************************************");

		Cycle cycle = (price) -> {
			System.out.println("one parameter and boolean return type in cycle interface");
			System.out.println("Cycle Price:" + price);
			return true;
		};

		boolean cy = cycle.hasBell(12000);
		System.out.println("Has Bell:" + cy);

		System.out.println("***********************************");

		Umbrella umbrella = (price, color) -> {
			System.out.println("two parameter and double return type in umbrella interface");
			System.out.println("Price:" + price);
			System.out.println("Color:" + color);
			return 700.50d;
		};
		double db = umbrella.size(500, "Pink");

		System.out.println("Size:" + db);

	}

}
