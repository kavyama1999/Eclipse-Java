package computerparts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="jobformservlet",urlPatterns = "/job",loadOnStartup = 2)


public class JobFormServlet extends HttpServlet {
	
	
	
	public JobFormServlet()
	{
		System.out.println("No parameter Constructor In JobFormServlet");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		
		System.err.println("Service method running in JobFormServlet");
		
		 String fname = req.getParameter("firstname");
	        String lname = req.getParameter("lastname");
	        String dateofbirth = req.getParameter("dataofbirth");
	        String gender = req.getParameter("gender");
	        String position = req.getParameter("position");
	        String program = req.getParameter("program");
			
	        String confirm = req.getParameter("confirm");
	    	System.out.println("First Name :" + fname + "\n Last Name :"+lname+ "\n Date of birth  : " +dateofbirth+"\n gender :" +gender+	"\n position : "  +position+"\n Programming Language : "+ program +"\n Confirm :"+confirm);


		
		PrintWriter writer=resp.getWriter();
		//resp.setContentType("text/plain");
		resp.setContentType("text/html");

		//writer.write("Application is Processing");
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
	    //writer.write("<body class=\"bg-secondary\">");
	    writer.write("<body>");
	    writer.write("<div class=\"container\">");
	    
	    writer.write("<div class=\"text-dark\">");
	    writer.write("<br>");
	    writer.write("<b>Application is processing</b>");
	    //writer.write("<b>Computer Parts Application is processing...</b>"+"\n");
	    writer.write("<br>");
	    
	   //writer.write(" <b> Total  Cost :</b> " + totalCost +"\n");
	   writer.write("</div>");
	   
		//writer.write("<b>Total Cost:</b>"+"\n"+totalCost);

 writer.write("<br>");
 writer .write("<div class=\"text-dark\">");
	//writer.write("<b>Customer Id</b> :" + customerId + "<br> <b>Select Vendor </b>:"+vendor+ "<br><b> Reacharge Amount  :</b> " +recharge+"<br><b> Reacharge Type :</b>" +recharge1+"<br><b> Accept :</b>"+accept);
	writer.write("<b>First Name :</b>" + fname + "<br> <b>Last Name :</b>"+lname+ "<br> <b>Date of birth  : </b>"
	+dateofbirth+"<br>  <b>gender :</b>" +gender+	"<br> <b>position :</b> "  +position+"<br> <b>Programming Language : </b>"+ program +"<br> <b>Confirm :</b>"+confirm);

	 writer.write("</div>");

	    writer.write("</div>"); // closing container div

	    writer.write("</body>");
	    writer.write("</html>");

	    
		
	

	}
}
