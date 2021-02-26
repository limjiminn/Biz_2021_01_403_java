package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3_01 {

	public static void main(String[] args) {
		List<CartVO> cartList = new ArrayList<CartVO>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++ ) {
			//제목 보이기
			System.out.println("");
			System.out.println("쇼핑카트 상품 추가");
			System.out.println("");
			
			//입력 받기
			System.out.println("구매자 >>");
			String strUerName = scan.nextLine();
			
			System.out.println("상품명 >> ");
			String strPName = scan.nextLine();
			
			System.out.println("수량 >> ");
			String strQty = scan.nextLine();
			int intQty = Integer.valueOf(strQty);
			
			System.out.println("단가 >> ");
			String strPrice = scan.nextLine();
			int intPrice = Integer.valueOf(strPrice);
			//카트 정보 생성
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(strUerName);
			cartVO.setCartName(strPName);
			cartVO.setCartPrice(intPrice);
			cartVO.setCartQty(intQty);
			
			//카트정보 리스트에 추가하기
			//cartVO.add(cartVO);
		}// end for
		
		System.out.println("====================================");
		System.out.println("구매자\t단품명\t단가\t수량");
		System.out.println("------------------------------------");
		//배열에서는 배열.length값을 참조하면 배열의 갯수를
		//알수있엇다.
		//List 에서는 list.size() method를 호출하면
		//		list 개수를 return해준다.
	
		int nSize = cartList.size(); //갯수를 세서 변수에 저장
		for(int i = 0; i < nSize; i++ ) {
			System.out.printf("%s\t%s\t%d\t%d\n",
					cartList.get(i).getCartUserName(),
					cartList.get(i).getCartName(),
					cartList.get(i).getCartPrice(),
					cartList.get(i).getCartQty());
		}
			
		System.out.println("====================================");
	}

}
