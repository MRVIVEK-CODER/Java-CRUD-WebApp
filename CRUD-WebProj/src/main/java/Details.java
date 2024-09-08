import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Details
 */
@WebServlet("/Details")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String bid=req.getParameter("bid");
		String bname=req.getParameter("bname");
		String bprice=req.getParameter("bprice");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Book name:"+bname+"</h1>");
		out.println("<h1>Book price:"+bprice+"</h1>");
		
		String delURL="Delete?bid="+bid;
		out.println("<a href='"+delURL+"'>"+"Delete"+"</a>");
		
		String editURL="Edit?bid="+bid+"&bname="+bname+"&bprice="+bprice;
		out.println("<a href='"+editURL+"'>"+"Update"+"</a>");

		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}