package com.xworkz.formservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="vehicleFormServlet",urlPatterns = "/vehicle",loadOnStartup = 1)

public class VehicleFormServlet extends HttpServlet {
	
	public VehicleFormServlet()
	{
		System.out.println("no parameter in VehicleFormServlet");
	}

	
	
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Service methos running in VehicleFormServlet");
		
		String name=req.getParameter("name");
		String contactnumber=req.getParameter("contactnumber");
		String address=req.getParameter("address");
		String date=req.getParameter("date");
		String time=req.getParameter("time");
		String vehiclename=req.getParameter("vehiclename");
		String vehiclenumber=req.getParameter("vehiclenumber");
		String model=req.getParameter("model");
		String year=req.getParameter("year");
		String mileage=req.getParameter("mileage");
		
		//String type=req.getParameter("type");
	String type=req.getParameter("type");
 String type1=req.getParameter("type");
//		String brake=req.getParameter("brake");
//		
//		String enginetuneup=req.getParameter("enginetuneup");
//		String otherspecify=req.getParameter("otherspecify");
//		String fulidtopup=req.getParameter("fulidtopup");
//		String filterreplacement=req.getParameter("filterreplacement");
//		
//		String batterycheck=req.getParameter("batterycheck");
//		String wheelalignment=req.getParameter("wheelalignment");
//		String otherspecify1=req.getParameter("otherspecify");
		
		PrintWriter  writer=resp.getWriter();
		resp.setContentType("text/plain");
		writer.write("vehicle Service application is processing");//it will print in response
		
		System.out.println( "Name :"+ name +"\nContact_No :" + contactnumber+  "\nAddress :" + address + "\nDate :" + date + "\nTime :" 
				+ time + "\nVehicle_Name :" + vehiclename + "\nVehicle_No :" + vehiclenumber + "\nModel :" + model +
				"\nYear:" + year + "\nMileage :" + mileage  +"\nSelect type of Service:" +type);
				
		
//		System.out.println( "Name :"+ name +"\nContact_No :" + contactnumber+  "\nAddress :" + address + "\nDate :" + date + "\nTime :" 
//		+ time + "\nVehicle_Name :" + vehiclename + "\nVehicle_No :" + vehiclenumber + "\nModel :" + model + "\nYear:" + year + "\nMileage :" + mileage  +
//		"\nOilchange:" + oilchange+ "\nTirerotation:" +tirerotation+ "\nBrake:" +brake+ "\nEnginetuneup:" +enginetuneup+ "\nOtherspecify:"
//		+otherspecify+ "\nFulidtopup:" +fulidtopup+ "\nFilterreplacement:" +filterreplacement+ "\nBatterycheck :" +batterycheck+
//		"\nWheelalignment:" +wheelalignment+ "\nOtherspecify :" +otherspecify);
		
				//address + " "+ date + "" +time+ ""+vehiclename+ "" +vehiclenumber+ "" +model+ "" +year+ "" +mileage+ "" +oilchange+ "" +tirerotation+ "" +brake+ "" +enginetuneup+ ""+otherspecify+ "" +fulidtopup+ "" +filterreplacement+ ""  +batterycheck+ "" +batterycheck+ "" +otherspecify);
		//System.out.println("Name: " + name + "\nAge: " + address + " " + date + " " + time + " " + vehiclename + " " + vehiclenumber + " " + model + " " + year + " " + mileage + " " + oilchange + " " + tirerotation + " " + brake + " " + enginetuneup + " " + otherspecify + " " + fulidtopup + " " + filterreplacement + " " + batterycheck + " " + batterycheck + " " + otherspecify);

	}
}
