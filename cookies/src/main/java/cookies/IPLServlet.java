package cookies;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="iplServlet",urlPatterns = "/match",loadOnStartup = 2)

public class IPLServlet extends HttpServlet {
	
	public IPLServlet()
	{
		System.out.println("No parametrs in IPLServlet ");
	}

	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Service method running in IPLServlet");
	
String matchno=	req.getParameter("matchno");
System.out.println(matchno);
	
String match=req.getParameter("match");
System.out.println(match);
	
String date=req.getParameter("date");
System.out.println(date);
	
String day=	req.getParameter("day");
System.out.println(day);
	
String time=req.getParameter("time");
System.out.println(time);
	
String venue=req.getParameter("venue");
System.out.println(venue);
	
String tosswinner=	req.getParameter("tosswinner");
System.out.println(tosswinner);
	
String winner=req.getParameter("winner");
System.out.println(winner);
	
String hometeam=req.getParameter("hometeam");
System.out.println(hometeam);
	
String awayteam=req.getParameter("awayteam");
System.out.println(awayteam);
	
String manofthematch=req.getParameter("manofthematch");
System.out.println(manofthematch);
	
String totalruns=req.getParameter("totalruns");
System.out.println(totalruns);
	
String innings=req.getParameter("innings");
System.out.println(innings);
	













RequestDispatcher dispatcher=req.getRequestDispatcher("IPLresult.jsp");

req.setAttribute("matchno1",matchno);
req.setAttribute("match1",match);
req.setAttribute("date1",date);
req.setAttribute("day1",day);
req.setAttribute("time1",time);
req.setAttribute("venue1",venue);
req.setAttribute("tosswinner1",tosswinner);
req.setAttribute("winner1",winner);
req.setAttribute("hometeam1",hometeam);
req.setAttribute("awayteam1",awayteam);
req.setAttribute("manofthematch1",manofthematch);
req.setAttribute("totalruns1",totalruns);
req.setAttribute("innings1",innings);



	
	
dispatcher.forward(req, resp);

	
	
	
	
	
	}
	
}
