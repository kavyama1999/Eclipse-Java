package com.xworkz.trycatch.runner;

import com.xworkz.trycatch.Movie;
import com.xworkz.trycatch.MovieTicketException;

public class MovieRunner {
	
	public static void main(String[] args) throws MovieTicketException {
		
		
		Movie mv=new Movie();
		
	//System.out.println("Before");
//		mv.MovieTickectNo(9944);//invalid  next statement will not execute
//		System.out.println("After");//to over come we can use try and catch block.
//		
		
		try
		{
			
			System.out.println("Before");
			mv.movieTickectNo(900);//if we give invalid it will stop the block then it will execute catch block
			System.out.println("After");
		}
		
		catch(Exception e)
		{
		System.out.println("Handle Event :" +e.getMessage());
		System.out.println(e.getClass());
			System.out.println("next");
		}
		
	}

}
