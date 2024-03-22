package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="ChilliServlet",urlPatterns = "/chilli",loadOnStartup = 2)

public class ChilliServlet extends HttpServlet 
{
	
	
	public ChilliServlet()
	{
		System.out.println("No parameter constructor in ChilliServlet");
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("Service method Running in ChilliServlet");
		System.out.println("Request:"+req.getRemoteAddr());
	}
	
	

}
