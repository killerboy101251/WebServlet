package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mohan
 */
@WebServlet("/Mohan12")
public class Mohan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mohan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    ServletConfig config=getServletConfig();
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		String dob=request.getParameter("dob");
		String address=request.getParameter("address");
		String qualification=request.getParameter("qualification");
		String hobbies=request.getParameter("hobbies");
			String listofcertifications=request.getParameter("listofcertifications");
		
		response.setContentType("text/html");
//		PrintWriter out =response.getWriter();
	
//		if(userName.equals("") || password.equals("") || dob.equals("") || address.equals("") ||  qualification.equals("")|| hobbies.equals("") ||  listofcertifications.equals(""))
//		{
//			out.print("<h2>**Please fill the fields**<h2>");
//			
//			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
//			
//			rd.include(request, response);
//		}
//		else if(userName.equals("Mohan") && password.equals("12345678")) {
//			
//			request.setAttribute("user", userName);
//			RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
//			rd.forward(request, response);
//			
//			//response.sendRedirect("WelcomeServlet");
//		}
//		
//		else {
//			out.print("<h2>Incorrect login credential!!<h2>");
//			
//			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
//			rd.include(request, response);
//		}
//		
//		String name = config.getInitParameter("NAME");
//		
//		out.println("<h1>"+userName+"</h1>");
//		out.println("<h1>"+name+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
