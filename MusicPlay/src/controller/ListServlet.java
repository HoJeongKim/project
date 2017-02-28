package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Music;
import service.MusicService;
import service.MusicServiceLogic;

@WebServlet("/list.do")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MusicService service;
	
	public ListServlet(){
		service = new MusicServiceLogic();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Music> list = service.findAll();
		request.setAttribute("musics",list);
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		List<Music> list = service.findByName(request.getParameter("searchName"));
		request.setAttribute("musics", list);
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

}
