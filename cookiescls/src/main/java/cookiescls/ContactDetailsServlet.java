package cookiescls;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="contactDetailsServlet",urlPatterns = "/contact",loadOnStartup = 2)

public class ContactDetailsServlet  extends HttpServlet{
	
	
	public ContactDetailsServlet()
	{
		System.out.println("no parameter in ContactDetailsServlet ");
	}

	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	
	{
		
		System.out.println("Service method running ContactDetailsServlet");
		
		String fname=req.getParameter("fname");
		System.out.println(fname);
		
		String lname=req.getParameter("lname");
		System.out.println(lname);
		
		
		
		
		
		String randomValue = getCookieValue(req, "Xworkz");

		if (randomValue == null)
		
		{

		randomValue = generateRandomValue();

		Cookie cookie = new Cookie("Xworkz", randomValue);

		cookie.setMaxAge(60 * 60);

		resp.addCookie(cookie);

		}

		req.setAttribute("randomValue",randomValue);

		
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("contactdetails.jsp");
		req.setAttribute("fname1", fname);
		req.setAttribute("lname1", lname);
		
		HttpSession session=req.getSession();
		session.setAttribute("fname1", fname);
		session.setAttribute("lname1", lname);
		
		dispatcher.forward(req, resp);
		
		
		
	}
	
	private String generateRandomValue() 
	{

		String uuid= UUID.randomUUID().toString();
		return uuid;
		
	}

		private String getCookieValue(HttpServletRequest request, String cookieName)
		
		{

		Cookie[] cookies = request.getCookies();

		if (cookies != null)
		{

		for (Cookie cookie : cookies)
		{

		if (cookie.getName().equals(cookieName))
		{

		return cookie.getValue();

		}

		}

		}

		return null;

		}
//1st page create next hogu we have to write for cookie in second page we have cookie idre next hogbeku illa andre error torsbeku
		}
	
	

