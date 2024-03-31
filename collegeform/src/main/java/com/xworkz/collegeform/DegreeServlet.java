package com.xworkz.collegeform;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="degreeServlet",urlPatterns = "/water",loadOnStartup = 1)

public class DegreeServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public DegreeServlet()
	{
		System.out.println("No parameters in DegreeServlet");
	}
	

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method running DegreeServlet");
		
	String	msg=req.getParameter("message");//values form form (parameter)
	System.out.print(msg);
	
	//request method
	RequestDispatcher dispatcher=req.getRequestDispatcher("message.jsp");
	req.setAttribute("m", msg);//key, value
	dispatcher.forward(req, resp);
	}

}
