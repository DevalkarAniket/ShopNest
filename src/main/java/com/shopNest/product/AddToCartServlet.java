package com.shopNest.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shopNest.dbHandler.DataFetcher;

@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int pid = Integer.parseInt(req.getParameter("pid"));
			Product product = DataFetcher.getProductById(pid);
			HttpSession session = req.getSession();
			Cart cart = (Cart) session.getAttribute("cart");
			if (cart == null) {
				cart = new Cart();
				session.setAttribute("cart", cart);
			}
			cart.AddItem(product);
			resp.sendRedirect("cart.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
