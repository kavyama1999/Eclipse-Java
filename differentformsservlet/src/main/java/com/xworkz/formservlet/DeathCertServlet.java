package com.xworkz.formservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="DeathCertServlet",urlPatterns = "/death",loadOnStartup = 1)

public class DeathCertServlet extends HttpServlet{

	public DeathCertServlet()
	{
		System.out.println("No parameter in DeathCertServlet");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Service method running in DeathServlet");
		
	String name=req.getParameter("name");
	String age=req.getParameter("age");
	String dateofdeath=req.getParameter("dateofdeath");
	String  father= req.getParameter("father");
	String  mother= req.getParameter("mother");
	String  cause= req.getParameter("cause");
	String  applicant= req.getParameter("applicant");
	String  permanentaddress= req.getParameter("permanentaddress");
	String  gender= req.getParameter("gender");
	String  placeofbirth= req.getParameter("placeofbirth");
	
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/plain");
		writer.write("The Death certificate is currently being processed....");
	}
}
