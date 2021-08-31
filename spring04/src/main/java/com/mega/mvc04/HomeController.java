package com.mega.mvc04;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping("create.do")
	public void create(BbsDTO dto) {
		System.out.println(dto.getNo());
		System.out.println(dto.getTitle());
		System.out.println(dto.getContent());
		System.out.println(dto.getWriter());
		
	}

}
