package com.xworkz.trycatch;
//custom Exception 
public class MovieTicketException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MovieTicketException()
	{
		super();
	}
	
	public MovieTicketException(String msg)
	{
		super(msg);
	}

}
