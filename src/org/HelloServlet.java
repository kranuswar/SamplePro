package org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("user");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.println("<html><body><body bgcolor='yellow'>");
		pw.println("Welcome "+name);
		pw.println("<br><br>");
		pw.println("To JEE World");
		pw.println("</body></html>");
		pw.close();	
		
	}

}
