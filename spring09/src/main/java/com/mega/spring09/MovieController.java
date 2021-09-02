package com.mega.spring09;

import org.springframework.web.bind.annotation.RequestMapping;

public class MovieController {


	@RequestMapping("movie.do")
	public String movie(String movieTitle, String ticketPrice) {
		System.out.println( movieTitle + "은 " + ticketPrice + "원");
		if (Integer.parseInt(ticketPrice) >= 10000) {
			return "pay";
		} else {
			return "redirect:index.jsp";
		}
	}

}
