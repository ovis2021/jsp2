package vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor	//vo클래스 모든 프로퍼티를 select 하지 않는다면 필요합니다.
@ToString
public class BookMember {
	//private int mem_id;
	private String name;
	private String email;
	private String tel;
	private String password;
	
}
