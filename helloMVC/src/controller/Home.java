package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action =request.getParameter("action");
	//index.jsp에서 action객체의 값을 가져와 action에 저장
		String page = null;
		
		if(action.equals("login"))
			page = "/view/loginform.jsp"; //action값이 login이면 view폴더에 loginform 페이지저장
		else
			page = "/view/help.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		//포워딩해주는 역할 == 포워딩이란 받은 요청을 다른 쪽으로 위임하는 것
		dispatcher.forward(request, response);
		
	}

}
