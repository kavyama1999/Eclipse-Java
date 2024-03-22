package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="CarrotServlet", urlPatterns = "/carrot",loadOnStartup = 2)

public class CarrotServlet extends HttpServlet {
	
	
	public CarrotServlet()
	{
		System.out.println("no param Constructor in CarrotServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println(".....Service Running in CarrotServlet... ");
		System.out.println("Request:"+req.getRemoteAddr());
		//super.service(arg0, arg1);
	}

}
