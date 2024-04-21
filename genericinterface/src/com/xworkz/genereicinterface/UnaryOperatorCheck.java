package com.xworkz.genereicinterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorCheck {
	
	private UnaryOperator<Integer> unaryoperator;
	
	public UnaryOperatorCheck(UnaryOperator<Integer> unary)
	{
		this.unaryoperator=unary;
	}
	
	public void oprator()
	{
		System.out.println("running in UnaryOperator<Integer");
		unaryoperator.
	}
	
	
}









//import java.util.function.UnaryOperator;
//
//public class Main {
//    public static void main(String[] args) {
//        // Lambda expression for UnaryOperator
//        UnaryOperator<Integer> square = (number) -> number * number;
//
//        // Test the lambda expression
//        int result = square.apply(5); // This will square the number 5
//        System.out.println("Result: " + result); // Output will be 25
//    }
//}

