package cookies;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="cookieServlet",urlPatterns = "/cook",loadOnStartup = 2)

public class CookieServlet  extends HttpServlet{
	
	
	public CookieServlet()
	{
		System.out.println("No paratemers in CookieServlet");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Service method running in CookieServlet");
		
//		Cookie cookie=new Cookie("key","value");
//		cookie.setMaxAge(60*60);
//		resp.addCookie(cookie);
//		cookie.getName();
//		cookie.getValue();
//		
//		String name=req.getParameter("name");
//		System.out.println(name);
//		
//		RequestDispatcher dispatcher=req.getRequestDispatcher("cookieresult.jsp");
//		
//		req.setAttribute("name1", name);
//		dispatcher.forward(req, resp);
//		
		
		
		 String randomValue = getCookieValue(req, "myCookie");


	        if (randomValue == null) {
	            randomValue = generateRandomValue();


	            Cookie cookie = new Cookie("myCookie", randomValue);
	            cookie.setMaxAge(60 * 60);
	            resp.addCookie(cookie);
	        }

	        Cookie[] cookies = req.getCookies();
	        if (cookies != null && cookies.length > 0) {
	            for (Cookie receivedCookie : cookies) {
	                System.out.println("Received Cookie Name: " + receivedCookie.getName());
	                System.out.println("Received Cookie Value: " + receivedCookie.getValue());
	            }
	        } else {
	            System.out.println("No cookies found in the request.");
	        }
	    }

	    private String generateRandomValue() {
	        return UUID.randomUUID().toString();
	    }

	    private String getCookieValue(HttpServletRequest request, String cookieName) {
	        Cookie[] cookies = request.getCookies();
	        if (cookies != null) {
	            for (Cookie cookie : cookies) {
	                if (cookie.getName().equals(cookieName)) {
	                    return cookie.getValue();
	                }
	            }
	        }
	        return null;
	    }
	
		
	}


