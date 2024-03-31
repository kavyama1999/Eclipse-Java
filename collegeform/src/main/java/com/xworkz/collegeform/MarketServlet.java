package com.xworkz.collegeform;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="marketServlet",urlPatterns = "/items",loadOnStartup = 1)

public class MarketServlet extends HttpServlet {
	
	public  MarketServlet()
	{
		System.out.println("No parametrs in MarketServlet ");
	}

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
	System.out.println("Service method Running in MarketServlet");
	
	String name=req.getParameter("name");
	System.out.println(name);
	
	String location=req.getParameter("location");
	System.out.println(location);
	
	String city=req.getParameter("city");
	System.out.println(city);
	
	String pincode=req.getParameter("pincode");
	System.out.println(pincode);
	
	String area=req.getParameter("area");
	System.out.println(area);
	
	String type=req.getParameter("type");
	System.out.println(type);
	
	String stall=req.getParameter("stall");
	System.out.println(stall);
	
	String item=req.getParameter("item");
	System.out.println(item);
	
	String quality=req.getParameter("quality");
	System.out.println(quality);
	
	String quantity=req.getParameter("quantity");
	System.out.println(quantity);
	
	String cost=req.getParameter("cost");
	System.out.println(cost);
	
	String owner=req.getParameter("owner");
	System.out.println(owner);
	
	String keb=req.getParameter("keb");
	System.out.println(keb);
	
	String gst=req.getParameter("gst");
	System.out.println(gst);
	
	String weekly=req.getParameter("weekly");
	System.out.println(weekly);
	
	
	RequestDispatcher dispatcher =	req.getRequestDispatcher("MarketResult.jsp");//send to the jsp servlet
	req.setAttribute("name1", name);//add the data or information
	req.setAttribute("location1", location);
	req.setAttribute("city1", city);
	req.setAttribute("pincode1", pincode);
	req.setAttribute("area1", area);
	req.setAttribute("type1", type);
	
	req.setAttribute("stall1", stall);
	req.setAttribute("item1", item);
	req.setAttribute("quality1", quality);
	req.setAttribute("quantity1", quantity);
	req.setAttribute("cost1", cost);
	
	
	req.setAttribute("owner1", owner);
	req.setAttribute("keb1", keb);
	req.setAttribute("gst1", gst);
	req.setAttribute("weekly1", weekly);
	
	
	dispatcher.forward(req, resp);

	
	}
	
	
}




