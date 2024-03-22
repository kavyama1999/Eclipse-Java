package com.xworkz.servlet1;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;//import


@WebServlet(name="FrameServlet", urlPatterns="/birds", loadOnStartup=1)

public class FrameServlet extends HttpServlet{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public FrameServlet()
	{
		System.out.println("no param constructor");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service running in FrameServlet..");
		System.out.println("request:"+req.getRemoteAddr());
	}
	

}