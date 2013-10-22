package org;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("user"); 
				String pwd= request.getParameter("pwd");
		String gender= request.getParameter("Gender");
		String[] favourite =request.getParameterValues("favourite");
		
				response.setContentType("text/html");
				PrintWriter pw=response.getWriter();
				pw.println("<html><body bgcolor='wheat'>");
				ArrayList<String> fruits=new ArrayList<String>();
				fruits.add("orange");
				fruits.add("guava");
				fruits.add("apple");
				fruits.add("banana");
				fruits.add("lichie");
				request.setAttribute("myfruits",fruits);
				
				if(pwd.equals("123"))
				{
					RequestDispatcher rd=request.getRequestDispatcher("SuccessSevlet");
					rd.forward(request,response);
					//pw.println("GENDER: "+gender+"<br>");
					//pw.println("Interested in:  <br>");//
					//for(String s:favourite)
					//{
					//	pw.println(s+"<br>");
					//}
				}
				else
				{ 
					RequestDispatcher rd=request.getRequestDispatcher("FailureServelet");
				    rd.forward(request,response);
					//response.sendRedirect("sample45.html");
				}
	}
}
	

	