package com.hello.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("[LoginController] doGet()");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
	
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> 로그인을 성공적으로 수행 했습니다.</h1>");
		out.println("<h3> 환경합니다.</h3>");
		out.println("<p>아이디:" + uid + "</p>");
		out.println("<p>패스워드:" + pwd + "</p>");
		out.println("</body>");
		out.println("</html>");		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[LoginController] doPost()");
		//doGet(request, response);
		
		request.setCharacterEncoding("UTF-8");
		
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		
		request.setAttribute("uid", uid);
		request.setAttribute("pwd", pwd);
		request.setAttribute(pwd, response);	
		
		RequestDispatcher disp = request.getRequestDispatcher("login.jsp");
		disp.forward(request, response);
		
	}

}
