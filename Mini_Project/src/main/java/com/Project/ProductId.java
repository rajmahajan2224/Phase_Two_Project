package com.Project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ID")
public class ProductId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   		String url = "jdbc:mysql://localhost:3306/productid";
   		String driver = "com.mysql.cj.jdbc.Driver";
   		String username = "raj2298";
   		String password = "raj@1998";
   		
   		response.setContentType("text/html");
   		PrintWriter out = response.getWriter();
   		
   		String productid = request.getParameter("Pro_Id");
   		
   		String query = "select * from products where ProductId = ?";
   		out.print("<h1>Displaying the details of Product</h1>");
   		
   		out.print("<table border = '1'><tr><th>ProductId</th><th>Productname</th><th>Productprice</th></tr>");
		
   		try {
   			Class.forName(driver);
   			Connection dbcon = DriverManager.getConnection(url,username,password);
   			PreparedStatement ps = dbcon.prepareStatement(query);
   			
   			ps.setString(1, productid);	
   			ResultSet rs = ps.executeQuery();
   			
   			while(rs.next()) {
   				out.print("<tr><td>");
   				out.print(rs.getInt(1));
   				out.print("</td>");
   				out.print("<td>");
   				out.print(rs.getString(2));
   				out.print("</td>");
   				out.print("<td>");
   				out.print(rs.getInt(3));
   				out.print("</td>");	
     		}
   		}
   		catch(Exception e) {
   			System.out.println("Some issue : " + e.getMessage());
   		}
   		
   		out.print("<table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}
}
