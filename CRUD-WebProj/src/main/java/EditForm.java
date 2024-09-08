import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditForm
 */
@WebServlet("/EditForm")
public class EditForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String bid=req.getParameter("bid");
		String bname=req.getParameter("bname");
		String bprice=req.getParameter("bprice");

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","newuser","P@ssw0rd2024!");

			PreparedStatement pst=con.prepareStatement("UPDATE book1 SET bname=?,bprice=? WHERE bid=?");
			pst.setString(1, bname);
			pst.setString(2, bprice);
			pst.setString(3, bid);
			pst.executeUpdate();
			out.println("Book updated sucessfully");
			out.println("<a href=\"Display\">Show Book</a>");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}