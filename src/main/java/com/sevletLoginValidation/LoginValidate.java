package com.sevletLoginValidation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginvalid")
public class LoginValidate extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		String emailId = "jspider@gmail.com";
		String passwo = "12345";
		
		if(email.equals(emailId) && pass.equals(passwo)) {
			Cookie c1 = new Cookie("Email", email);
			Cookie c2 = new Cookie("Password", pass);
			
			resp.addCookie(c1);
			resp.addCookie(c2);
			
			RequestDispatcher rd = req.getRequestDispatcher("welcome.html");
			rd.forward(req, resp);					
		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("Invalid Crenditials");
			
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, resp);
		}
	}
}
