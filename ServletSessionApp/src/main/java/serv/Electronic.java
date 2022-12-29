package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Electronic")
public class Electronic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String itm1=request.getParameter("item1");
		String itm2=request.getParameter("item2");
		HttpSession session=request.getSession(true);
		if(itm1!=null)
		{
			session.setAttribute("fan",itm1);
		}
		if(itm2!=null)
		{
			session.setAttribute("cooler", itm2);
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Electronic</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form action='Bill' >");
		out.print("<h2><input type='checkbox' name='item1' value='pc' >PC</h2>");
		out.print("<h2><input type='checkbox' name='item2' value='mobile' >MOBILE</h2>");
		out.print("<h2><button type='submit' >Next</button></h2>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
