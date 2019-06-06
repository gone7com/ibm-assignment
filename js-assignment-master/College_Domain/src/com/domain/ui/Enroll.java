package com.domain.ui;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.service.Service;


@WebServlet("/enroll")
public class Enroll extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Service dbService = new Service();
		String id = request.getParameter("id");
		
		dbService.reduceSeatByOne(id);
		response.getWriter().println("successfully enrolled for the "+ new Service().getDomainName(id) +" training");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
