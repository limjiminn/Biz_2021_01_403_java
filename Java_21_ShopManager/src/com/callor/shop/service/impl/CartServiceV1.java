package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

// 장바구니에 담긴 상품의 리스트
public class CartServiceV1 implements CartService {

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

	// 가. 장바구니 상품 담기
	public void inputCart() {

		System.out.print("구매자 >> ");
		userName = scan.nextLine();

		System.out.print("상품명 >> ");
		productName = scan.nextLine();
		

		while (true) {
			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();
			try {
				price = Integer.valueOf(strPrice);
				if (price < 1000) {
					System.out.println("단가는 1000이상");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 정수로 입력해주세요");
			}
		}
		
		while (true) {
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			try {
				qty = Integer.valueOf(strQty);
				if (qty < 1) {
					System.out.println("수량은 1이상");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 정수로 입력해주세요");
			}
		}

		CartVO cartVO = new CartVO();
		cartVO.setUserName(userName);
		cartVO.setProductName(productName);
		cartVO.setPrice(price);
		cartVO.setQty(qty);
		cartVO.setTotal(price * qty);

		// cartList 저장
		cartList.add(cartVO);

	}

	// 나. 장바구니 전체 리스트 보기
	public void printCart() {
		int count = 0;
		int inTotal = 0;
		System.out.println("=====================================");
		System.out.println("*전체 장바구니 리스트");
		System.out.println("=====================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-------------------------------------");

		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n", 
					cartList.get(i).getUserName(),
					cartList.get(i).getProductName(),
					cartList.get(i).getQty(), 
					cartList.get(i).getPrice(), 
					cartList.get(i).getTotal());
			count++;
			inTotal += cartList.get(i).getTotal();
		}
		System.out.println("-------------------------------------");
		System.out.println("합계\t" + count + "가지\t\t\t " + inTotal);
		System.out.println("=====================================");

	}

	// 다. 구매자별 장바구니 리스트 보기
	public void userCart() {
		int count = 0;
		int inTotal = 0;
		System.out.print("구매자 >> ");
		String cosName = scan.nextLine();
		System.out.println("=====================================");
		System.out.println("*" + cosName + " 장바구니 리스트");
		System.out.println("=====================================");
		System.out.println("구매자\t상품명\t단가\t수량\t합계");
		System.out.println("-------------------------------------");

		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			if (cartList.get(i).getUserName().equals(cosName)) {
				System.out.printf("%s\t%s\t%d\t%d\t%d\n", 
						cartList.get(i).getUserName(),
						cartList.get(i).getProductName(),
						cartList.get(i).getQty(), 
						cartList.get(i).getPrice(),
						cartList.get(i).getTotal());
				count++;
				inTotal += cartList.get(i).getTotal();
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("합계\t" + count + "가지\t\t\t" + inTotal);
		System.out.println("=====================================");
	}
}
