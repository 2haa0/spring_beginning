package com.mega.mvc07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //어노테이션 Annotation
public class BbsController {
	
	@RequestMapping("bbs")
	//요청되는 가상주소("bbs")는 중복되면 spring이 헷갈려해서 중복 절대 안 된다.
	public void bbs(BbsDTO bbsDTO, String date) {
		System.out.println("컨트롤러 메서드 호출");
		System.out.println("컨트롤러에서 받은 번호" + bbsDTO.getbNo());
		System.out.println("컨트롤러에서 받은 제목" + bbsDTO.getTitle());
		System.out.println("컨트롤러에서 받은 내용" + bbsDTO.getContent());
		System.out.println("컨트롤러에서 받은 작성자" + bbsDTO.getWriter());
		System.out.println(date);
	}
}
