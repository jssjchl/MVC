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
		String customerId = request.getParameter("customerId"); // loginform�� ���ؼ� �Է¹��� "customerId"��� �̸��� ���� ����  String customerId�� �����Ѵ�. 
		//CustomerService service = new CustomerService(); // service ��ü�� ����� CustomerService Ŭ���� ȣ��, ������ ������ ���ο� ��ü�� ��������
		//�� ������� �����ϰ� �Ǹ� �Ź� ���ο� ��ü�� ����� ������ �Ź� ���ο� �ؽø��� ������
		CustomerService service = CustomerService.getInstance(); // CustomerService���� �̱��������� ������ �� �װ��� �������� ���� ���, static�� ���� �Ź� ���ο� ��ü�� ������ �ʰ� ����� ��ü�� ����Ѵ�.
		
		System.out.println(service);
		Customer customer = service.findCustomer(customerId); // CustomerService�� findCostomer �޼��带 ȣ���Ͽ� loginform�� ���� �Է¹��� customerId���� ������ ���������� �о�´�.

		List<Customer> customerList = service.SelectAll();
		request.setAttribute("all", customerList);
		request.setAttribute("customer", customer);
		request.setAttribute("customerId", customerId);
		// setAtribute�� ���ؼ� "customer"��� Ű���� �����ؼ�
		//��ü customer�� ����� ���� value�� ���� ä�� view�� �Ѱ��� �� �ִ�. 
		//view �ʿ����� key���� ���ؼ� ����� value���� �ҷ��� �� �ִ�.
		String page;
		if (customer == null)
			page = "/view/error.jsp";
		else
			page = "/view/success.jsp";

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);

	}
}
