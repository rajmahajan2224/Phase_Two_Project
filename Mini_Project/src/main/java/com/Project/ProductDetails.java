package com.Project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/prodetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String productId = request.getParameter("productId");
		String productName = request.getParameter("productName");
		String productPrice = request.getParameter("productPrice");
		
		HttpSession theSession = request.getSession();
		
		theSession.setAttribute("productId", productId);
		theSession.setAttribute("productName", productName);
		theSession.setAttribute("productPrice", productPrice);
		
		response.sendRedirect("mypro.jsp");
		
	}
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
