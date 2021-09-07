package sunbeam.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbeam.dao.BookDao;
import sunbeam.dao.LoginDao;
import sunbeam.pojo.Book;
import sunbeam.pojo.Login;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// business logic
		String username = req.getParameter("email");
		String password = req.getParameter("password");
		boolean authenticated = false;
		Login cust = null;
		try(LoginDao dao = new LoginDao()) {
			cust = dao.getLogin(username);
			if(password.equals(cust.getPassword()))
				authenticated = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(authenticated) {
			// (10) remember the logged in user name in cookie
//			Cookie c = new Cookie("uname", cust.getName());
//			c.setMaxAge(3600); // cookie will be persisted on client disk for next 1 hr (3600 sec)
//			resp.addCookie(c);
			resp.sendRedirect("register.html");
			
				 	// go to "subjects" --> SubjectServlet
			//// 	OR
			//RequestDispatcher rd = req.getRequestDispatcher("subjects");
			//rd.forward(req, resp);
			//System.out.println("Login successful.");
		} else {
			// presentation logic
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Login Failed</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("Invalid email or password.<br/><br/>");
			out.println("<a href='login.html'>Login Again</a>");
			out.println("</body>");
			out.println("</html>");
		}
	}
}
