package com.digit.hibernateServlet.controller;

import java.io.IOException;
import com.digit.hibernateServlet.bean.AadharDetails;
import com.digit.hibernateServlet.model.HibernateManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/update")
public class updatecontroller extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AadharDetails ad=new AadharDetails();
        HibernateManager hm=new HibernateManager();
        
        String name=req.getParameter("name");
        String address=req.getParameter("address");
       int aadhar_id=(Integer.parseInt(req.getParameter("aadhar_id")));

        
        boolean b= hm.update(name,address,aadhar_id);

		if (b == true) 
		{
			resp.sendRedirect("/Aadhar_Hibernate_Git/updatesucces.html");
		} 
		else {
			resp.sendRedirect("/Aadhar_Hibernate_Git/updatesucces.html");

		}

	}
}
