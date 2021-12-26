package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter // getid 등 그런 것들을 자동적으로 다 만들어줌 안보이므로 깔끔
@Setter // setid 등 ~~~
@AllArgsConstructor // 모든 전달인자를 포함한 생성자 생성해줌 

public class Customer {
	private String id;
	private String name;
	private String email;
	
}
