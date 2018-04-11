package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.User;
import database.Database;

/**
 * Servlet implementation class users
 */
@WebServlet("/RetrieveUsers")
public class RetrieveUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RetrieveUsers() {
        super();
    }
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Here");
		ArrayList<User> users = new ArrayList<User>();
		request.setAttribute("users", users);
		RequestDispatcher dispatch = request.getRequestDispatcher("/home.jsp");
		dispatch.forward(request, response);
		
		return;
	}
}
