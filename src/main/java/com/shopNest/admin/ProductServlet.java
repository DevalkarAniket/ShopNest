package com.shopNest.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopNest.dbHandler.DataInjector;

@WebServlet("/addProd")

public class ProductServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int pid = Integer.parseInt(req.getParameter("pid"));
			String pname = req.getParameter("pname");
			String pdesc = req.getParameter("pdesc");
			int pprice = Integer.parseInt(req.getParameter("pprice"));
			String pimg = req.getParameter("pimg");
			DataInjector.addProduct(pid,pname,pdesc,pprice,pimg);
			resp.sendRedirect("admin.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
