package chapter03;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException {
		System.out.println("Init() Metods 가 수행 되었습니다.");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		System.out.println("doGet Metho 가 실행 되었습니다.");
	}
	
	public void destroy() {
		System.out.println("destroy Method 가 실행 되었습니다.");
	}
}