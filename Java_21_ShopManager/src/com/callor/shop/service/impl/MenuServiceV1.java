package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceV1 implements MenuService {

	private Scanner scan;

	public MenuServiceV1() {
		scan = new Scanner(System.in);
	}

	// 메뉴를 보여주고 장바구니에 상품을 추가합니다.
	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println("=====================================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("-------------------------------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("=====================================");
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			
			if (strMenu.equalsIgnoreCase("QUIT")) {
				System.out.println("종료");
				break;
			}
			try {
				int intMenu = Integer.valueOf(strMenu);
				if(intMenu >= 1 && intMenu <= 3) {
					return intMenu ;
				}else {
					System.out.println("메뉴는 1 ~ 3 까지 선택가능");
				}
			} catch (Exception e) {
				System.out.println("메뉴선택은 QUIT, 1 ~ 3까지 정수만 가능");
			}

		}

		return null;
	}

}
