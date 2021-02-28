package com.callor.oop.controller;



import com.callor.oop.service.CartServiceV1;

public class CartControllerV5 {

	public static void main(String[] args) {
				
		CartServiceV1 cartList = new CartServiceV1();
		
		cartList.inputCart();
		
		cartList.printCartList();
	

	}

}
