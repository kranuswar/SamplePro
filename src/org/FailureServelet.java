package org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FailureServelet
 */
public class FailureServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FailureServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext cxt=getServletContext();
		String myphone=cxt.getInitParameter("phone");
		String myproductions=cxt.getInitParameter("productions");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("Invalid Password!!");
		
		pw.println("<br>phone "+myphone);
		pw.println(" <br>productions: "+myproductions);
		
		pw.close();
	}

	

}
