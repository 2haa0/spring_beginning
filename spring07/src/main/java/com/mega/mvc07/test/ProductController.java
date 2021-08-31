package com.mega.mvc07.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("insert")
	public void product(ProductDTO productDTO) {
		System.out.println(productDTO);
	}

}
