package sunbeam.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbeam.dao.BookDao;
import sunbeam.dao.CustomerDao;
import sunbeam.pojo.Book;
import sunbeam.pojo.Customer;

@WebServlet("/logout") // ShowCartServlet --> a href="logout"
public class LogoutServlet extends HttpServlet {
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
		// presentation logic
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Thanks</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Thank you for using our services.<br/><br/>");
		out.println("<a href='login.html'>Login Again</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
