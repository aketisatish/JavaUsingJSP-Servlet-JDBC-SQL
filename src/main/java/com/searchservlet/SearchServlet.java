package com.searchservlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registrationservlet.UserDao;
import com.registrationservlet.UserData;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// call Dao layer

		ResultSet set = UserDao.searchByName("satish");
		List<UserData> userdt = new ArrayList<>();
		if (set != null) {
			try {
				while (set.next()) {
					UserData userdetails = new UserData(set.getString(1), set.getString(2), set.getString(3),
							set.getString(4), set.getString(5), set.getString(6), set.getString(7), set.getString(8),
							set.getString(9));
					userdt.add(userdetails);
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

			request.setAttribute("users", userdt);
			RequestDispatcher dispatcher = request.getRequestDispatcher("viewsuccess.jsp");
			dispatcher.forward(request, response);

		} else {
			request.setAttribute("users", userdt);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("searchfail.jsp");
			requestDispatcher.forward(request, response);
		}

	}
}