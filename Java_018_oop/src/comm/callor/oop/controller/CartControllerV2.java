package comm.callor.oop.controller;

import comm.callor.oop.model.CartVO;

public class CartControllerV2 {

	public static void main(String[] args) {
		
		CartVO[] cartVO = new CartVO[3];
		
		cartVO[0] = new CartVO();
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartDate("2021-02-26");
		cartVO[0].setCartTime("10:44:00");
		cartVO[0].setCartName("초코파이");
		cartVO[0].setCartQty(10);
		cartVO[0].setCartStd("바나나맛");
		cartVO[0].setCartPrice(1000);
		cartVO[0].setCartTotal(1000 * 10);
		
		System.out.println(cartVO[0].toString());
		
		cartVO[1] = new CartVO();
		cartVO[1].setCartUserName("이몽룡");
		cartVO[1].setCartDate("2021-02-26");
		cartVO[1].setCartTime("11:30:00");
		cartVO[1].setCartName("엄마손파이");
		cartVO[1].setCartQty(5);
		cartVO[1].setCartStd("오리지날");
		cartVO[1].setCartPrice(1200);
		cartVO[1].setCartTotal(1200 * 5);
		
		System.out.println(cartVO[1].toString());
		
		cartVO[2] = new CartVO();
		cartVO[2].setCartUserName("성춘향");
		cartVO[2].setCartDate("2021-02-26");
		cartVO[2].setCartTime("12:00:00");
		cartVO[2].setCartName("포카칩");
		cartVO[2].setCartQty(10);
		cartVO[2].setCartStd("김치맛");
		cartVO[2].setCartPrice(2000);
		cartVO[2].setCartTotal(2000 * 10);
		
		System.out.println(cartVO[2].toString());
	}

}
