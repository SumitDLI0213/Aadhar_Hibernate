package com.digit.hibernateServlet.controller;

import java.io.IOException;

import org.hibernate.Hibernate;

import com.digit.hibernateServlet.bean.AadharDetails;
import com.digit.hibernateServlet.model.HibernateManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Reg")
public class Register  extends HttpServlet
{
	   @Override
	    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	       {           
	          AadharDetails ad=new AadharDetails();
	          HibernateManager hm=new HibernateManager();
	          ad.setAadhar_id(Integer.parseInt(req.getParameter("aadhar_id")));
	          ad.setName(req.getParameter("name"));
	          ad.setFather_name(req.getParameter("father_name"));
	          ad.setMother_name(req.getParameter("mother_name"));
	          ad.setDob(req.getParameter("dob"));
	          ad.setAddress(req.getParameter("address"));
	          ad.setCity(req.getParameter("city"));
	          ad.setPincode(Integer.parseInt(req.getParameter("pincode")));

	          boolean b= hm.saveObj(ad);
	          {
	        	  if(b==true)
	        	  {
	        		  resp.sendRedirect("/Aadhar_Hibernate_Git/registersucces.html");
	        	  }
	        	  else
	        	  {
	        		  resp.sendRedirect("/Aadhar_Hibernate_Git/index.html");

	        	  }
	          }
	         
	    }
}
