package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.UserMusicService;
import service.UserMusicServiceLogic;

@WebServlet("/addMyList.do")
public class AddMyList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserMusicService service;
	
	public AddMyList(){
		service = new UserMusicServiceLogic();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("userId");
		int musicId = Integer.parseInt(request.getParameter("id"));
		service.register(userId, musicId);
		
		response.sendRedirect("mylist.do");	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
