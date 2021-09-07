package sunbeam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbeam.dao.CustomerDao;
import sunbeam.pojo.Customer;

@WebServlet("/register") // register.html action="register"
public class RegisterServlet extends HttpServlet {
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
		try (CustomerDao dao = new CustomerDao()) {
			 String customerName = req.getParameter("customerName");
			 String customerAddress = req.getParameter("customerAddress"); 
			 String contactNo = req.getParameter("contactNo");
			 String date = req.getParameter("date");
			 String sareeQty = req.getParameter("sareeQty");
			 String sareeRate = req.getParameter("sareeRate");
			 String sareeTotal = req.getParameter("sareeTotal");
			 String shirtQty = req.getParameter("shirtQty");
			 String shirtRate = req.getParameter("shirtRate");
			 String shirtTotal = req.getParameter("shirtTotal");
			 String pantQty = req.getParameter("pantQty");
			 String pantRate = req.getParameter("pantRate");
			 String pantTotal = req.getParameter("pantTotal");
			 String topQty = req.getParameter("topQty");
			 String topRate = req.getParameter("topQty");
			 String topTotal = req.getParameter("topQty");
			 String jeansQty = req.getParameter("jeansQty");
			 String jeansRate = req.getParameter("jeansRate");
			 String jeansTotal = req.getParameter("jeansTotal");
			 String clothQty = req.getParameter("clothQty");
			 String clothRate = req.getParameter("clothRate");
			 String clothTotal = req.getParameter("clothTotal");
			 String finalTotal = req.getParameter("finalTotal");
			Date mydate = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(date).getTime());
			Customer cust = new Customer(0, customerName, customerAddress, contactNo, mydate, sareeQty, sareeRate, sareeTotal, shirtQty, shirtRate, shirtTotal, pantQty, pantRate, pantTotal, topQty , topRate , topTotal, jeansQty, jeansRate, jeansTotal, clothQty, clothRate, clothTotal, finalTotal);

			dao.insert(cust);
			resp.sendRedirect("register.html");
		} catch (Exception e) {
			e.printStackTrace();
			
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Register Failed</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("Failed to add new customer.<br/><br/>");
			out.println("<a href='register.html'>Try Again</a>");
			out.println("</body>");
			out.println("</html>");			
		}
	}
}
