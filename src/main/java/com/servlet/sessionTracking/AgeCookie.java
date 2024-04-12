package com.servlet.sessionTracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ageCookie")
public class AgeCookie extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c1 = new Cookie("name", "Jaggu");
		Cookie c2 = new Cookie("age", "23");
		c1.setMaxAge(10);
		c2.setMaxAge(60);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		resp.getWriter().print("<h1>Cookies Added...</h1>");
	}
}
