package org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SourceServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public SourceServelet() {
        super();
       
    }
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("user");
		String gender= request.getParameter("Gender");
		String[] favourite =request.getParameterValues("favourite");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor='wheat'>");
		
		pw.println("NAME: "+name+"<br>");
		pw.println("GENDER: "+gender+"<br>");
		pw.println("Interested in:  <br>");
		for(String s:favourite)
		{
			pw.println(s+"<br>");
		}
	}

	

}
