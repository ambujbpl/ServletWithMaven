package com.ideata.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ideata.dao.UserDao;
import com.ideata.model.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet 
{

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("I am in LoginController");
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		UserDao udao = new UserDao();
		User usr = udao.getUser(user,pass);
		System.out.println("user object : "+usr.toString());
		String uname = usr.getName();
		System.out.println("uname : "+uname);
		if((usr.getName() != "notFound") && (usr.getName() != null))
		{
			request.setAttribute("user", usr);
			HttpSession session = request.getSession();
			session.setAttribute("user", usr.getName());
			RequestDispatcher rd = request.getRequestDispatcher("showUser.jsp");
			rd.forward(request, response);	
		}
		else 
		{
			response.sendRedirect("login.jsp");
		}
		
	}

}
