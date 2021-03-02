package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {

	public static void main(String[] args) {
		//배열 지정
		CartVO[] cartVO = new CartVO[3];
		//배열을 변수에 저장해야한다.
		cartVO[0] = new CartVO();
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartDate("2021-02-26");
		cartVO[0].setCartTime("10:44:00");
		cartVO[0].setCartPName("초코파이");
		cartVO[0].setCartQty(10);
		cartVO[0].setCartStd("바나나맛");
		cartVO[0].setCartPrice(1000);
		cartVO[0].setCartTotal(1000 * 10);
		
		System.out.println(cartVO[0].toString());
		
		cartVO[1] = new CartVO();
		cartVO[1].setCartUserName("이몽룡");
		cartVO[1].setCartDate("2021-02-26");
		cartVO[1].setCartTime("11:30:00");
		cartVO[1].setCartPName("엄마손파이");
		cartVO[1].setCartQty(5);
		cartVO[1].setCartStd("오리지날");
		cartVO[1].setCartPrice(1200);
		cartVO[1].setCartTotal(1200 * 5);
		
		System.out.println(cartVO[1].toString());
		
		cartVO[2] = new CartVO();
		cartVO[2].setCartUserName("성춘향");
		cartVO[2].setCartDate("2021-02-26");
		cartVO[2].setCartTime("12:00:00");
		cartVO[2].setCartPName("포카칩");
		cartVO[2].setCartQty(10);
		cartVO[2].setCartStd("김치맛");
		cartVO[2].setCartPrice(2000);
		cartVO[2].setCartTotal(2000 * 10);
		
		System.out.println(cartVO[2].toString());
		//=====cartVO의 개수가 3인 상태
		//상품한가지를 더 카트에 넣고싶다
		cartVO = new CartVO[4];  //전에 만들어놨던 배열은 사라진다.
		
		cartVO[3] = new CartVO();
		cartVO[3].setCartUserName("홍길동");
		cartVO[3].setCartPName("바나나우유");
		
		System.out.println("=======================");
		System.out.println("카트 내용");
		System.out.println("-----------------------");
		for(int i = 0; i < cartVO.length ; i ++) {
			System.out.println(cartVO[i].toString());
		}
	}

}
