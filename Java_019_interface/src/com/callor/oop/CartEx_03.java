package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.impl.CartServiceImplV1;

public class CartEx_03 {
	public static void main(String[] args) {
		
		//업그레이드를 할때CartServiceImplV1()만 변경하면됨
		CartService cServ = new CartServiceImplV1();
		cServ.inputCart();
		cServ.printCart();
	}

}
