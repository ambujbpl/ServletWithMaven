package com.ideata.dao;

import java.util.Date;
import java.sql.*;
import com.ideata.model.User;

public class UserDao 
{
	public User getUser(String user, String pass)
	{
		// Instantiate a Date object
	    Date date = new Date();
		User u = new User();
//		u.setUsername("ambuj_dubey");
//		u.setCreate_date(date);
//		u.setEmail("ambuj.ideata@gmail.com");
//		u.setLastname("Dubey");
//		u.setName("Ambuj");
//		u.setPassword("admin123");
//		u.setPhone_number("9977554411");
//		u.setRole("admin");
//		u.setStatus("act");
//		u.setUser_id(101);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skfdb", "root", "admin");
			Statement st = con.createStatement();
			String query = "select * from user where username='" + user + "' AND password='" + pass +"'";
					System.out.println("query : "+query);
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) 
			{
				System.out.println("rs.next()");
				u.setUsername(rs.getString("username"));
				u.setCreate_date(rs.getDate("create_date"));
				u.setEmail(rs.getString("email"));
				u.setLastname(rs.getString("lastname"));
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
				u.setPhone_number(rs.getString("phone_number"));
				u.setRole(rs.getString("role"));
				u.setStatus(rs.getString("status"));
				u.setUser_id(rs.getInt("user_id"));
			}else {
				System.out.println("User not found");
				u.setName("notFound");
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
		return u;
	}
}
