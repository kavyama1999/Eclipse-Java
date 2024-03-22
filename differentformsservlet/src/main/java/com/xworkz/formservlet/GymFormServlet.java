package com.xworkz.formservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="GymFormServlet",urlPatterns = "/click",loadOnStartup = 1)

public class GymFormServlet extends HttpServlet{

	
	
public GymFormServlet()
	 {
		 System.out.println("No parameter in GymFormServlet ");
		 
	 }


@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	System.out.println("Service method running in GymformServlet");
	String name=req.getParameter("name");
	System.out.println(name);
	String age=req.getParameter("age");
	System.out.println(age);
	String dateofbirth=req.getParameter("dateofbirth");
	System.out.println(dateofbirth);
	String gender=req.getParameter("gender");
	System.out.println(gender);
	String address=req.getParameter("address");
	System.out.println(address);
	String city=req.getParameter("city");
	System.out.println(city);
	String number=req.getParameter("number");
	System.out.println(number);
	
	//for response
	PrintWriter writer=resp.getWriter();
	resp.setContentType("text/plain");
	writer.write("Gym application form is processing");
	//writer.write("Name" +name+ " Age" +age);
	
	}
}
