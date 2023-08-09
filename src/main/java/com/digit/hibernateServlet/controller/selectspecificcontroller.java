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

@WebServlet("/specific")
public class selectspecificcontroller extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AadharDetails ad = new AadharDetails();
		HttpSession session = req.getSession(true);
		session.setAttribute("aadhnum", req.getParameter("aadhar_id"));
		HibernateManager hm = new HibernateManager();
		AadharDetails a = hm.selectspecific(Integer.parseInt(req.getParameter("aadhar_id")));

		session.setAttribute("name", a.getName());

		session.setAttribute("address", a.getAddress());

		session.setAttribute("city", a.getCity());

		session.setAttribute("father_name", a.getFather_name());

		session.setAttribute("dob", a.getDob());

		resp.sendRedirect("/Aadhar_Hibernate_Git/selectspecifc.jsp");



	}
}
