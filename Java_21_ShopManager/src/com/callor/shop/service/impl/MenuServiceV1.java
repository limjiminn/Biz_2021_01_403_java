package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceV1 implements MenuService{
	
	private Scanner scan;
	
	public MenuServiceV1() {
		scan = new Scanner(System.in);
	}
	@Override
	public String selectMenu() {
		
		while(true) {
			System.out.println("=====================================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("-------------------------------------");
			System.out.println("가. 장바구니 상품 담기");
			System.out.println("나. 장바구니 전체 리스트 보기");
			System.out.println("다. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("=====================================");
			System.out.print("");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				System.out.println("종료");
				break;
			}else {
				
			}
			
		}
		
		
		
		
		return null;
	}

}
