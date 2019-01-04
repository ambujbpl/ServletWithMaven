package com.ideata.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LoginFilterPass
 */
public class LoginFilterPass implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilterPass() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println(" IN LoginFilterPass");
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
//		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		if(pass == null) 
		{
			out.println("Password Must be Required !");
		}
		else if(pass == "") 
		{
			out.println("Password Have some value !");
		}
		else
		{		
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
