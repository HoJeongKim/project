package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;
import service.UserService;
import service.UserServiceLogic;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");

		UserService service = new UserServiceLogic();
		User user = service.find(loginId);

		if (user == null) {
			response.sendRedirect("list.do");
		} else if (user.getLoginId().equals(loginId) && user.getPassword().equals(password)) {
			HttpSession session = request.getSession(); // 디폴트 세션은 30분
			session.setAttribute("userId", loginId);
			response.sendRedirect("list.do");
		}

	}

}
