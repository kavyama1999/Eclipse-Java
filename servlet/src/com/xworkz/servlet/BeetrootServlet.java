package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="BeetrootServlet",urlPatterns ="/beetroot",loadOnStartup = 2 )



public class BeetrootServlet  extends HttpServlet
{

	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public BeetrootServlet()
	{
		System.out.println("No parameter Constructor in BeetrootServlet");
		//System.out.println("Next");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("Request:"+req.getRemoteAddr());
		System.out.println("Request:"+req.getRemoteUser());
		System.out.println("re:"+res.getHeaderNames());
		//super.service(arg0, arg1);
	}
	
}
