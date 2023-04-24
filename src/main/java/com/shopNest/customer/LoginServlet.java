package com.shopNest.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String uName = req.getParameter("uname");
			String password = req.getParameter("password");
			boolean val = Validator.isValid(uName, password);
			if (val == true && uName.equals("Admin")) {
				resp.sendRedirect("admin.jsp");
			} else if (val == true) {
				resp.sendRedirect("home.jsp");
			} else {
				resp.sendRedirect("login.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
