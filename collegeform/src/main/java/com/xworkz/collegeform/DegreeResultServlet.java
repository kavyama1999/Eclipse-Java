package com.xworkz.collegeform;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//for standrad purpose we can write  samll letter

@WebServlet(name="degreeResultServlet",urlPatterns = "/dg",loadOnStartup = 1)
public class DegreeResultServlet  extends HttpServlet{
	
	
	public DegreeResultServlet()
	{
		System.out.println("No parameter in DegreeResultServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Service method in DegreeResultServlet");
		
		
		String name=req.getParameter("name");
		System.out.println(name);
		
		String email=req.getParameter("email");
		System.out.println(email);
		
		String college=req.getParameter("college");
		System.out.println(college);
		
		String degree=req.getParameter("degree");
		System.out.println(degree);
		
		String stream=req.getParameter("stream");
		System.out.println(stream);
		
		String percenatge=req.getParameter("percenatge");
		System.out.println(percenatge);
		

		
		
	RequestDispatcher dispatcher =	req.getRequestDispatcher("DegreeResult.jsp");//send to the jsp servlet
	req.setAttribute("name1", name);//add the data or information
	req.setAttribute("email1", email);
	req.setAttribute("college1", college);
	req.setAttribute("degree1", degree);
	req.setAttribute("stream1", stream);
	req.setAttribute("percenatge1", percenatge);
	
	dispatcher.forward(req, resp);
	
	
	}

}
