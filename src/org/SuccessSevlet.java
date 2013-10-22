package org;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuccessSevlet
 */
public class SuccessSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext cxt=getServletContext();
		String myphone=cxt.getInitParameter("phone");
		String myproductions=cxt.getInitParameter("productions");
		
		String myweb=getInitParameter("website");
		String myadd=getInitParameter("address");
		String name= request.getParameter("user");
		String gender= request.getParameter("Gender");
		String[] favourite =request.getParameterValues("favourite");
		ArrayList<String> List=(ArrayList<String>)request.getAttribute("myfruits");
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
		System.out.println("<br>fruits are ");
		
		for(String s:List){
			pw.println(s+"\n ");
			
		}
		pw.println("<br>Website "+myweb);
		pw.println("<br>Address "+myadd);
		pw.println("<br>phone "+myphone);
		pw.println(" <br>productions: "+myproductions);
		pw.println("<body></html>") ;
				pw.close();
	}
}
