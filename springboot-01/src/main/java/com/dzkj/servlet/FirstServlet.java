package com.dzkj.servlet;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * <servlet>
 * 	<servlet-name></servlet-name>
 * 	<servlet-class><servlet-class>
 * </servlet>
 *
 *<servlet-mapping>
 *	<servlet-name></servlet-name>
 *	<url-pattern></url-pattern>
 *</servlet-mapping>
 */

@WebServlet("/First")
public class FirstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println("First----被访问");
		out.flush();
		out.close();
	}

}