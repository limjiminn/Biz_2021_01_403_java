package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceV1;
import com.callor.shop.service.impl.MenuServiceV1;

public class CartEx_01 {

	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceV1();
		CartService cService = new CartServiceV1();
		
		while(true) {
			String menu = mService.selectMenu();
			if(menu.equals("가")) {
				cService.inputCart();
			}else if(menu.equals("나")) {
				cService.printCart();
			}else if(menu.equals("다")) {
				cService.userCart();
			}
			
		}
	}

}
