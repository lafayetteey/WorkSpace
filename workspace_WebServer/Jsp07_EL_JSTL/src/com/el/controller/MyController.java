package com.el.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.el.score.Score;

//어노테이션으로 해당 command 를 받아준다	
@WebServlet("/controller.do")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MyController() {
        super();
    }  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. index 를 통해 전달되는 String command  를 받아준다
		//2. 넘어오는 commadn 값에 따라 controller에서 처리해준다
		
		String command = request.getParameter("command");
		System.out.println("[ command :" + command + " ]");
		
		
		if(command.equals("elpage")) {
			response.sendRedirect("basic-arithmetic.jsp");
		} else if (command.equals("eltest") ) {
			
			Score sc = new Score("김승진" , 100, 72, 85);
			
			request.setAttribute("score", sc);
			//servlet 에선 RequestDispatcher 로 데이터를 건네준다
			RequestDispatcher dispatch = request.getRequestDispatcher("eltest.jsp");
			//request 와 response를 eltest.jsp 와 같이 쓰겟다라는 뜻
			dispatch.forward(request, response);
							
		} else if(command.equals("jstlpage") ) {
			List<Score> res = new ArrayList<>();
			for(int i =1; i<6; i++) {
				Score sc = new Score("이름"+i , 70+i , 80+i , 90+i) ;
				res.add(sc);
			}
			request.setAttribute("list", res);
			RequestDispatcher dispatch = request.getRequestDispatcher("jstlpage.jsp");
			dispatch.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
