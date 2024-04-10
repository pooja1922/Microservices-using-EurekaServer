package com.CartService.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.CartService.Repository.CartRepository;
import com.CartService.dto.CartDTO;
import com.CartService.proxy.ProductServiceProxy;
import com.model.Cart;

@Service
public class CartServiceIMPL implements CartService {
@Autowired 
private CartRepository repo;
@Autowired
private ProductServiceProxy proxy;

@Override
public Cart getCartInfo(int cartId) {
	
	return repo.findById(cartId).get();
}

@Override
public CartDTO getcartInfoWithProductInfo(int cartId) {
	Cart cart=repo.findById(cartId).get();
	Map<String,Integer> urivariables=new HashMap<String,Integer>();
	 urivariables.put("productId",cart.getProductId());
	 
	 ResponseEntity<CartDTO> response=new RestTemplate().getForEntity("http://localhost:8098/Product/{productId}", CartDTO.class,urivariables);
	
	 CartDTO dto=response.getBody();
	 
	 return new CartDTO(cart.getCartId(),cart.getProductId(),dto.getProductName(),dto.getProductPrice());
}

@Override
public CartDTO getCartInfoWithProductInfoProxy(int cartId) {
	Cart cart = repo.findById(cartId).get();
	
	CartDTO dto = proxy.retrieveProductData(cart.getProductId());
	
	return new CartDTO(cart.getCartId(), cart.getProductId(), dto.getProductName(), dto.getProductPrice());
}
}
