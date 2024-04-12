package com.servlet.sessionTracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookies")
public class SessionTracking extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c = new Cookie("Batch", "A2");
		Cookie c1 = new Cookie("name","Jaggu");
		
		resp.addCookie(c);
		resp.addCookie(c1);
		
		resp.getWriter().write("<h1>Cookies Saved Successfully!</h1>");	
	}

}
