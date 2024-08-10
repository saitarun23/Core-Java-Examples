package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String emailid=request.getParameter("emailid");		//receiving text field value
		String password = request.getParameter("password");
		response.setContentType("text/html");
		RequestDispatcher rd1=request.getRequestDispatcher("Home");
		RequestDispatcher rd2=request.getRequestDispatcher("login.html");
		
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			pw.print("Successfuly login with get");
			rd1.forward(request, response);
		}else {
			pw.println("failure try once again with get");
			rd2.include(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");  // receiving text field value
		String password = request.getParameter("password");
		response.setContentType("text/html");
		RequestDispatcher rd1=request.getRequestDispatcher("Home");
		RequestDispatcher rd2=request.getRequestDispatcher("login.html");
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			pw.print("Successfuly login with post");
			rd1.forward(request, response);
		}else {
			pw.println("failure try once again with post");
			rd2.include(request, response);
		}

	}

}
