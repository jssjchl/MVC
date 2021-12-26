package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.Customer;

public class CustomerService {
	private Map<String, Customer> customerMap; // key와 value를 가진 자료구조 == key는 string 부분, Customer 부분은 value
	
	private static final CustomerService instance = new CustomerService(); // 이 클래스를 싱클톤으로 만든다 셍성자에 저장되는 값을 객체로 만들어서 getinstance에서 리턴해줌
	

	public CustomerService() {
		customerMap = new HashMap<String, Customer>();
		// ket 값은 string 타입 value는 Customer

		addCustomer(new Customer("id001", "alice", "alice in the house"));
		addCustomer(new Customer("id002", "bob", "bob in the house"));
		addCustomer(new Customer("id003", "charlie", "charliein the house"));
		addCustomer(new Customer("id004", "deniel", "deniel in the house"));
		addCustomer(new Customer("id005", "trudy", "trudy in the house"));

		// Customer에 있는 필드 id, name, email
		// AllargsConstructor을 통해 만든 생성자를 이용하는 것이다.

	}
	public static CustomerService getInstance() {
		return instance;
	}

	private void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerMap.put(customer.getId(), customer);
		// getid 메서드를 통해서 그것을 키값으로 사용한다. ex)id001
		// 그 키 값을 기반으로 customer 값을 value값으로 사용
	}

	public Customer findCustomer(String id) {
		if (id != null)
			return (customerMap.get(id.toLowerCase()));
		else
			return null;
	}

	public List<Customer> SelectAll() {
		List<Customer> customerList = new ArrayList<Customer>(customerMap.values());
		
		return customerList;
	}
}
