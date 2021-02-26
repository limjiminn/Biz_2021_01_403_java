package com.callor.oop.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 { 
	List<CartVO> cartList = new ArrayList<CartVO>();
	Scanner scan = new Scanner(System.in);
	
	public void inputCart() {
		System.out.println("===================================");
		System.out.println("쇼핑카트 상품 추가");
		System.out.println("-----------------------------------");
		
		System.out.print("구매자 >>");
		String strUerName = scan.nextLine();
		
		System.out.print("상품명 >> ");
		String strPName = scan.nextLine();
		
		int intQty = 0;
		
		while(true) {
		System.out.print("수량 >> ");
		String strQty = scan.nextLine();
		try {
			intQty = Integer.valueOf(strQty);
			if (intQty < 1) {
				System.out.println("수량은 1이상");
				continue;
			}
		} catch (Exception e) {
			System.out.println("수량은 숫자로 입력하세요");
		}
		
		}
		
		int intPrice = 0;
		while(true) {
		System.out.print("단가 >> ");
		String strPrice = scan.nextLine();
		try {
			intPrice = Integer.valueOf(strPrice);
			if(intPrice < 1000) {
				System.out.println("단가는 1000이상");
				continue;
			}
		} catch (Exception e) {
			System.out.println("수량은 숫자로 입력하세요");
		}
		
		}
		CartVO cartVO = new CartVO();
		cartVO.setCartUserName(strUerName);
		cartVO.setCartName(strPName);
		cartVO.setCartPrice(intPrice);
		cartVO.setCartQty(intQty);
	}
	
	public void printCartList() {
	
	System.out.println("====================================");
	System.out.println("구매자\t단품명\t단가\t수량");
	System.out.println("------------------------------------");
	

	int nSize = cartList.size();
	for(int i = 0; i < nSize; i++ ) {
		System.out.printf("%s\t%s\t%d\t%d\n",
				cartList.get(i).getCartUserName(),
				cartList.get(i).getCartName(),
				cartList.get(i).getCartPrice(),
				cartList.get(i).getCartQty());
	}
	
	
	
	}
	
}
