package com.java.assignment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/assignment1")
public class FetchDetails extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		Cookie c1 = new Cookie("Id", id);
		Cookie c2 = new Cookie("Name", name);
		Cookie c3 = new Cookie("Age", age);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.addCookie(c3);
		
		resp.getWriter().write("<h1>Cookies Added Suucessfully!</h1>");
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie[] c = req.getCookies();
		
		for(int i=0;i<c.length;i++) {
			Cookie cookie = c[i];
			
			System.out.println("Key :"+cookie.getName());
			System.out.println("Value :"+cookie.getValue());
		}
	}
}
