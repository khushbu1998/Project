package com.cts.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping
	public String getStatus() {
		return "product-service is Up";
	}

}
