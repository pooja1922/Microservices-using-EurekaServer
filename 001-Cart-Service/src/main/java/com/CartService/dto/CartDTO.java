package com.CartService.dto;

public class CartDTO {

	private int cartId;
	private int productId;
	private String productName;
	private String productPrice;
	
	public CartDTO(int cartId, int productId, String productName, String productPrice) {
		super();
		this.cartId = cartId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "CartDTO [cartId=" + cartId + ", productId=" + productId + ", productName=" + productName
				+ ", productPrice=" + productPrice + "]";
	}
	
}
