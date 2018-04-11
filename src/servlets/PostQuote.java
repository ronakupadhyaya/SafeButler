package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Quote;
import data.User;
import database.Database;

/**
 * Servlet implementation class users
 */
@WebServlet("/PostQuote")
public class PostQuote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PostQuote() {
        super();
    }
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Here");
		String option = request.getParameter("option");
		String price = request.getParameter("quote");
		String coverage = request.getParameter("coverage");
		String replacement = request.getParameter("extendedReplacement");
		String liability = request.getParameter("liability");
		String personalProperty = request.getParameter("personalProperty");
		String deductible = request.getParameter("deductible");
		Quote quote = new Quote(option, price, coverage, replacement, liability, personalProperty, deductible);
		
		return;
	}
}
