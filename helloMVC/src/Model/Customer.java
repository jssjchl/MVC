package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter // getid �� �׷� �͵��� �ڵ������� �� ������� �Ⱥ��̹Ƿ� ���
@Setter // setid �� ~~~
@AllArgsConstructor // ��� �������ڸ� ������ ������ �������� 

public class Customer {
	private String id;
	private String name;
	private String email;
	
}
