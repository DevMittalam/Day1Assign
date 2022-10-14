package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login_serv")
public class Login_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter pw=response.getWriter(); 
		String name= request.getParameter("name");
		String pass= request.getParameter("psw");
		Connection_jdbc con;
		try {
			con = new Connection_jdbc();
			String u=con.check(name, pass);
			if(u.equals("user")) {
				Student s=con.getCourse(name,pass);
				request.setAttribute("detail",s);
			RequestDispatcher rp=request.getRequestDispatcher("userDetails.jsp");
			rp.forward(request, response);
			}
			else if(u.equalsIgnoreCase("admin"))
			{
				ArrayList<Student> s=con.getAll();
				request.setAttribute("list", s);
				RequestDispatcher rp=request.getRequestDispatcher("admin.jsp");
				rp.forward(request, response);
			}
			else {
				pw.println("<html><body>");  
				pw.println("<h4>Login Failed: Try again</h4>");
				pw.println("<a href='login.html'>login again</a>");
				pw.println("</body></html>");  
				pw.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
