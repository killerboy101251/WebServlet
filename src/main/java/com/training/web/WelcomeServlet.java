package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String user = (String)request.getAttribute("user");
		out.print("<h1>Welcome "+user+"! You are successfully logged in </h1>");
		
		
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
//		String dob=request.getParameter("dob");
//		String address=request.getParameter("address");
//		String qualification=request.getParameter("qualification");
//		String hobbies=request.getParameter("hobbies");
//		String listofcertifications=request.getParameter("listofcertifications");
		out.println("<h1>"+"DETAILS OF THE  FROM:"+"<h1>");
		
		out.println("<h4>"+"Username :"+userName+"<h4>");
		out.println("<h4>"+"Password:"+password+"<h1>");
//		out.println("<h4>"+"dob:"+dob+"<h1>");
//		out.println("<h4>"+"address:"+address+"<h1>");
//		out.println("<h4>"+"qualification:"+qualification+"<h1>");
//		out.println("<h4>"+"hobbies:"+hobbies+"<h1>");
//		out.println("<h4>"+"listof certifications:"+listofcertifications+"<h1>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
