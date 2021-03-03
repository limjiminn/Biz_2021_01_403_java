package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceV1;
import com.callor.shop.service.impl.MenuServiceV1;

public class CartEx_01 {

	public static void main(String[] args) {
		//MenuServiceV1을 사용하여 코드구현
		MenuService mService = new MenuServiceV1();
		//CartServiceV1을 사용하여 코드구현
		CartService cService = new CartServiceV1();

		while (true) {
			Integer intMenu = mService.selectMenu();
			if(intMenu == null) {
				break;	
			}else if (intMenu == 1) {
				cService.inputCart();
			} else if (intMenu == 2) {
				cService.printCart();
			} else if (intMenu == 3) {
				cService.userCart();
			}

		}
	}

}
