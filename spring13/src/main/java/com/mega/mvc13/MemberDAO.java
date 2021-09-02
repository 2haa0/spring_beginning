package com.mega.mvc13;
/*
아는 어노테이션_ class가 내부에 있으므로 영대문자로 시작

@Repository
: 창고(저장), 싱글톤객체 생성(=주소 생성)후 spring에 model로 등록

@Controller
: 싱글톤객체 생성후 spring에 controller로 등록

@RequestMapping
:  요청한 주소와 동일한(mapping되는) 것을 찾아서 아래 정의된 method를 호출

@AutoWired
: 싱글톤객체 생성된 것 중에 해당타입 객체의 주소를 넣어줌.
: 즉, 선언 변수 위에 서술해준다.
: 이하 data type 선언된 것을 갖고 찾는다. 
*/

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // 창고를 의미, 싱글톤 주소 "한 개" 생성
/*
 * 싱글톤으로 만들어 주기때문에 spring에서는 get instance해줄 필요없다.
 * 싱글톤으로 만들어 줄 객체가 아니면 어노테이션을 달지 않는다.
 */
public class MemberDAO { //DB에 CRUD
//method: 동적으로 처리해주는 기능의 단위
/*
 * 1. 프로토타입, 싱글톤인지 결정
 * 2. DB와 연계되는 class는 처리량이 많기 때문에 싱글톤으로 처리해야한다.
 * 3. 때문에 CRUD는 싱글톤
 */
	@Autowired //autowired 이하에는 싱글톤만
	SqlSessionTemplate myBatis; //마이바티스 클래스 생성
	
	
	public boolean login(MemberDTO dto) {
		//DB 연결 안 해놔서 못 가니까 일단 대충
		String dbId = "root";
		String dbPw = "1234";
		boolean result = false;
		if(dto.getId().equals(dbId) && dto.getPw().equals(dbPw)) {
			result = true;
		}
		return result;
	}
	
	public void create(MemberDTO memberDTO) {
		myBatis.insert("member.create", memberDTO);
	}
	
	public void read() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}


