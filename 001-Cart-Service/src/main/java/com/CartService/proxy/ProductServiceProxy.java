package com.CartService.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.CartService.dto.CartDTO;
import com.model.Cart;

@FeignClient(name ="Product-App")
public interface ProductServiceProxy {
	
	@GetMapping("/Product/{productId}")
	public CartDTO retrieveProductData(@PathVariable Integer productId);

}
