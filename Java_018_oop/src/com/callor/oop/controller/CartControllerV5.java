package com.callor.oop.controller;



import com.callor.oop.service.CartServiceV1;

public class CartControllerV5 {

	public static void main(String[] args) {
		//CartServiceV1 클래스에 cartList 객체를 인스턴스변수로 선언
		
		CartServiceV1 cartList = new CartServiceV1();
		//inputCart() method를 선언하고
		
		cartList.inputCart();
		//키보드에서 상품정보를 입력 받은 후 cartList에 추가
		
		//수량은 2이상, 단가는 1000원 이상 만 가능(유효성검사)
		
		//printCariList() method 를 선언하여
		cartList.printCartList();
		//carList를 console에 출력

	}

}
