package com.addnum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/accept")
	public class addnum extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
	      PrintWriter pw = response.getWriter();
	      int fnum = Integer.parseInt(request.getParameter("txtFnum"));
	      int snum = Integer.parseInt(request.getParameter("txtSnum"));
	      
	      int ans = fnum + snum;
	      pw.println("<h1 style=\"color:green;text-align:center\"> Sum of "+fnum+" and "+ snum + " is "+ ans +"</h1>");
					
	      }

	}
