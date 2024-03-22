package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="TomatoServlet",urlPatterns = "/tomato",loadOnStartup = 2)

public class TomatoServlet extends HttpServlet 

{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TomatoServlet()
	{
		System.out.println("No parameter constructor in TomatoServlet");
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("service mrthod running in TomatoServlet");
		System.out.println("Request:"+req.getRemoteAddr());
		System.out.println("Request:"+req.getRequestURI());
		//super.service(req, res);
	}
	
}
