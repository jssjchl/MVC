package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.Customer;

public class CustomerService {
	private Map<String, Customer> customerMap; // key�� value�� ���� �ڷᱸ�� == key�� string �κ�, Customer �κ��� value
	
	private static final CustomerService instance = new CustomerService(); // �� Ŭ������ ��Ŭ������ ����� �ļ��ڿ� ����Ǵ� ���� ��ü�� ���� getinstance���� ��������
	

	public CustomerService() {
		customerMap = new HashMap<String, Customer>();
		// ket ���� string Ÿ�� value�� Customer

		addCustomer(new Customer("id001", "alice", "alice in the house"));
		addCustomer(new Customer("id002", "bob", "bob in the house"));
		addCustomer(new Customer("id003", "charlie", "charliein the house"));
		addCustomer(new Customer("id004", "deniel", "deniel in the house"));
		addCustomer(new Customer("id005", "trudy", "trudy in the house"));

		// Customer�� �ִ� �ʵ� id, name, email
		// AllargsConstructor�� ���� ���� �����ڸ� �̿��ϴ� ���̴�.

	}
	public static CustomerService getInstance() {
		return instance;
	}

	private void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerMap.put(customer.getId(), customer);
		// getid �޼��带 ���ؼ� �װ��� Ű������ ����Ѵ�. ex)id001
		// �� Ű ���� ������� customer ���� value������ ���
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
