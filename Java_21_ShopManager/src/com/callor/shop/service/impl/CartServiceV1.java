package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV1 implements CartService{
	private List<CartVO> cartList;
	private Scanner scan;
	
	private String userName;
	private String productName;
	private int price;
	private int qty;
	public CartServiceV1() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}
		
	@Override
	public void inputCart() {
		System.out.println("*전체 장바구니 리스트");
		System.out.println("==================================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("--------------------------------------------------");
		System.out.print("구매자 >> ");
		userName = scan.nextLine();
		
		System.out.print("상품명 >> ");
		productName = scan.nextLine();
		
		System.out.println("단가 >> ");
		String strPrice = scan.nextLine();
		price = Integer.valueOf(strPrice);
		
		System.out.println("수량 >> ");
		String strQty = scan.nextLine();
		qty = Integer.valueOf(strQty);
		
		CartVO cartVO = new CartVO();
		cartVO.setUserName(userName);
		cartVO.setProductName(productName);
		cartVO.setPrice(price);
		cartVO.setQty(qty);
		cartVO.setTotal(price * qty);
		
		cartList.add(cartVO);
		
	}
	
	public void userCart() {
		System.out.print("구매자 >> ");
		String cosName = scan.nextLine();
		System.out.println("*"+ userName + "장바구니 리스트");
		System.out.println("==================================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("--------------------------------------------------");
		if(userName.equals(cosName)) {
			
		}
		
	}

	@Override
	public void printCart() {
		
		int nSize = cartList.size();
		for(int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",
					cartList.get(i).getUserName(),
					cartList.get(i).getProductName(),
					cartList.get(i).getQty(),
					cartList.get(i).getPrice(),
					cartList.get(i).getTotal());
		}
		
	}

}
