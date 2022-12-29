package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Electrical")
public class Electrical extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Electrical</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Electrical</h1>");
		out.print("<form action='Electronic'>");
		out.print("<h2><input type='checkbox'name='item1' value='fan'>FAN</h2>");
		out.print("<h2><input type='checkbox'name='item2' value='cooler'>Cooler</h2>");
		out.print("<button type='submit'>Next</button>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
