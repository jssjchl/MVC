package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String customerId = request.getParameter("customerId"); // loginform을 통해서 입력받은 "customerId"라는 이름을 가진 값을  String customerId에 저장한다. 
		//CustomerService service = new CustomerService(); // service 객체를 만들어 CustomerService 클래스 호출, 실행할 때마다 새로운 객체를 만들어야함
		//이 방식으로 실행하게 되면 매번 새로운 객체를 만들기 때문에 매번 새로운 해시맵을 생성함
		CustomerService service = CustomerService.getInstance(); // CustomerService에서 싱글톤방식으로 구현한 후 그것을 가져오기 위한 방식, static을 통해 매번 새로운 객체를 만들지 않고 저장된 객체를 사용한다.
		
		System.out.println(service);
		Customer customer = service.findCustomer(customerId); // CustomerService에 findCostomer 메서드를 호출하여 loginform을 통해 입력받은 customerId값을 가지고 계정정보를 읽어온다.

		List<Customer> customerList = service.SelectAll();
		request.setAttribute("all", customerList);
		request.setAttribute("customer", customer);
		request.setAttribute("customerId", customerId);
		// setAtribute를 통해서 "customer"라고 키값을 지정해서
		//객체 customer에 저장된 값을 value로 가진 채로 view로 넘겨줄 수 있다. 
		//view 쪽에서는 key갑을 통해서 저장된 value값을 불러올 수 있다.
		String page;
		if (customer == null)
			page = "/view/error.jsp";
		else
			page = "/view/success.jsp";

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);

	}
}
