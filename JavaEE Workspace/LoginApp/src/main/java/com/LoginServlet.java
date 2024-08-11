package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		// receive value from form 
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		
		//created reference to navigate from one page to another 
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		
		// set response type as text as html by default plain text consider 
		response.setContentType("text/html");
		// convert password in reverse order 
		StringBuffer sb = new StringBuffer(password);
		password = sb.reverse().toString();  // convert password in reverse order. 
		
		// jdbc code 
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "saivarun");
		PreparedStatement pstmt = con.prepareStatement("select * from login where emailid=? and password=?");
		pstmt.setString(1, emailid);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			request.setAttribute("user",emailid );
			rd1.forward(request, response);
		}else {
			pw.println("Failure try once again!");
			rd2.include(request, response);
		}
		} catch (Exception e) {
			pw.print(e.getMessage());
			rd2.include(request, response);
		}
	}

}
