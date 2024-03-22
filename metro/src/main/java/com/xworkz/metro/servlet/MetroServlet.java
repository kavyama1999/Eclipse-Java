package com.xworkz.metro.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//name is not mandatory

@WebServlet(name="metroServlet",urlPatterns = "/click",loadOnStartup = 1)


public class MetroServlet extends HttpServlet{
	
	
	
	public MetroServlet()
	{
		System.out.println("No  argument constructor in MetroServlet");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Service method Running in Metroservlet");
		System.out.println("Request:"+req.getRemoteAddr());
		
		//respone code
		
		resp.setContentType("text/plain");
		PrintWriter writer=resp.getWriter();
		//write.write("this is writer class");
		//write.write("this is writer class");
		writer.write("this is written from servlet");
		
		
	}

}
