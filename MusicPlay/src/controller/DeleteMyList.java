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

@WebServlet("/deleteMyList.do")
public class DeleteMyList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserMusicService service = new UserMusicServiceLogic();
		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("userId");
		int musicId = Integer.parseInt(request.getParameter("id"));
		service.remove(userId, musicId);
		
		response.sendRedirect("mylist.do");	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
