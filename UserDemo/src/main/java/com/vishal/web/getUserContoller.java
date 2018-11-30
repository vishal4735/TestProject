package com.vishal.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vishal.web.model.user;
import com.vishal.web.repo.userRepo;


public class getUserContoller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String name = request.getParameter("name");
		userRepo ur = new userRepo();
		user u1 = ur.getUser(name);
		
		RequestDispatcher rd = request.getRequestDispatcher("showUser.jsp");
		rd.forward(request, response);
		
		
		
		
	
	}

}
