package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Music;
import service.MusicService;
import service.MusicServiceLogic;


@WebServlet("/detail.do")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MusicService service = new MusicServiceLogic();
		
		int musicId = Integer.parseInt(request.getParameter("id"));
		Music music = service.find(musicId);
		List<Music> list = new ArrayList<>();
		list.add(music);
		
		request.setAttribute("musics", list);
		request.getRequestDispatcher("detail.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
