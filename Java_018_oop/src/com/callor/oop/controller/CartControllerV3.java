package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3 {

	public static void main(String[] args) {

		//CartVO 객체를 담을 cartList 리스트를 생성
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		//키보드를 통해 카트에 추가할
		//구매자이름, 상품명, 수량, 가격를 입력
		Scanner scan = new Scanner(System.in);
		CartVO cartVO = new CartVO();
		
		for(int i = 0; i < 3; i++) {
		
		cartVO = new CartVO();
		System.out.print("구매자 이름 >> ");
		//String userName = scan.nextLine());
			
		System.out.print("상품명 >> ");
		String pName =scan.nextLine();
		
		System.out.print("수량 >> ");
		cartVO.setCartQty(scan.nextInt());
		String count = scan.nextLine();
		System.out.print("가격 >> ");
		//3000이라고 입력하면 "3000"으로 입력되어
		//문자열이다
		String price = scan.nextLine();
		// "3000"문자열형 숫자를 정수 3000으로 변경하여
		// intPrice 변수에 저장
		int intPrice = Integer.valueOf(price);
		//cartVO.setCartUserName(userName);
		cartVO.setCartName(pName);
		cartVO.setCartQty(scan.nextInt());
		cartVO.setCartPrice(scan.nextInt());
		}
		

		//cartList에 출력
		System.out.println("==================================");
		System.out.println("장바구니 테스트");
		System.out.println("----------------------------------");
		for(int i = 3; i < 3; i ++) {
		cartVO = cartList.get(i);
		System.out.printf("%s\t%s\t%d\t%d\n" ,
				cartVO.getCartUserName(),
				cartVO.getCartName(),
				cartVO.getCartQty(),
				cartVO.getCartPrice());
		}
		
		
		
	}

}
