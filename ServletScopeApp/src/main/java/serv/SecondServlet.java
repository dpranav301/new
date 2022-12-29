package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String itm1=(String) request.getAttribute("reqData");
		HttpSession session = request.getSession(true);
		String itm2=(String) session.getAttribute("SessionData");
		ServletContext sc=request.getServletContext();
		String itm3=(String) sc.getAttribute("contextData");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>In Request Object: "+itm1+" </h1>");
		out.print("<h1>In Session Object: "+itm2+" </h1>");
		out.print("<h1>In ServletContext Object: "+itm3+" </h1>");
		out.flush();
		out.close();
	}

}
