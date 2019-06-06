package com.domain.ui;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.bean.Domain;

import com.domain.service.Service;

@WebServlet(urlPatterns= {"/admin_action_add", "/admin_action_update", "/admin_action_remove"})
public class AdminWork extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String DomainId = request.getParameter("Domainid");
		String DomainName = request.getParameter("Domainname");
		String DomainSeats = request.getParameter("Domainseats");
		
		System.out.println("courseId: " + DomainId + " courseName: " + DomainName + " courseSeats: " + DomainSeats);
		
		if(DomainId==null || DomainName==null || DomainSeats==null)	{
			response.sendRedirect("admin");
		}
		else	{
			//Addition of new course
			if((!DomainId.equals("")) && (!DomainName.equals("")) && (!DomainSeats.equals("")))	{
				new Service().setDomain(new Domain(DomainId, DomainName, DomainSeats));
				response.getWriter().println("New Course Added!");
				request.getRequestDispatcher("admin").include(request, response);
			}
			//Updation of available seats
			else if((!DomainId.equals("")) && (!DomainName.equals("")) && (DomainSeats.equals("")))	{
				new Service().setSeatsAvailable(DomainId, DomainSeats);
				response.getWriter().println("Course Seats Added!");
				request.getRequestDispatcher("admin").include(request, response);
			}
			//Removal of course
			else if((!DomainId.equals("")) && (DomainName.equals("")) && (DomainSeats.equals("")))	{
				new Service().removeDomain(DomainId);
				response.getWriter().println("Domain Removed!");
				request.getRequestDispatcher("admin").include(request, response);
			}
			else	{
				response.getWriter().println("Correct option is not selected!");
				request.getRequestDispatcher("admin").include(request, response);
			}
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
