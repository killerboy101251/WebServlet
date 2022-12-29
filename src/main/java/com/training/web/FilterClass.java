package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import com.training.web.service.LoginService;
import com.training.web.service.ServiceClassImpl;

/**
 * Servlet Filter implementation class FilterClass
 */
@WebFilter("/WelcomeServlet")
public class FilterClass extends HttpFilter implements Filter {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpFilter#HttpFilter()
     */
    public FilterClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String userName=request.getParameter("username");
		String password=request.getParameter("password");

		
//		 Connection conn = null;
//		 String un="root";
//        String pass="Mohanreddy123@";
//        String s = "jdbc:mysql://localhost:3306/mohan";
//        try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//        try {
//			conn=DriverManager.getConnection(s,un,pass);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//        
//       if(conn!=null)
//       {
//        out.println("<h1>"+"connection success"+"<h1>");
//       }
//        // demo table consists of two columns, so two '?' is used
//        PreparedStatement st=null;
//		 
//			try {
//				st = conn.prepareStatement("insert into mohan values(?)");
//				st.setString(1, userName);
//				st.executeUpdate();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//
//
//      
//
//       
//		
//	
		LoginService ser = new ServiceClassImpl();
		
	if(userName.equals("") || password.equals(""))
	{
			out.print("<h2>**Please fill the fields**<h2>");
			
	RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		
		rd.include(request, response);
	}
		else if(ser.isValid(userName, password)) {
			
			request.setAttribute("user", userName);
		
			chain.doFilter(request, response);
		}
		
		else {
			out.print("<h2>Incorrect login credential!!<h2>");
						RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
