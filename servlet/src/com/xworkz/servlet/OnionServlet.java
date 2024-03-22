package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet(name="OnionServlet",urlPatterns = "/onion",loadOnStartup = 2)
public class OnionServlet extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OnionServlet()
	{
		System.out.println("No parameter constructor in OnionServlet");
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("service method running in OnionServlet");
		System.out.println("Request:"+req.getRemoteAddr());
		System.out.println("Request:"+req.getRemoteUser());
		//super.service(req, res);
	}
	
}
