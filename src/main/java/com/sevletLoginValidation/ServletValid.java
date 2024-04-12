package com.sevletLoginValidation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class ServletValid extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] c = req.getCookies();
		
		if(c!=null) {
			RequestDispatcher rd = req.getRequestDispatcher("welcome.html");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.forward(req, resp);
		}
	}
}
