package com.cts.order;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/orderroot")
public class OrderController {
	
	
	@GetMapping
	public String placeOrder() {
		
		return "order placed with product-service";
	}

}
