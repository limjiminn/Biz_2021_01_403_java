package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;


/*
 * CartServiceV1 클래스에 cartList 객체를 인스턴스변수로  선언
 * inputCart() method를 선언하고
 * 키보드에서 상품정보를 입력 받은 후 certList에 추가
 * 수량은 2이상, 단가는 1000원 이상만 가능
 * printCartList() method 를 선언하여
 * cartList 를 console에 출력
 */
public class CartServiceV1 {
	
	private List<CartVO> cartList = new ArrayList<CartVO>();
private CartVO cartVO;
	
	public void inputCart() {
	
	
	Scanner scan = new Scanner(System.in);
	cartVO = new CartVO();
	
	System.out.print("구매자 >> ");
	String userName = scan.nextLine();
	
	System.out.print("상품명 >> ");
	String strPName = scan.nextLine();
	
	int intQty = 0;
	while(true) {
		System.out.print("수량 >> ");
		String strQty = scan.nextLine();
		try {
			intQty = Integer.valueOf(strQty);
			if(intQty < 2) {
				System.out.println("2 이상의 수를 입력하라");
				continue;
			}
				
			
		} catch (Exception e) {
			System.out.println("수량은 숫자로만 입력하라");
		}
			break;
	}
	int intPrice = 0;
	
	while(true) {
		System.out.print("단가 >> ");
		String strPrice = scan.nextLine();
		try {
			intPrice = Integer.valueOf(strPrice);
			if(intPrice < 1000) {
				System.out.println("1000원 이상 가격을 입력하라");
				continue;
			}
			
			
		} catch (Exception e) {
			System.out.println("수량은 숫자로만 입력하라");
		}
		break;
	}
	
	cartVO.setCartUserName(userName);
	cartVO.setCartPName(strPName);
	cartVO.setCartQty(intQty);
	cartVO.setCartPrice(intPrice);
	
	cartList.add(cartVO);
	
	
	
	}
	public void printCartList() {
		int nSize = cartList.size();
		for(int i = 0; i< nSize ; i++) {
			System.out.println("=================================");
			System.out.println("장바구니");
			System.out.println("---------------------------------");
			System.out.printf("%s\t%s\t%d\t%d\n", 
					cartList.get(i).getCartUserName(),
					cartList.get(i).getCartPName(),
					cartList.get(i).getCartQty(),
					cartList.get(i).getCartPrice());
		}
	}
	
}
