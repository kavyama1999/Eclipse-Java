package com.xworkz.genereicinterface.runner;

import java.util.function.BiFunction;

import com.xworkz.genereicinterface.BiFunctionCheck;

public class BiFunctionRunner {

	public static void main(String[] args) {

//		BiFunctionCheck bi=new BiFunctionCheck((a,c)->true);
//		bi.function();
//		bi.

		// implicit
		BiFunctionCheck bifun = new BiFunctionCheck((a, c) -> {
			System.out.println("Multiflication is :"+(a*c));
			return true;
		});
		bifun.function();

		System.out.println("****************Explicit****************");

		
		// explicit
		BiFunction<Integer, Integer, Boolean> b = (l, m) -> false;
//		{
//			return true;
//		};

		BiFunctionCheck bk = new BiFunctionCheck(b);
		bk.function();

		System.out.println("****************Explicit****************");

		
		
		
		
		
		
		
		
		// extra
//
//		BiFunction<Integer, Integer, Boolean> three = (s, k) -> {
//			System.out.println("Multiplication of s and k is:" + (s * k));
//			return true;
//		};
//		//three.apply(3, 2);
//		BiFunctionCheck crt = new BiFunctionCheck(three);
//		crt.function();

	}

}
