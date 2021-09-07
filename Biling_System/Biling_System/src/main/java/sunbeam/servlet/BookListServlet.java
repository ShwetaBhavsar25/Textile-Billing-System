package sunbeam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sunbeam.dao.CustomerDao;
import sunbeam.pojo.Customer;

@WebServlet("/display")
public class BookListServlet extends HttpServlet {
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
		List<Customer> list = new ArrayList<>();
		try (CustomerDao dao = new CustomerDao()) {
			list = dao.getCustomer();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// presentation logic
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Sagar Collection</title>");
		out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
		
		
		out.println("</head>");
		out.println("<body>");
		out.println("<div class='container-fluid'>");
		out.println("<div class='justify-content-center'>");
		out.println("<h1 class='text-center'>SAGAR COLLECTION</h1>");
		out.println("<h1 class='text-center'>KOPARGAON</h1>");
		
		out.println("<div class='row'>");
		out.println("<div class='col-4'>");
		out.println("Phone no.: 02423223380");
		out.println("</div>");
		out.println("<div class='col-4'>");
		out.println("GST no.: 2356987412");
		out.println("</div>");
		out.println("<div class='col-4'>");
		out.println("Email: sagar@gmail.com");
		out.println("</div>");
		out.println("</div>");
				
		
		
		out.println("<div class='container-fluid'>");
		out.println("<div class='row'>");
		out.println("<div class='col-6'>");
		out.println("<p class='display-5'>Bill History</p>");
		
		out.println("</div>");
		out.println("<div class='col-6 text-end'>");
		out.println("<a class='btn btn-success' href='register.html'>Create New Bill</a>");
		out.println("<a class='btn btn-danger' href='login.html'>Log Out</a>");
		
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		
		out.println("</div>");
		out.println("</div>");
		out.println("<table class='table table-responsive table-striped table-hover table-bordered border-dark p-3' border='1'>");
		out.println("<thead>");
		out.println("<tr>");
		out.println("<th>Id</th>");
		out.println("<th>Name</th>");
		out.println("<th>Address</th>");
		out.println("<th>Contact no</th>");
		out.println("<th>Date</th>");
		out.println("<th>Saree Qty</th>");
		out.println("<th>Saree Rate</th>");
		out.println("<th>Saree Total</th>");
		out.println("<th>Shirt Qty</th>");
		out.println("<th>Shirt Rate</th>");
		out.println("<th>Shirt Total</th>");
		out.println("<th>Pant Qty</th>");
		out.println("<th>Pant Rate</th>");
		out.println("<th>Pant Total</th>");
		out.println("<th>Top Qty</th>");
		out.println("<th>Top Rate</th>");
		out.println("<th>Top Total</th>");
		out.println("<th>Jeans Qty</th>");
		out.println("<th>Jeans Rate</th>");
		out.println("<th>Jeans Total</th>");
		out.println("<th>Cloth Qty</th>");
		out.println("<th>Cloth Rate</th>");
		out.println("<th>Cloth Total</th>");
		out.println("<th>Final Total</th>");
		out.println("</tr>");
		out.println("</thead>");
		for (Customer b : list) {
			out.println("<tr>");
			out.printf("<td>%d</td>\r\n", b.getId());
			out.printf("<td>%s</td>\r\n", b.getCustomerName());
			out.printf("<td>%s</td>\r\n", b.getCustomerAddress());
			out.printf("<td>%s</td>\r\n", b.getContactNo());
			out.printf("<td>%s</td>\r\n", b.getDate());
			out.printf("<td>%s</td>\r\n", b.getSareeQty());
			out.printf("<td>%s</td>\r\n", b.getSareeRate());

			out.printf("<td>%s</td>\r\n", b.getSareeTotal());
			out.printf("<td>%s</td>\r\n", b.getShirtQty());
			out.printf("<td>%s</td>\r\n", b.getShirtRate());
			out.printf("<td>%s</td>\r\n", b.getShirtTotal());
			out.printf("<td>%s</td>\r\n", b.getPantQty());
			out.printf("<td>%s</td>\r\n", b.getPantRate());
			out.printf("<td>%s</td>\r\n", b.getPantTotal());
			out.printf("<td>%s</td>\r\n", b.getTopQty());
			out.printf("<td>%s</td>\r\n", b.getTopRate());
			out.printf("<td>%s</td>\r\n", b.getTopTotal());
			out.printf("<td>%s</td>\r\n", b.getJeansQty());
			out.printf("<td>%s</td>\r\n", b.getJeansRate());
			out.printf("<td>%s</td>\r\n", b.getJeansTotal());
			out.printf("<td>%s</td>\r\n", b.getClothQty());
			out.printf("<td>%s</td>\r\n", b.getClothRate());
			out.printf("<td>%s</td>\r\n", b.getClothTotal());
			out.printf("<td>%s</td>\r\n", b.getFinalTotal());
			

				

			out.println("</tr>");			
		}
		out.println("</table>");
		
		out.println("</body>");
		out.println("</html>");
	}
}

