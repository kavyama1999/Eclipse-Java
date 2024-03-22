package computerparts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="ComputerPartsServlet",urlPatterns ="/computer",loadOnStartup = 1)
public class ComputerPartsServlet  extends HttpServlet{
	
	public  ComputerPartsServlet()
	{
		System.out.println("No parameter in ComputerPartsServlet ");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Service method running ComputerPartsServlet");
	

		String brand=req.getParameter("brand");
		System.out.println("Brand Name :"+brand);
		
		String model=req.getParameter("model");
		System.out.println("Model :"+model);
		
		String color=req.getParameter("color");
		System.out.println("Brand Name :"+color);
		
		String type=req.getParameter("type");
		System.out.println("Type :"+type);
		
		
		String ram=req.getParameter("ram");
		System.out.println("RAM :"+ram);
		
		
		String harddisk=req.getParameter("harddisk");
		System.out.println("Hard Disk :"+harddisk);
		
		String processor=req.getParameter("processor");
		System.out.println("Processor :"+processor);
		
		
		
		String generation=req.getParameter("generation");
		System.out.println("Generation :"+generation);
		
		
		String motherboard=req.getParameter("motherboard");
		System.out.println("Mother Board:"+motherboard);
		
		String cachesize=req.getParameter("cachesize");
		System.out.println("Cache Size :"+cachesize);
		
		String cost=req.getParameter("cost");
		System.out.println("Cost :"+cost);
		
 		String quantity=req.getParameter("quantity");
		System.out.println("Quntity :"+quantity);
	
	
	
	
		//String costString = req.getParameter("cost");
	    //System.out.println("Cost: "+cost);
	    double cost1 = Double.valueOf(cost);
	    if(cost1>60000)
	    {
	    	System.out.println("true");
	    }
	    else
	    {
	    	System.out.println("false");
	    }
	    	

	    //String quantityString = req.getParameter("quantity");
	   // System.out.println("Quantity: "+quantityString);
	    int quantity1 = Integer.parseInt(quantity);

    double totalCost = cost1 * quantity1;
    System.out.println("Total Cost: "+totalCost);

	    // Response
	    resp.setContentType("text/html");
	    PrintWriter writer = resp.getWriter();
//	    writer.write("Computer Parts Application is processing..."+"\n");
//	    writer.write("Total Cost: "+totalCost+"\n");

	
//		//for response
//		resp.setContentType("text/plain");
//        PrintWriter writer=resp.getWriter();
//        writer.write("Computer Parts Application is processing");
	    
//   
	    
	    writer.write("<html>");  
	    writer.write("<head>");
	    writer.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
	  
	    writer.write("</head>");
 // Navbar start
	    writer.write("<nav class=\"navbar navbar-dark bg-dark\">"); 
	    writer.write("<div class=\"container-fluid\">");
	    writer.write("<div class=\"navbar-header\">");
	    writer.write("<a class=\"navbar-brand\" href=\"computerparts.html\">Computer Parts</a>");
	    writer.write("<a class=\"navbar-brand\" href=\"index.html\">Home</a>");  

	    writer.write("</div>");
	    writer.write("</div>");
	    writer.write("</nav>");
	    
	    
	    // Navbar end
	    writer.write("<body >");
	    writer.write("<div class=\"container\">");
	    
	    writer.write("<div class=\"text-dark\">");
	    writer.write("<br>");
	    writer.write("<b>Computer Parts Application is processing...</b>"+"\n");
	    writer.write("<br>");
	    
	   writer.write(" <b> Total  Cost :</b> " + totalCost +"\n");
	   writer.write("</div>");
	   
		//writer.write("<b>Total Cost:</b>"+"\n"+totalCost);

    writer.write("<br>");


	    writer.write("</div>"); // closing container div

	    writer.write("</body>");
	    writer.write("</html>");

	    
	    
	    
	    
	    
}
	
}
