package com.mega.mvn12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
/*
	@RequestMapping("login.mega")
	//login.mega랑 똑같으면 이하 메서드 불러와
	public void login(String id, String pw) {
		//login 괄호 안의 String은 index(부르는 jsp)의 input name과 동이해야 한다.
	}
*/
	@Autowired
	MemberDAO dao; // 스프링이 만들어놓은 싱글톤 객체의 주소를 넣어준다.
	
	@RequestMapping("login.mega")
	public String login(MemberDTO memberDTO) {
		//controller method내에 선언된 parameter는 무조건 프로토타입으로 만들어진다.
		System.out.println(memberDTO);
		System.out.println("싱글톤으로 만들어진 주소: " + dao);
		boolean result = dao.login(memberDTO);
		if(result) {
			return "ok"; //views/ok.jsp로 가세요
		} else {
			return "no";
		}
	}
	/*
	 * 순서: index.jsp --> MemberController check method --> views/ok.jsp
	 */
	@RequestMapping("check.mega")
	public String check(String nick) {
		
		if(nick.equals("superman")){
			return "super";
		} else {
			return "common";
		}
		
	}
	
	@RequestMapping("password.mega")
	public String pass(String pass) {
		System.out.println(pass);
		if(pass.equals("1234")) {
			return "pass";
		} else {
			return "redirect:index.jsp";
		}
	}
	
}
