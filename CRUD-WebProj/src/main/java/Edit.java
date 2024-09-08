import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
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
		
		out.println("<form action='EditForm' method='post'>");
		out.println("<table>");
		out.println("<tr><td>Id:</td><td><input type='hidden' name='bid' value='"+bid+"'/></td></tr>");
		out.println("<tr><td>Name:</td><td><input type='text' name='bname' value='"+bname+"'/></td></tr>");
		out.println("<tr><td>Price:</td><td><input type='text' name='bprice' value='"+bprice+"'/></td></tr>");

		out.println("<tr><td></td><td><input type='submit' value='Edit'></td>");
		out.println("</table>");
		out.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}