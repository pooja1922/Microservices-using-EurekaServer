package com.CartService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
