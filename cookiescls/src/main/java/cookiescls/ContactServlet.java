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

@WebServlet(name="contactServlet",urlPatterns = "/contactdetails",loadOnStartup = 2)

public class ContactServlet  extends HttpServlet{

	
	public ContactServlet()
	{
		System.out.println("no parameter in ContactServlet");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Service method running in ContactServlet ");
		
		String email=req.getParameter("email");
		System.out.println(email);
		
		String mobile=req.getParameter("mobile");
		System.out.println(mobile);
		
		
		
		//cookies
		String randomValue = getCookieValue(req, "Xworkz");

		if (randomValue == null)
		
		{
     resp.sendRedirect("error.jsp");
         return;
		
		}

		req.setAttribute("randomValue",randomValue);

		
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("details.jsp");
		req.setAttribute("email1", email);
		req.setAttribute("mobile1", mobile);
		
		dispatcher.forward(req, resp);
	}
	
	
//	private String generateRandomValue() 
//	{
//
//		String uuid= UUID.randomUUID().toString();
//		return uuid;
//		
	//}

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

		}

