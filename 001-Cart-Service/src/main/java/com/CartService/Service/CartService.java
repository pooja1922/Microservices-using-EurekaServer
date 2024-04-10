package com.CartService.Service;

import com.CartService.dto.CartDTO;
import com.model.Cart;

public interface CartService {

	Cart getCartInfo(int cartId);

	CartDTO getcartInfoWithProductInfo(int cartId);

	CartDTO getCartInfoWithProductInfoProxy(int cartId);

}
