package com.servlet.sessionTracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetchCookie")
public class FetchServlerCookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie [] c = req.getCookies();
		
		for(int i=0;i<c.length;i++) {
			Cookie c1 = c[i];
					
			System.out.println("Key :"+c1.getName());	
			System.out.println("value :"+c1.getValue());
		}
	}

}
