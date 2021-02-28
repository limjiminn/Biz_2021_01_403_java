package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV4 {

	public static void main(String[] args) {
		
		List<CartVO> cartList = new ArrayList<CartVO>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.println("===================================");
			System.out.println("쇼핑카트 상품 추가");
			System.out.println("-----------------------------------");

			System.out.print("구매자 >>");
			String strUerName = scan.nextLine();

			System.out.print("상품명 >> ");
			String strPName = scan.nextLine();
			// 유효성 검사
			// 1이상 정수
			/*
			 * 데이터를 키보드에서 입력받는 부분과 VO에 담아 리스트에 추가하는 부분을 분리하여 코딩할 경우 키보드에 입력한 값을 정수변환하여 값을
			 * 담아둘 intQty 변수를 while() 실행 이전에 선언해 두어야 한다.
			 */
			int intQty = 0;
			while (true) {
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
				break;

			}

			// 1000이상만 입력가능
			int intPrice = 0;
			while (true) {
				System.out.print("단가 >> ");
				String strPrice = scan.nextLine();
				try {
					intPrice = Integer.valueOf(strPrice);
					if (intPrice < 1000) {
						System.out.println("단가는 1000이상");
						continue;
					}
				} catch (Exception e) {
					System.out.println("수량은 숫자로 입력하세요");
					
				}
				break;

			}
			CartVO cartVO = new CartVO();
			cartVO.setCartUserName(strUerName);
			cartVO.setCartPName(strPName);
			cartVO.setCartPrice(intPrice);
			cartVO.setCartQty(intQty);

		} // end for

		System.out.println("====================================");
		System.out.println("구매자\t단품명\t단가\t수량");
		System.out.println("------------------------------------");

		int nSize = cartList.size(); // 갯수를 세서 변수에 저장
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n", 
					cartList.get(i).getCartUserName(),
					cartList.get(i).getCartPName(),
					cartList.get(i).getCartPrice(),
					cartList.get(i).getCartQty());
		}
		System.out.println("====================================");
	}

}
