package com.passwordreset;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registrationservlet.UserDao;

@WebServlet("/PasswordResetServlet")
public class PasswordResetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PasswordResetServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confpassword = request.getParameter("confirmpassword");
		if (password.equals(confpassword)) {
			int result = UserDao.passwordreset(email, password);
			if (result == 1) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("passwordresetsuccess.jsp");
				dispatcher.forward(request, response);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("passwordresetfail.jsp");
				dispatcher.forward(request, response);
			}
		}
		else {
			RequestDispatcher dispatcher=request.getRequestDispatcher("passwordresetfail.jsp");
			dispatcher.forward(request, response);
		}
	}

}
