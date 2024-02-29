package com.xworkz.trycatch;

public class Movie {
	
	
	
	public void movieTickectNo(int ticketNo) throws MovieTicketException 
	{
		if(ticketNo > 0 && ticketNo < 5000)
		{
			System.out.println("Ticket Number is valid");
		}
		
		else
		{
			System.out.println("Ticket number is invalid");
			throw new MovieTicketException("Ticket number is not found");
		}
	}

}
