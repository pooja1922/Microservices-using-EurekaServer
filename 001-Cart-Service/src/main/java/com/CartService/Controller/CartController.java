package com.CartService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CartService.Service.CartService;
import com.CartService.dto.CartDTO;
import com.model.Cart;

@RequestMapping("CartService")
@RestController
public class CartController
{
@Autowired
private CartService service;

@GetMapping("/{cartId}")
public Cart getCartInfo(@PathVariable int cartId)
{
	return service.getCartInfo(cartId);
}
@GetMapping("/dto/{cartId}")
public CartDTO getcartInfoWithProductInfo(@PathVariable int cartId)
{
	return service.getcartInfoWithProductInfo(cartId);
}
	@GetMapping("/proxy-dto/{cartId}")
public CartDTO getCartInfoWithProductInfoProxy(@PathVariable int cartId) {
	return service.getCartInfoWithProductInfoProxy(cartId);
}
}
