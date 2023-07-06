package com.registrationservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/plain");
		
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String selectcountry = request.getParameter("selectcountry");
		String[] qualification = request.getParameterValues("qualification");
		String gender = request.getParameter("gender");
		String[] technologies = request.getParameterValues("technologies");
		String[] address = request.getParameterValues("address");
		String commentss = request.getParameter("commentss");
         String finalqual=String.join(",", qualification);
         String finaltech=String.join(",", technologies);
         String finaladdr=String.join(",", address);
          
         UserData user=new UserData(uname, password, email, selectcountry, finalqual, gender, finaltech, finaladdr, commentss);
	       int res = 0;
		try {
			res = UserDao.savedata(user);
		} catch (ClassNotFoundException | IOException | SQLException e) {
			
			e.printStackTrace();
		}
         if(res==1) {
        	 RequestDispatcher dispatcher=request.getRequestDispatcher("regsuccess.jsp");
        	 dispatcher.forward(request, response);
         }
         else {
        	 RequestDispatcher dispatcher=request.getRequestDispatcher("regfail.jsp");
        	 dispatcher.forward(request, response);
         }
	}

}
