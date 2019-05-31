package Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		String username="Dheeraj Joshi";
String password="dj07";

String servletusername=request.getParameter("username");
String servletpassword=request.getParameter("password");
if(username.equals(servletusername)&&password.equals(servletpassword)) {
	response.getWriter().print("Loged in");
	request.getRequestDispatcher("/Loged.html").include(request, response);;
	
}else {
	response.getWriter().print("Wrong");
			request.getRequestDispatcher("/Loged.html").include(request, response);;
			
}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
